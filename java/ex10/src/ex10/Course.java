package ex10;

import java.util.*;
import java.text.*;

public class Course {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        CourseDAO cdao = new CourseDAO();
        EnrolDAO edao = new EnrolDAO();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean run = true;
        while (run) {
            System.out.println("\n\n******* 강좌관리 *****************************");
            System.out.println("----------------------------------------------");
            System.out.println("1.강좌목록 |2.강좌조회 |3.강좌등록 |0.메인메뉴");
            System.out.println("----------------------------------------------");
            System.out.print("선택>");
            String menu = sc.nextLine();
            switch (menu) {
                case "0":
                    run = false;
                    System.out.println("메인메뉴로 이동");
                    break;
                case "1":
                    List<CourseVO> array = cdao.list();
                    System.out.println("강좌코드\t강좌명");
                    for (CourseVO vo : array) {
                        System.out.printf("%s\t%s\n",
                                vo.getCcode(), vo.getCname());
                    }
                    System.out.println(array.size() + "개 강좌가 있습니다.");
                    break;
                case "2":
                    while (true) {
                        System.out.print("\n조회할 강좌 : ");
                        String ccode = sc.nextLine();
                        if (ccode == "") {
                            System.out.println("조회 취소");
                            break;
                        } else {
                            CourseVO vo = cdao.read(ccode);
                            if (vo.getCname() == null) {
                                System.out.println("강좌X");
                            } else {
                                System.out.println("이름 : " + vo.getCname());
                                System.out.println("------------------------------");
                                List<EnrolVO> sarray = edao.slist(ccode);
                                if (sarray.size() == 0) {
                                    System.out.println("학생신청내역X");
                                } else {
                                    // System.out.println("학번\t이름\t점수\t신청날");
                                    for (EnrolVO v : sarray) {
                                        System.out.printf("%s\t%s\t%d\t%s\n",
                                                v.getScode(), v.getSname(),
                                                v.getGrade(), sdf.format(v.getEdate()));
                                    }
                                }
                            }
                        }
                    }
                    break;
                case "3":
                    CourseVO vo = new CourseVO();
                    vo.setCcode(cdao.getCode());
                    System.out.println("강좌코드 : " + vo.getCcode());
                    System.out.print("강좌명 : ");
                    String cname = sc.nextLine();
                    if (cname == "") {
                        System.out.println("등록취소");
                    } else {
                        vo.setCname(cname);
                        cdao.insert(vo);
                        System.out.println("새로운강좌등록완료");
                    }
                    break;
                default:
                    System.out.println("다시선택");
                    break;
            }
        }
    }
}
