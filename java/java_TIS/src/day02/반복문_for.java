package day02;

import java.util.Scanner;

public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=10; i<20; i++) {
//			System.out.println("안녕하세요");
//		}
		
//		for(int i=0; i<10; i++) { 
//			System.out.println(i);
//		}
		
//		for(int i=1; i<=10; i=i+2) {
//			System.out.println(i);
//		}
		
//		for(int i=0; i<10; i=i+2) {
//			System.out.println(i);
//		}
		
//		for(int i=3; i<101; i++) {
//			System.out.println(i);
//		}
		
//		for(int i=1; i<=10; i++) {
//			System.out.print(i);
//		}
		
		// 1~100까지 짝수출력
//		for(int i=1; i<101; i++) {
//			if(i %2==0) {
//				System.out.println(i);
//			}
		// 짝수
//		for(int i=0; i<101; i=i+2) {
//			System.out.println(i);
//		}
		
		// 1~100까지 홀수출력
//		for(int i=1; i<101; i=i+2) {
//			System.out.println(i);
//		}
		
		
		// 1~10까지 가로 출력
		// 출력예시) 1,2,3,4,5,6,7,8,9,10
//		for(int i=1; i<11; i++) {
//			if(i<10) {
//				System.out.print(i+",");
//			}
//			else {
//				System.out.print(i);
//			}
//		}
		
//		for(int i =1; i<=10; i++) {
//			System.out.print(i);
//			if(i!=10) {
//				System.out.print(",");
//			}
//		}
		
		// 1~10까지 합 출력
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
		
		// 구구단
		
//		int dan = 6;
//		for(int i = 1; i<20; i++) {
//			System.out.println(dan+"*"+i+"="+(dan*i));
//		}
		
//		for(int i =2; i<20; i++) {
//			for(int j =1; j<20; j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//			System.out.println("========");
//		}
		
		// 1~100까지 3의 배수 갯수 출력
//		int cnt = 0;
//		for(int i=1; i<=100; i++) {
//			if(i%3==0) {
//				cnt = cnt+1;
//			}
//		}
//		System.out.println(cnt);
		
		// 1~100까지 3의 배수 갯수, 5의 배수 갯수 출력
		
//		int cnt1 =0;
//		int cnt2 = 0;
//		
//		for(int i=1; i<=100; i++) {
//			if(i%3==0) {
//				if(i%5==0) {
//					cnt2++;
//				}
//				cnt1++;
//			}
//			else if(i%5==0) {
//				cnt2++;
//			}
//		}
//		System.out.println(cnt1);
//		System.out.println(cnt2);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇부터 : ");
//		int a = sc.nextInt();
//		System.out.print("몇까지 : ");
//		int b = sc.nextInt();
//		
//		int sum = 0;
//		for(int i=a; i<=b; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// 피즈버즈
		// 입력받은 수부터 입력받은 수까지 출력하는데, 3의 배수는 피즈 5의 배수는 버즈 3,5의 배수는 피즈버즈
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇부터 : ");
		int a = sc.nextInt();
		System.out.println("몇까지 : ");
		int b = sc.nextInt();
		
//		for(int i=a; i<b; i++) {
//			if(i %3 ==0 && i % 5 ==0) {
//				System.out.println("피즈버즈");
//			}
//			else if(i % 3==0){
//				System.out.println("피즈");
//			}
//			else if(i % 5==0) {
//				System.out.println("버즈");
//			}
//			else {
//				System.out.println(i);
//			}
//			
			for(int i=a; i<b; i++) {
				if(i %3 ==0) {
					if(i %5 ==0) {
						System.out.println("피즈버즈");
					}
					else {
						System.out.println("피즈");
					}
				}
				else if(i % 5==0){
					System.out.println("버즈");
				}
				else {
					System.out.println(i);
				}		
		}
	}

}
