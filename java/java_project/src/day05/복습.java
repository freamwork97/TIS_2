package day05;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 하나의 숫자를 입력받아 3의 배수, 5의 배수, 3과5의 배수, 둘다아님 출력
		Scanner sc = new Scanner(System.in);

//		while(true) {
//			System.out.print("숫자입력 : ");
//			int n= sc.nextInt();
//			
//			if(n %3==0 && n%5==0) {
//				System.out.println("3과5의배수");
//			}
//			else if(n %3==0) {
//				System.out.println("3의배수");
//			}
//			else if(n %5==0) {
//				System.out.println("5의배수");
//			}
//			else {
//				System.out.println("둘다X");
//			}
//			System.out.println();
//			
//		}
		
		// 하나의 숫자를 입력받아 1~입력받은 수까지의 합 출력
		while(true) {
			System.out.print("숫자입력 : ");
			int n= sc.nextInt();
			int s=0;
			for(int i=1; i<=n; i++) {
				s +=i; // s = s + i;
			}
			System.out.println("합 : "+s);
			System.out.println();
		}


	}

}
