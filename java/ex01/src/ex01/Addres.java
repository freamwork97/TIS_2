package ex01;

import java.util.Scanner;

public class Addres {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        boolean run = true;
        int cnt = 0;
        while (run) {
            System.out.println("==================================================");
            System.out.println("1.주소등록 2.주소목록 3.주소검색 4.주소수정 0.종료");
            System.out.println("==================================================");
            System.out.print("메뉴 : ");
            String menu = sc.nextLine();

            switch (menu) {
                case "0":
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
                case "1":
                    Student student = new Student();
                    System.out.print("학번 : ");
                    student.setSno("2023" + cnt + 1);
                    System.out.println(student.getSno());
                    System.out.print("이름 : ");
                    student.setSname(sc.nextLine());

                    System.out.print("주소 : ");
                    student.setAddress(sc.nextLine());

                    System.out.print("학과 : ");
                    student.setDept(sc.nextLine());

                    System.out.println(student.toString());
                    students[cnt] = student;
                    cnt++;
                    break;
                case "2":
                    for (int i = 0; i < cnt; i++) {
                        // System.out.println(students[i].toString());
                        Student stu = students[i];
                        System.out.println(stu.toString());
                    }
                    break;
                case "3":
                    System.out.print("검색할 이름 : ");
                    String s = sc.nextLine();
                    boolean find = false;
                    for (int i = 0; i < cnt; i++) {
                        if (s.equals(students[i].getSname())) {
                            System.out.println(students[i].toString());
                            find = true;
                        }
                    }
                    if (!find) {
                        System.out.println(s + "학생 없음");
                    }
                    break;
                case "4":
                    System.out.print("수정할 이름 : ");
                    s = sc.nextLine();
                    find = false;
                    for (int i = 0; i < cnt; i++) {
                        if (s.equals(students[i].getSname())) {
                            System.out.println("이름 : " + students[i].getSname());
                            System.out.println("현재 주소 : " + students[i].getAddress());
                            System.out.print("새로운주소 : ");
                            String newAddress = sc.nextLine();
                            if (newAddress != "") {
                                students[i].setAddress(newAddress);
                                System.out.println("새로운 주소로 변경");
                                find = true;
                            }
                        }
                    }
                    if (!find) {
                        System.out.println(s + "학생 없음");
                    }
                    break;
                default:
                    System.out.println("다시선택");
            }
        }

    }
}
