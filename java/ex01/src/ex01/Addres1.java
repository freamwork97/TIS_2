package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Addres1 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        List<Student> array = new ArrayList<>();
        Student stu = new Student("20231", "홍길동", "인천 서구 경서동");
        array.add(stu);
        stu = new Student("20232", "심청이", "인천 부평구 계산동");
        array.add(stu);
        stu = new Student("20233", "강감찬", "서울 강서구 화곡동");
        array.add(stu);

        boolean run = true;

        while (run) {
            System.out.println("=========================================================");
            System.out.println("1.주소등록 2.주소목록 3.주소검색 4.주소수정 5.삭제 0.종료");
            System.out.println("=========================================================");
            System.out.print("메뉴 : ");
            String menu = sc.nextLine();

            switch (menu) {
                case "0":
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
                case "1":
                    stu = new Student();
                    stu.setSno("2023" + (array.size() + 1));
                    System.out.println("학번 : " + stu.getSno());

                    System.out.print("이름 : ");
                    stu.setSname(sc.nextLine());

                    System.out.print("주소 : ");
                    stu.setAddress(sc.nextLine());
                    array.add(stu);
                    System.out.println(array.size() + "명 등록완료");

                    break;
                case "2":
                    for (Student st : array) {
                        System.out.println(st.toString());
                    }
                    break;
                case "3":
                    System.out.print("검색할 이름 : ");
                    String s = sc.nextLine();
                    boolean find = false;
                    for (Student st : array) {
                        if (s.equals(st.getSname())) {
                            System.out.println(st.toString());
                            find = true;
                        }
                    }
                    if (!find) {
                        System.out.println(s + "학생 없음");
                    }
                    break;
                case "4":
                    System.out.print("수정할 이름 : ");
                    String u = sc.nextLine();
                    find = false;
                    for (Student st : array) {
                        if (u.equals(st.getSname())) {
                            find = true;
                            System.out.println("이름 : " + st.getSname());
                            System.out.println("주소 : " + st.getAddress());

                            System.out.print("새로운 주소 : ");
                            String newAdd = sc.nextLine();
                            if (newAdd != "") {
                                st.setAddress(newAdd);
                                System.out.println("새로운 주소로 수정");
                            }
                        }
                    }
                    if (!find) {
                        System.out.println(u + "학생 없음");
                    }
                    break;
                case "5":
                    System.out.print("삭제할 이름 : ");
                    String d = sc.nextLine();
                    find = false;
                    for (Student st : array) {
                        if (d.equals(st.getSname())) {
                            find = true;
                            array.remove(st);
                            System.out.println("삭제완료");
                            break;
                        }
                    }
                    if (!find) {
                        System.out.println(d + "학생 없음");
                    }
                    break;
                default:
                    System.out.println("다시 선택");
                    break;
            }
        }
    }

}
