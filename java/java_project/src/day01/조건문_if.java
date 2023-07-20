package day01;

import java.util.Scanner;

public class 조건문_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//19이상 성인
		//13이상 청소년
		//8이상 초등학생
		//7이하 어린이		
//		int age = 20;
//		if(age >= 19) {
//			System.out.println("성인");
//		}
//		else if(age >= 13) {
//			System.out.println("청소년");
//		}
//		else if(age >= 8){
//			System.out.println("초둥학생");
//		}
//		else {
//			System.out.println("어린이");
//		}
		
		// a의 변수의 값에 따라 "양수", "음수","0"을 출력하시오
//		int a = 0;
//		if(a > 0) {
//			System.out.println("양수");
//		}
//		else if(a < 0) {
//			System.out.println("음수");
//		}
//		else {
//			System.out.println("0");
//		}
		
//		 변수 score에 따라
//		 95이상A+
//		 90이상A
//		 85이상B+
//		 80이상B
//		 75이상C+
//		 70이상C
//		 65이상D+
//		 60이상D
//		 60미만F
//		int score = 50;
//		if(score >=90) {
//			if(score >= 95) {
//			System.out.println("A+");
//			}
//			else {
//				System.out.println("A");
//			}
//		}
//		else if(score >=80) {
//			if(score >=85) {
//			System.out.println("B+");
//			}
//			else {
//				System.out.println("B");
//			}
//		}
//		else if(score >=70) {
//			if(score >= 75) {
//			System.out.println("C+");
//			}
//			else {
//				System.out.println("C");
//			}
//		}
//		else if(score >=60){
//			if(score >=65) {
//			System.out.println("D+");
//			}
//			else {
//				System.out.println("D");
//			}
//		}
//		else {
//			System.out.println("F");
//		}
		
		//변수 a의 값에 따라 '양수' '음수' '0'
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력 : ");
//		int a = sc.nextInt();
//		
//		if(a > 0) {
//			System.out.println("양수");
//		}
//		else if(a<0){
//			System.out.println("음수");
//		}
//		else {
//			System.out.println("0");
//		}
//		sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이입력 : ");
//		int age = sc.nextInt();
//		
//		if(age >=19) {
//			System.out.println("성인");
//		}
//		else if(age >=13) {
//			System.out.println("청소년");
//		}
//		else if(age >=8) {
//			System.out.println("초등학생");
//		}
//		else {
//			System.out.println("어린이");
//		}
		
		//변수 num값에 따라 짝수, 홀수 0 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력 : ");
//		int num = sc.nextInt();	
//		
//		if(num % 2 == 0) {
//			if(num ==0) {
//				System.out.println("0");
//			}
//			else {
//			System.out.println("짝수");
//			}
//		}
//		else if(num % 2 != 0) {
//			System.out.println("홀수");
//		}

		// 변수 num 값에 따라 3의 배수, 5의 배수, 3과 5의 배수, 둘다 아님 출력 
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력");
		int num = sc.nextInt();	
		
//		if(num % 3 == 0) {
//			if(num % 5 == 0) {
//				System.out.println("3과 5의 배수");
//			}
//			else {
//				System.out.println("3의배수");
//			}
//		}
//		else if(num % 5 ==0) {
//			if(num % 3 == 0) {
//				System.out.println("3과 5의 배수");
//			}
//			else {
//				System.out.println("5의배수");
//			}
//		}
//		else {
//			System.out.println("둘다아님");
//		}
		
		if(num % 3 ==0 && num % 5 ==0) {
			System.out.println("3과 5의 배수");
		}
		else if(num % 3==0) {
			System.out.println("3의 배수");
		}
		else if(num % 5 ==0) {
			System.out.println("5의 배수");
		}
		else {
			System.out.println("둘다 아님");
		}
	}

}
