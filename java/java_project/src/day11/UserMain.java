package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<User> list = new ArrayList<User>();

        while (true) {
            System.out.println("=====회원가입시스템=====");
            System.out.println("1.회원가입 2.로그인 3.멤버리스트 0.종료");
            System.out.print("메뉴선택 : ");
            int menu = sc.nextInt();

            if (menu == 1) {
                // System.out.print("이름 : ");
                // String name = sc.next();
                // System.out.print("아이디 : ");
                // String id = sc.next();
                // System.out.print("비밀번호 : ");
                // String pw = sc.next();

                // User u = new User(name, id, pw);
                User u = new User();
                System.out.print("이름 : ");
                u.setName(sc.next());
                System.out.print("아이디 : ");
                u.setId(sc.next());
                System.out.print("비밀번호 :");
                u.setPw(sc.next());
                list.add(u);
                System.out.println(u.getName() + "님 회원가입 성공");
            } else if (menu == 2) {
                // System.out.print("아이디 : ");
                // String lid = sc.next();
                // System.out.print("비밀번호 : ");
                // String lpw = sc.next();
                // for (int i = 0; i < list.size(); i++) {
                // if (lid.equals(list.get(i).getId()) && lpw.equals(list.get(i).getPw())) {
                // System.out.println("로그인성공");
                // break;
                // } else if (i == list.size() - 1) {
                // System.out.println("로그인실패");
                // }
                // }
                System.out.print("아이디 : ");
                String lid = sc.next();
                System.out.print("비밀번호 : ");
                String lpw = sc.next();
                boolean find = false;
                for (int i = 0; i < list.size(); i++) {
                    if (lid.equals(list.get(i).getId()) && lpw.equals(list.get(i).getPw())) {
                        System.out.println("로그인성공");
                        find = true;
                        break;
                    }
                }
                if (!find) {
                    System.out.println("로그인실패");
                }
            } else if (menu == 3) {
                System.out.println("멤버리스트");
                System.out.println("이름\t아이디\t비밀번호\t가입날짜");
                System.out.println("================================");
                for (int i = 0; i < list.size(); i++) {
                    list.get(i).print();
                }
            } else if (menu == 0) {
                break;
            } else {
                System.out.println("다시선택");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}