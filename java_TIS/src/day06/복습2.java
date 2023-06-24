package day06;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		boolean run = true;
		int menu=0;
		int balance=10000;
		int a=0;
		while(run) {
			System.out.printf("=====자판기=====[%,d원]\n",balance);
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
					balance -= 1200;
				}
				else {
					System.out.println("잔액부족");
				}
				
			}
			else if(menu==3) {
				if(balance >=1500) {
					System.out.println("우유선택");
					balance -= 1500;
				}
				else {
					System.out.println("잔액부족");
				}
			}
			else if(menu==4) {
				System.out.print("얼마를 충전하겠습니까? : ");
				a=sc.nextInt();
				if(a>0) {
					balance += a;
					System.out.println("충전되었습니다.");
				}
				else {
					System.out.println("충전이 불가능합니다.");
				}
				
			}
			else if(menu==0) {
				run =false;
			}
			else {
				System.out.println("다시선택");
			}
			System.out.println();
		}
		System.out.println("프로그램종료");
	}

}
