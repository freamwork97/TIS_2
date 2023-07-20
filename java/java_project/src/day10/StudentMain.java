package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.println("=====학사관리시스템=====");
            System.out.println("1.학생등록 2.학생리스트 3.학생검색 0.종료");
            System.out.print("메뉴 : ");
            int menu = sc.nextInt();

            if (menu == 1) {
                Student s = new Student();
                System.out.print("학번 : ");
                s.setNo(sc.next());

                System.out.print("이름 : ");
                s.setName(sc.next());

                System.out.print("학과 : ");
                s.setDept(sc.next());

                System.out.print("학년 : ");
                s.setYear(sc.nextInt());

                System.out.println(s.getName() + "학생 등록완료");
                list.add(s);
            } else if (menu == 2) {
                System.out.println("학번\t이름\t학과\t학년");
                System.out.println("==========================");
                for (int i = 0; i < list.size(); i++) {
                    // System.out.printf("%s\t%s\t%s\t%d\n",
                    // list.get(i).getNo(), list.get(i).getName(),
                    // list.get(i).getDept(),list.get(i).getYear());
                    list.get(i).print();
                }
            } else if (menu == 3) {
                System.out.print("조회할 학번 : ");
                String searchNo = sc.next();
                System.out.println("학번\t이름\t학과\t학년");
                System.out.println("============================");
                for (int i = 0; i < list.size(); i++) {
                    if (searchNo.equals(list.get(i).getNo())) {
                        list.get(i).print();
                        break;
                    } else if (i == list.size() - 1) {
                        System.out.println("x");
                    }
                }
            } else if (menu == 0) {
                break;
            } else {
                System.out.println("다시입력");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
