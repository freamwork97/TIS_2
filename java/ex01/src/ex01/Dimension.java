package ex01;

import java.util.Scanner;

public class Dimension {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[22];
        String[] addres = new String[22];
        int cnt = 0;
        boolean run = true;
        while (run) {

            System.out.println("==========================");
            System.out.println("1.주소등록 2.주소목록 0.종료");
            System.out.println("==========================");
            System.out.print("메뉴 : ");
            String menu = sc.nextLine();

            // if (menu.equals("1")) {
            // System.out.print("이름 : ");
            // name[cnt] = sc.nextLine();
            // System.out.print("주소 : ");
            // addres[cnt] = sc.nextLine();

            // cnt++;
            // } else if (menu.equals("2")) {
            // for (int i = 0; i < cnt; i++) {
            // System.out.printf("%s\t%s\n", name[i], addres[i]);
            // }
            // } else if (menu.equals("0")) {
            // run = false;
            // } else {
            // System.out.println("다시선택");
            // }
            switch (menu) {
                case "0":
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
                case "1":
                    System.out.print("이름 : ");
                    name[cnt] = sc.nextLine();
                    System.out.print("주소 : ");
                    addres[cnt] = sc.nextLine();
                    cnt++;
                    break;
                case "2":
                    for (int i = 0; i < cnt; i++) {
                        System.out.printf("%s\t%s\n", name[i], addres[i]);
                    }
                    break;
                default:
                    System.out.println("다시선택");
            }
        }
    }
}
