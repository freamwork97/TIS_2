package ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juso {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        List<Student> array = new ArrayList<Student>();
        Student stu = new Student(10, "홍길동", "인천", "010-1010-1010");
        array.add(stu);
        Student stu2 = new Student(11, "심청이", "서울", "010-1010-2020");
        array.add(stu2);
        Student stu3 = new Student(12, "강감찬", "부산", "010-1010-3030");
        array.add(stu3);
        int cnt = 12;
        while (run) {
            System.out.println("===========================================");
            System.out.println("1.등록 2. 목록 3.조회 4.수정 5. 삭제 0.종료");
            System.out.println("===========================================");
            System.out.print("메뉴선택 : ");
            String menu = sc.nextLine();
            switch (menu) {
                case "1":
                    Student newStu = new Student();
                    newStu.setNo(++cnt);
                    System.out.println("학번 : " + newStu.getNo());
                    System.out.print("이름 : ");
                    newStu.setName(sc.nextLine());
                    System.out.print("주소 : ");
                    newStu.setJuso(sc.nextLine());
                    System.out.print("번호 : ");
                    newStu.setPhone(sc.nextLine());
                    array.add(newStu);
                    System.out.println("전체학생수 : " + array.size());
                    break;

                case "2":
                    for (Student vo : array) {
                        // System.out.println(vo.toString());
                        System.out.printf("%d\t%s\t%s\t%s\n",
                                vo.getNo(), vo.getName(), vo.getJuso(), vo.getPhone());
                    }
                    System.out.println(array.size() + "명이 있습니다.");
                    break;
                case "3":
                    System.out.print("조회할 학번 : ");
                    String s = sc.nextLine();
                    boolean find = false;
                    for (Student vo : array) {
                        if (vo.getNo() == Integer.parseInt(s)) {
                            System.out.printf("%d\t%s\t%s\t%s\n",
                                    vo.getNo(), vo.getName(), vo.getJuso(), vo.getPhone());
                            find = true;
                        }
                    }
                    if (!find) {
                        System.out.println(s + "없음");
                    }
                    break;
                case "4":
                    System.out.print("수정할 학번 : ");
                    String u = sc.nextLine();
                    find = false;
                    for (Student vo : array) {
                        if (vo.getNo() == Integer.parseInt(u)) {
                            System.out.print("이름 : " + vo.getName() + "->");
                            String newName = sc.nextLine();
                            if (newName != "")
                                vo.setName(newName);
                            System.out.print("주소 : " + vo.getJuso() + "->");
                            String newJuso = sc.nextLine();
                            if (newJuso != "")
                                vo.setJuso(newJuso);
                            System.out.print("번호 : " + vo.getPhone() + "->");
                            String newPhone = sc.nextLine();
                            if (newPhone != "")
                                vo.setPhone(newPhone);
                            System.out.println(vo.toString());
                            find = true;
                        }
                    }
                    if (!find) {
                        System.out.println(u + "학생없음");
                    }
                    break;
                case "5":
                    System.out.print("삭제할 학번 : ");
                    String d = sc.nextLine();
                    find = false;
                    for (Student vo : array) {
                        if (vo.getNo() == Integer.parseInt(d)) {
                            array.remove(vo);
                            System.out.println(vo.getName() + "학생 삭제");
                            find = true;
                            break;
                        }
                    }
                    if (!find) {
                        System.out.println(d + "학생 없음");
                    }
                    break;
                case "0":
                    run = false;
                    System.out.println("프로그램 종료");
                    break;

                default:
                    System.out.println("다시선택");
                    break;
            }
        }
    }
}
