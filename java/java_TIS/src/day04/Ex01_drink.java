package day04;

import java.util.Scanner;

public class Ex01_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		boolean run = true;
		while(run) {
			System.out.printf("=====자판기===== %,d원\n",balance);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.충전 0.종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			
			// 콜라선택 or 사이다선택 or 우유선택 or 반복문종료시키기
			if(menu ==1) {
				if(balance>=1000) {
					System.out.println("콜라선택");
					balance -= 1000;
				}else {
					System.out.println("잔액부족");
				}
			}
			else if(menu ==2) {
				if(balance>=1200) {
					System.out.println("사이다선택");
					balance -= 1200;
				}
				else {
					System.out.println("잔액부족");
				}
				
			}
			else if(menu ==3) {
				if(balance>=1500) {
					System.out.println("우유선택");
					balance -= 1500;
				}
				else {
					System.out.println("잔액부족");
				}
				
			}
			else if(menu ==4) {
				System.out.print("충전할 금액 : ");
				balance += sc.nextInt();
			}
			else if(menu ==0) {
				run = false;
			}
			else {
				System.out.println("다시 선택");
			}
			System.out.println();
		}
		System.out.println("종료");
	}

}
