package ex10;

import java.util.*;
import java.text.*;

public class Enrol {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        StudentDAO sdao = new StudentDAO();
        EnrolDAO edao = new EnrolDAO();
        CourseDAO cdao = new CourseDAO();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean run = true;
        while (run) {
            System.out.println("\n\n******* 수강관리 *****************************************");
            System.out.println("----------------------------------------------------------");
            System.out.println("1.수강목록 |2.수강신청 |3.수강취소 |4.성적등록 |0.메인메뉴");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택>");
            String menu = sc.nextLine();
            switch (menu) {
                case "0":
                    run = false;
                    System.out.println("메인메뉴로 이동");
                    break;
                case "1":
                    System.out.println("학번\t이름\t과목코드\t과목\t점수\t날짜");
                    for (EnrolVO vo : edao.list()) {
                        System.out.printf("%s\t%s\t%s\t%s\t%d\t%s\n",
                                vo.getScode(), vo.getSname(),
                                vo.getCcode(), vo.getCname(),
                                vo.getGrade(), sdf.format(vo.getEdate()));
                    }
                    break;
                case "2":
                    System.out.print("조회할 학번 : ");
                    String scode = sc.nextLine();
                    if (scode == "") {
                        System.out.println("수강신청 취소");
                    } else {
                        StudentVO svo = sdao.read(scode);
                        if (svo.getSname() == null) {
                            System.out.println("해당학생X");
                        } else {
                            System.out.printf("%s(%s)\n", svo.getSname(), svo.getDept());
                            while (true) { // 수강신청목록
                                System.out.println("--------------------------------------------------------------");
                                List<EnrolVO> carray = edao.clist(scode);
                                if (carray.size() == 0) {
                                    System.out.println("수강신청 내역X");
                                } else {
                                    for (EnrolVO v : carray) {
                                        System.out.printf("%s:%s|",
                                                v.getCcode(), v.getCname());
                                    }
                                }
                                // 수강신청할목록
                                System.out.println("\n--------------------------------------------------------------");
                                List<CourseVO> aarray = cdao.list();
                                for (CourseVO v : aarray) {
                                    System.out.printf("%s:%s|",
                                            v.getCcode(), v.getCname());
                                }
                                System.out.println("\n--------------------------------------------------------------");
                                System.out.print("과목코드 : ");
                                String ccode = sc.nextLine();
                                if (ccode == "") {
                                    System.out.println("수강신청 취소");
                                    break;
                                }
                                EnrolVO vo = edao.read(scode, ccode);
                                if (vo.getSname() != null) {
                                    System.out.println("이미 수강 신청 했습니다.");
                                } else {
                                    CourseVO cvo = cdao.read(ccode);
                                    if (cvo.getCname() == null) {
                                        System.out.println("해당 강좌 없습니다.");
                                    } else {
                                        // 수강신청
                                        edao.insert(ccode, scode);
                                    }
                                }
                            }

                        }
                    }
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("다시선택");
                    break;
            }

        }
    }
}
