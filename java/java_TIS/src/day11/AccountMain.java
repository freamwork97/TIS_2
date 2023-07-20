package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Account> list = new ArrayList<Account>();

        while (true) {
            System.out.println("=====인천일보은행=====");
            System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 5.계좌이체 0.종료");
            System.out.print("메뉴선택 : ");
            int menu = sc.nextInt();
            boolean run = true;
            if (menu == 1) {
                Account a = new Account();
                System.out.print("이름 : ");
                a.setName(sc.next());
                System.out.print("계좌번호 : ");
                a.setAccount(sc.next());
                System.out.print("초기잔액 : ");
                a.setBalance(sc.nextInt());

                list.add(a);
                System.out.println("계좌생성");
            } else if (menu == 2) {
                while (run) {
                    System.out.print("입금할 계좌 : ");
                    String acc = sc.next();
                    boolean find = false;
                    for (Account a : list) {
                        if (acc.equals(a.getAccount())) {
                            System.out.print("입금금액 : ");
                            int bal = sc.nextInt();
                            a.deposit(bal);
                            System.out.printf("%,d원 입금되었습니다\n", bal);
                            find = true;
                            run = false;
                        }
                    }
                    if (!find) {
                        System.out.println("없는 계좌");
                    }
                }
            } else if (menu == 3) {
                while (run) {
                    System.out.print("출금할 계좌 : ");
                    String acc = sc.next();
                    boolean find = false;
                    for (Account a : list) {
                        if (acc.equals(a.getAccount())) {
                            System.out.print("출금금액 : ");
                            int bal = sc.nextInt();
                            if (a.withdraw(bal)) {
                                System.out.printf("%,d원 출금되었습니다\n", bal);
                                find = true;
                                run = false;
                                break;
                            } else {
                                System.out.println("잔액부족");
                                find = true;
                            }
                        }
                    }
                    if (!find) {
                        System.out.println("없는 계좌");
                    }
                }
            } else if (menu == 4) {
                System.out.println("이름\t계좌번호\t잔액\t가입일");
                System.out.println("==============================");
                for (Account a : list) {
                    a.print();
                }
            } else if (menu == 5) {
                System.out.print("보낼 계좌 : ");
                String outacc = sc.next();
                boolean find = false;
                for (Account a : list) {
                    if (outacc.equals(a.getAccount())) {
                        System.out.print("받을 계좌 : ");
                        String inacc = sc.next();
                        for (Account b : list) {
                            if (inacc.equals(b.getAccount())) {
                                System.out.print("이체할 금액 : ");
                                int bal = sc.nextInt();
                                if (a.withdraw(bal)) {
                                    b.deposit(bal);
                                    find = true;
                                    System.out.printf("%,d원 이체되었습니다\n", bal);
                                }

                            }

                        }

                    }
                }
                if (!find) {
                    System.out.println("이체실패");
                }
            } else if (menu == 0) {
                break;
            } else {
                System.out.println("다시선택");
            }

        }

    }
}
