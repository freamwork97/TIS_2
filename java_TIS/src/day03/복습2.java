package day03;

import java.util.Scanner;

public class 복습2 {
	public static void main(String[] args) {
//		for(int i =0; i<5; i++) {
//			System.out.println("Hello");
//		}
		
		// 1~10까지 출력
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//		
		// 1~10까지 2씩 증가
//		for(int i=1; i<=10; i+=2) {
//			System.out.println(i);
//		}
		
		// 10~1까지 출력
//		for(int i=10; i>0; i--) {
//			System.out.println(i);
//		}
		
		// 1~10까지 가로로 출력
//		for(int i=1; i<=10; i++) {
//			if(i <=9) {
//				System.out.print(i+",");
//			}
//			else {
//				System.out.println(i);
//			}
//			
//		}
		
		// 1~10까지 합출력
//		int sum =0;
//		for(int i=1; i<=10; i++) {
//			sum +=i;
//		}
//		System.out.println(sum);
		
		// 1~100까지 7의 배수 갯수출력
//		int cnt = 0;
//		for(int i=1; i<=100; i++) {
//			if(i%7==0) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
		
		// 구구단 출력 break, continue
//		int dan = 6;
//		System.out.println(dan+"단");
//		for(int i=1; i<10; i++) {
//			if(i==5) {
//				continue;
//			}
//			System.out.println(dan+"*"+i+"="+dan*i);
//		}
//		System.out.println(dan+"단 끝");
		
		Scanner sc =new Scanner(System.in);
//		System.out.print("숫자입력");
//		int a= sc.nextInt();
		
//		if(a>0) {
//			System.out.println("양수");
//		}
		
//		while(a>0) {
//			System.out.println("양수");
//		}
		
		while(true) {
			System.out.print("숫자입력 : ");
			int a = sc.nextInt();
			if(a==0) {
				break;
			}
			if(a%2==0) {
				System.out.println("짝수");
			}
			else{
				System.out.println("홀수");
			}
		}
		System.out.println("반복문종료");
	}
}
