package day08;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int bal=10000;
		while(true) {
			System.out.println("=====자판기=====");
			System.out.printf("잔액[%,d원]\n",bal);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 0.종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			if(menu==1) {
				if(bal>=1000) {
					System.out.println("콜라선택");
					bal-=1000;
				}
				else {
					System.out.println("잔액부족");
				}				
			}
			else if(menu==2) {
				if(bal>=1200) {
					System.out.println("사이다선택");
					bal-=1200;
				}
				else {
					System.out.println("잔액부족");
				}
			}
			else if(menu==3) {
				if(bal>=1500) {
					System.out.println("우유선택");
					bal-=1500;
				}
				else {
					System.out.println("잔액부족");
				}
			}
			else if(menu==0) {
				break;
			}
			else {
				System.out.println("다시선택");
			}
		}
		System.out.println("프로그램 종료");
	}
}