package day07;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
//		String id = "test";
//		String pw = "1234";
//		
//		// 아이디가 틀렸습니다. 비밀번호가 틀렸습니다. 로그인성공
//		
//		System.out.print("아이디 : ");
//		String lid = sc.next();
//		System.out.print("비밀번호 : ");
//		String lpw = sc.next();
//		
//		if(lid.equals(id)) 
//			if(lpw.equals(pw)) {
//				System.out.println("로그인성공");
//			}
//			else {
//				System.out.println("비밀번호가 틀렸습니다.");
//		}
//		else {
//			System.out.println("아이디가 틀렸습니다.");
//		}
		
		// 1~입력받은 수까지의 합 출력
//		System.out.print("수 입력 : ");

		
		// 입력받은 단의 구구단 출력 "1~19단까지"
//		System.out.print("단 입력 : ");
//		int dan = sc.nextInt();
//		
//		for(int i =1; i<20; i++) {
//			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
//		}
		
		// 1~100 까지 3의 배수는 피즈 5의 배수는 버즈 3과 5의 배수는 피즈버즈 나머지는 숫자 출력
		for(int i =1; i<101; i++) {
			if(i %3 ==0 && i%5==0) {
				System.out.println("피즈버즈");
			}
			else if(i%3==0) {
				System.out.println("피즈");
			}
			else if(i%5==0) {
				System.out.println("버즈");
			}
			else {
				System.out.println(i);
			}
		}
	}

}
