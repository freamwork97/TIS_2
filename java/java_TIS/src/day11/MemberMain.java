package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Member> list = new ArrayList<Member>();
        Long id = 100l;

        while (true) {
            System.out.println("1.멤버등록 2.멤버리스트 3.멤버검색 0.종료");
            System.out.print("메뉴선택 : ");
            int menu = sc.nextInt();
            if (menu == 1) {

                System.out.print("이메일 : ");
                String enmail = sc.next();
                System.out.print("비밀번호 :");
                String pw = sc.next();
                System.out.print("이름 : ");
                String name = sc.next();

                Member m = new Member(id++, enmail, pw, name);
                System.out.println(name + "님 멤버가입 성공");
                list.add(m);
            } else if (menu == 2) {
                System.out.println("no\t이메일\t비밀번호\t이름\t가입날짜");
                System.out.println("=============================");
                // for (int i = 0; i < list.size(); i++) {
                // list.get(i).print();
                // }
                for (Member m : list) { // 향상된for문 or foreach
                    m.print();
                }
            } else if (menu == 3) {
                System.out.print("검색할 아이디 : ");
                Long sId = sc.nextLong();
                System.out.println("no\t이메일\t비밀번호\t이름\t가입날짜");
                System.out.println("==============================");
                // for (int i = 0; i < list.size(); i++) {
                // if (sId == list.get(i).getId()) {
                // list.get(i).print();
                // }
                // }
                boolean find = false;
                for (Member m : list) {
                    if (sId == m.getId()) {
                        m.print();
                        find = true;
                        break;
                    }
                }
                if (!find) {
                    System.out.println("없는 아이디입니다.");
                }

            } else if (menu == 0) {
                break;
            } else {
                System.out.println("다시선택");
            }
        }
        System.out.println("프로그램종료");
    }
}
