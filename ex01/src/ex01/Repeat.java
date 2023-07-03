package ex01;

import java.util.Scanner;

public class Repeat {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("======================================================");
            System.out.println("1.100까지의 합 2.100까지 짝수합 3.100까지 홀수합 0.종료");
            System.out.println("======================================================");
            System.out.print("선택 : ");
            String menu = sc.nextLine();
            int sum = 0;
            // if (menu.equals("1")) {
            // for (int i = 1; i < 101; i++) {
            // sum += i;
            // }
            // System.out.println(sum);
            // } else if (menu.equals("2")) {
            // for (int i = 1; i < 101; i++) {
            // if (i % 2 == 0) {
            // sum += i;
            // }
            // }
            // System.out.println(sum);

            // } else if (menu.equals("3")) {
            // for (int i = 1; i < 101; i++) {
            // if (i % 2 != 0) {
            // sum += i;
            // }
            // }
            // System.out.println(sum);

            // } else if (menu.equals("0")) {
            // run = false;
            // }

            switch (menu) {
                case "0":
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
                case "1":
                    for (int i = 1; i < 101; i++) {
                        sum += i;
                    }
                    System.out.println(sum);
                    break;
                case "2":
                    for (int i = 1; i < 101; i++) {
                        if (i % 2 == 0) {
                            sum += i;
                        }
                    }
                    System.out.println(sum);
                    break;
                case "3":
                    for (int i = 1; i < 101; i++) {
                        if (i % 2 != 0) {
                            sum += i;
                        }
                    }
                    System.out.println(sum);
                    break;
                default:
                    System.out.println("다시선택");
            }
        }
    }
}
