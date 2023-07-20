package day05;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int menu = 0;
		int balance = 10000;
		while(run) {
			System.out.printf("=====자판기=====잔액[%,d원]\n",balance);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.충전 0.종료");
			System.out.print("메뉴선택 : ");
			menu = sc.nextInt();
			if(menu==1) {
				if(balance >=1000) {
					System.out.println("콜라선택");
					balance -=1000;
				}
				else {
					System.out.println("잔액부족");
				}
				
			}
			else if(menu==2) {
				if(balance >=1200) {
					System.out.println("사이다선택");
					balance -=1200;
				}
				else {
					System.out.println("잔액부족");
				}
				
			}
			else if(menu==3) {
				if(balance >=1500) {
					System.out.println("우유선택");
					balance -=1500;
				}
				else {
					System.out.println("잔액부족");
				}
				
			}
			else if(menu==4) {
				System.out.print("충전할 금액 : ");
				balance += sc.nextInt();
				System.out.println(balance+"원 충전");
			}
			else if(menu==0) {
				System.out.println("종료");
				run = false;
			}
			else {
				System.out.println("다시선택");
			}
			System.out.println();
		}
	}

}
