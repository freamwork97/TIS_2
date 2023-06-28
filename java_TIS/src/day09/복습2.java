package day09;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int balance = 10000; //잔액
		int c = 1000; // 콜라 가격
		int s = 1200; // 사이다 가격
		int m = 1500; // 우유 가격
		
		while(run) {
			System.out.printf("자판기 [%,d원]\n",balance);
			System.out.printf("1.콜라(%,d원) 2.사이다(%,d원) 3.우유(%,d원) 4.충전 0.종료\n",c,s,m);
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			if(menu==1) {
				if(balance>=c) {
					balance -=c;
					System.out.println("콜라선택");
				}
				else {
					System.out.println("잔액부족");
				}
			}
			else if(menu==2) {
				if(balance>=s) {
					balance -=s;
					System.out.println("사이다선택");
				}
				else {
					System.out.println("잔액부족");
				}
			}
			else if(menu==3) {
				if(balance >=m) {
					balance -=m;
					System.out.println("우유선택");
				}
				else {
					System.out.println("잔액부족");
				}
			}
			else if(menu==4) {
				while(true) {
					System.out.print("충전금액 : ");
					int bal = sc.nextInt();
					if(bal>0) {
						balance += bal;
						System.out.printf("%,d원 충전",bal);
						break;
					}
					else {
						System.out.println("다시 입력");
					}
					System.out.println();
				}

			}
			else if(menu==0) {
				run = false;
			}
			else {
				System.out.println("다시선택");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
	}

}
