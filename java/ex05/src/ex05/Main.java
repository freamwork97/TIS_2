package ex05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("\n\n******* 학생관리 *****************************");
            System.out.println("--------------------------------------------");
            System.out.println("1.입력 |2.조회 |3.목록 |4.수정 |5.삭제 |0.종료");
            System.out.println("--------------------------------------------");
            System.out.print("선택>");
            String menu = sc.nextLine();
            switch (menu) {
                case "0":
                    run = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                case "1":
                    StudentVO stu = new StudentVO();
                    stu.setSno(dao.getNo());
                    System.out.println("학번 : " + stu.getSno());
                    System.out.print("이름 : ");
                    stu.setSname(sc.nextLine());
                    stu.setDept("컴정");
                    System.out.println("학과 : " + stu.getDept());
                    stu.setBirthday("2000-01-02");
                    System.out.println("생일 : " + stu.getBirthday());
                    System.out.println(stu.toString());
                    dao.insert(stu);
                    break;
                case "2":
                    System.out.print("조회할 학번 : ");
                    String sno = sc.nextLine();
                    StudentVO stu2 = dao.read(sno);
                    if (stu2.getSno() == null) {
                        System.out.println(sno + "번 학생 없음");
                    } else {
                        System.out.println("이름 : " + stu2.getSname());
                        System.out.println("학과 : " + stu2.getDept());
                        System.out.println("생일 : " + stu2.getBirthday().substring(0, 10));
                        System.out.println("학년 : " + stu2.getYear());

                    }
                    break;
                case "3":
                    for (StudentVO vo : dao.list()) {
                        System.out.printf("%s\t%s\t%s\t%s\t%d\n",
                                vo.getSno(), vo.getSname(), vo.getDept(), vo.getBirthday().substring(0, 10),
                                vo.getYear());
                        // System.out.println(dao.toString());
                    }
                    break;
                case "4":
                    System.out.print("수정할 학번 : ");
                    String uno = sc.nextLine();
                    StudentVO stu4 = dao.read(uno);
                    if (stu4.getSno() == null) {
                        System.out.println(uno + "학생 없음");
                    } else {
                        System.out.print("이름 : " + stu4.getSname() + "->");
                        String newSname = sc.nextLine();
                        if (newSname != "")
                            stu4.setSname(newSname);

                        System.out.print("학과 : " + stu4.getDept() + "->");
                        String newDept = sc.nextLine();
                        if (newDept != "")
                            stu4.setDept(newDept);
                        stu4.setBirthday(stu4.getBirthday().substring(0, 10));
                        System.out.print("생일 : " + stu4.getBirthday() + "->");
                        String newBirthday = sc.nextLine();
                        if (newBirthday != "")
                            stu4.setBirthday(newBirthday);

                        System.out.print("학년 : " + stu4.getYear() + "->");
                        String newYear = sc.nextLine();
                        if (newYear != "")
                            stu4.setYear(Integer.parseInt(newYear));
                        System.out.println(stu4.toString());

                        System.out.println("수정하실래요(Y/y)");
                        String sel1 = sc.nextLine();
                        if (sel1.equals("y") || sel1.equals("Y") || sel1.equals("ㅛ")) {
                            dao.update(stu4);
                            System.out.println("수정완료");
                        }
                    }
                    break;
                case "5":
                    System.out.print("삭제할 학번 : ");
                    String dno = sc.nextLine();
                    StudentVO stu3 = dao.read(dno);
                    if (stu3.getSno() == null) {
                        System.out.println(dno + "학생 없음");
                    } else {
                        System.out.println(stu3.toString());
                        System.out.print("삭제?(Y/y)");
                        String sel = sc.nextLine();
                        if (sel.equals("y") || sel.equals("Y") || sel.equals("ㅛ")) {
                            dao.delete(dno);
                            System.out.println("삭제완료");
                        }
                    }
                    break;
                default:
                    System.out.println("메뉴를 다시선택하세요!");
            }// switch
        } // while
    }// main
}// main