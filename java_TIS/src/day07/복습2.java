package day07;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while문을 사용하여
	
		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		String[] product = new String[100];
		int cnt=0;
		int c=0;
		int s=0;
		int m=0;
		while(true) {
			System.out.printf("잔액 [%,d원]\n",balance);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.구매목록 0.종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
		
			if(menu ==1) {
				if(balance>=1000) {
					System.out.println("콜라선택");
					balance -=1000;
					product[cnt++] = "콜라";
					c++;
				}
				else {
					System.out.println("잔액부족");
				}
				
			}
			else if(menu==2) {
				if(balance >=1200) {
					System.out.println("사이다선택");
					balance -=1200;
					product[cnt++] ="사이다";
					s++;
				}
				else {
					System.out.println("잔액부족");
				}
				
			}
			else if(menu==3) {
				if(balance >=1500) {
					System.out.println("우유선택");
					balance -=1500;
					product[cnt++] = "우유";
					m++;
				}
				else {
					System.out.println("잔액부족");
				}
				
			}
			else if(menu==4) {
				System.out.println("구매목록\t수량");
				System.out.println("=============");

//				System.out.println("콜라\t"+c);
//				System.out.println("사이다\t"+s);
//				System.out.println("우유\t"+m);
//				
				int coke = 0;
				int soda = 0;
				int milk = 0;
				for(int i=0; i<cnt; i++) {
					if(product[i].equals("콜라"))
						coke++;
					if(product[i].equals("사이다"))
						soda++;
					if(product[i].equals("우유"))
						milk++;
				}
				System.out.println("콜라\t"+coke);
				System.out.println("사이다\t"+soda);
				System.out.println("우유\t"+milk);
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
