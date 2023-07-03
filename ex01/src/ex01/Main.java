package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Dimension.run();
		boolean run = true;
		while (run) {
			System.out.println("==================================================");
			System.out.println("1.타입 2.연산자 3.조건문 4.배열 5.주소관리 0.종료");
			System.out.println("==================================================");
			System.out.print("선택 : ");
			String menu = sc.nextLine();
			switch (menu) {
				case "1":
					TypeSample.run();

					break;
				case "2":
					Operation.run();

					break;
				case "3":
					Condition.run();

					break;
				case "4":
					Repeat.run();

					break;
				case "5":
					// Addres.run();
					Addres1.run();
					break;
				case "0":
					run = false;
					System.out.println("프로그램 종료");
					break;
				default:
					System.out.println("다시입력");
			}
		}

	}

}
