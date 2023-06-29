package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<User> list = new ArrayList<User>();

        while (true) {
            System.out.println("회원시스템");
            System.out.println("1.회원가입 2.로그인 3.리스트 0.종료");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.print("이름 : ");
                String name = sc.next();
                System.out.print("아이디 : ");
                String id = sc.next();
                System.out.print("비밀번호 : ");
                String pw = sc.next();

                User u = new User(name, id, pw);
                list.add(u);
            } else if (menu == 2) {
                System.out.print("아이디 : ");
                String lid = sc.next();
                System.out.print("비밀번호 : ");
                String lpw = sc.next();

                for (int i = 0; i < list.size(); i++) {
                    if (lid.equals(list.get(i).getId()) && lpw.equals(list.get(i).getPw())) {
                        System.out.println("로그인 성공");
                        break;
                    } else if (i == list.size() - 1) {
                        System.out.println("로그인 실패");
                    }
                }
            } else if (menu == 3) {
                System.out.println("멤버리스트");
                System.out.println("이름\t아이디\t비밀번호");
                System.out.println("========================");
                for (int i = 0; i < list.size(); i++) {
                    list.get(i).print();
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
