package ex10;

import java.util.*;
import java.text.*;

public class Student {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        StudentDAO sdao = new StudentDAO();
        EnrolDAO edao = new EnrolDAO();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean run = true;
        while (run) {
            System.out.println("\n\n******* 학생관리 *****************************");
            System.out.println("----------------------------------------------");
            System.out.println("1.학생목록 |2.학생조회 |3.학생등록 |0.메인메뉴");
            System.out.println("----------------------------------------------");
            System.out.print("선택>");
            String menu = sc.nextLine();
            switch (menu) {
                case "0":
                    run = false;
                    System.out.println("메인메뉴로 이동");
                    break;
                case "1":
                    List<StudentVO> array = sdao.list();
                    System.out.println("학번\t이름\t학과");
                    for (StudentVO vo : array) {
                        System.out.printf("%s\t%s\t%s\n",
                                vo.getScode(), vo.getSname(), vo.getDept());
                    }
                    System.out.println(array.size() + "명 있습니다.");
                    break;
                case "2":
                    while (true) {
                        System.out.print("\n조회할 학번 : ");
                        String scode = sc.nextLine();
                        if (scode == "") {
                            System.out.println("조회 취소");
                            break;
                        } else {
                            StudentVO vo = sdao.read(scode);
                            if (vo.getSname() == null) {
                                System.out.println("학생X");
                            } else {
                                System.out.println("이름 : " + vo.getSname());
                                System.out.println("학과 : " + vo.getDept());
                                System.out.println("-----------------------------------");
                                // 수강신청한강좌목록
                                List<EnrolVO> carray = edao.clist(scode);
                                if (carray.size() == 0) {
                                    System.out.println("수강신청내역X");
                                } else {
                                    // System.out.println("과목코드\t과목명\t점수\t신청날");
                                    for (EnrolVO v : carray) {
                                        System.out.printf("%s\t%s\t%d\t%s\n",
                                                v.getCcode(), v.getCname(),
                                                v.getGrade(), sdf.format(v.getEdate()));
                                    }
                                }
                            }
                        }
                    }
                    break;
                case "3":
                    StudentVO vo = new StudentVO();
                    vo.setScode(sdao.getCode());
                    System.out.println("학번 : " + vo.getScode());
                    System.out.print("이름 : ");
                    String sname = sc.nextLine();
                    if (sname == "") {
                        System.out.println("등록취소");
                    } else {
                        System.out.print("학과 : ");
                        String dept = sc.nextLine();
                        if (dept == "") {
                            System.out.println("등록 취소");
                        } else {
                            vo.setSname(sname);
                            vo.setDept(dept);
                            sdao.insert(vo);
                            System.out.println("새로운학생등록완료");
                        }
                    }
                    break;
                default:
                    System.out.println("다시선택");
                    break;
            }
        }
    }
}
