package ex08;

import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountDAO adao = new AccountDAO();
        DetailDAO ddao = new DetailDAO();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        DecimalFormat df = new DecimalFormat("#,###원");
        boolean run = true;
        while (run) {
            System.out.println("\n\n******* 계좌관리 *****************************");
            System.out.println("--------------------------------------------");
            System.out.println("1.계좌생성 |2.계좌조회 |3.입금 |4.출금 |5.계좌목록 |0.종료");
            System.out.println("--------------------------------------------");
            System.out.print("선택>");
            String menu = sc.nextLine();
            switch (menu) {
                case "0":
                    run = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                case "1":
                    System.out.print("계좌주명 : ");
                    String name = sc.nextLine();
                    if (name == "")
                        break;
                    AccountVO acc = new AccountVO();
                    acc.setAname(name);
                    int bal = input("초기입금액");
                    if (bal == 0)
                        break;
                    acc.setBalance(bal);
                    // System.out.println(acc.toString());
                    System.out.println("새로운 계좌 생성?(Y/y)");
                    String sel = sc.nextLine();
                    if (sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
                        int newano = adao.insert(acc);
                        DetailVO dvo = new DetailVO();

                        dvo.setAno(newano);
                        dvo.setAmount(bal);
                        dvo.setType("입금");
                        ddao.insert(dvo);

                        System.out.println(newano + "번 새로운 계좌 생성 완료");
                    }
                    break;
                case "2":
                    while (true) {
                        int ano = input("\n조회할 계좌번호");
                        if (ano == 0) {
                            System.out.println("조회 종료");
                            break;
                        } else {
                            try {
                                AccountVO vo = adao.read(ano);
                                if (vo.getAname() == null) {
                                    System.out.println("계좌X");
                                } else {
                                    System.out.println("계좌주 : " + vo.getAname());
                                    System.out.println("잔액 : " + df.format(vo.getBalance()));
                                    System.out.println("계좌번호 : " + vo.getAno());
                                    System.out.println("========================================================");
                                    System.out.println("거래번호\t금액\t입출금\t날짜");
                                    System.out.println("========================================================");
                                    for (DetailVO v : ddao.list(ano)) {
                                        System.out.printf("%d\t%s\t%s\t%s\n",
                                                v.getDno(),
                                                df.format(v.getAmount()),
                                                v.getType(),
                                                sdf.format(v.getDdate()));
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println("계좌조회오류 : " + e.toString());
                            }
                        }
                    }
                    break;
                case "3":
                    int ano = input("입금계좌번호");
                    if (ano == 0) {
                        System.out.println("입금 취소");
                    } else {
                        try {
                            AccountVO acc1 = adao.read(ano);
                            if (acc1.getAname() == null) {
                                System.out.println("계좌 X");
                            } else {
                                System.out.println("계좌주 : " + acc1.getAname());
                                System.out.println("잔액 : " + df.format(acc1.getBalance()));
                                int amount = input("입금금액");
                                if (amount == 0) {
                                    System.out.println("입금 취소");
                                } else {
                                    acc1.setBalance(acc1.getBalance() + amount);
                                    adao.update(acc1);
                                    DetailVO dvo = new DetailVO();
                                    dvo.setAno(ano);
                                    dvo.setType("입금");
                                    dvo.setAmount(amount);
                                    ddao.insert(dvo);
                                    System.out.println("입금 완료");
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("조회 오류" + e.toString());
                        }
                    }
                    break;
                case "4":
                    ano = input("출금계좌번호");
                    if (ano == 0) {
                        System.out.println("출금 취소");
                    } else {
                        try {
                            AccountVO acc2 = adao.read(ano);
                            if (acc2.getAname() == null) {
                                System.out.println("계좌X");
                            } else {
                                System.out.println("계좌주 : " + acc2.getAname());
                                System.out.println("잔액 : " + df.format(acc2.getBalance()));
                                boolean repeat = true;
                                int amount = 0;
                                while (repeat) {
                                    amount = input("출금금액");
                                    if (amount == 0) {
                                        System.out.println("출금 취소");
                                        repeat = false;
                                    } else if (acc2.getBalance() < amount) {
                                        System.out.println("잔액이 부족합니다.");
                                    } else {
                                        acc2.setBalance(acc2.getBalance() - amount);
                                        adao.update(acc2);

                                        DetailVO dvo2 = new DetailVO();
                                        dvo2.setAno(ano);
                                        dvo2.setType("출금");
                                        dvo2.setAmount(amount);
                                        ddao.insert(dvo2);
                                        System.out.println("출금 완료");
                                        repeat = false;
                                    }
                                }
                            }

                        } catch (Exception e) {
                            System.out.println("조회 오류" + e.toString());

                        }
                    }
                    break;
                case "5":
                    System.out.println("계좌번호\t계좌주명\t금액");
                    for (AccountVO vo : adao.list()) {
                        System.out.printf("%d\t%s\t%s\n",
                                vo.getAno(),
                                vo.getAname(),
                                df.format(vo.getBalance()));
                    }
                    break;
                default:
                    System.out.println("메뉴 다시 선택");
                    break;
            }
        }

    }

    public static int input(String title) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(title + ">");
            try {
                String str = sc.nextLine();
                if (str == "") {
                    return 0;
                } else {
                    return Integer.parseInt(str);
                }
            } catch (Exception e) {
                System.out.println("숫자로 입력해주세요");
            }
        }
    }
}
