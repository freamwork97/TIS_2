package day02;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i =1; i<=10;i++) {
//			System.out.println(i);
//		}

//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.print("숫자입력 : ");
//			int num = sc.nextInt();
//			if (num == 0) {
//				break;
//			}
//		}
//		System.out.println("반복종료");
		
		// 반복해서 숫자를 입력받아 출력하는데 3의 배수는 피즈 5의 배수는 버즈 3,5의 배수는 피즈버즈 0은종료
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자입력 : ");
			int num = sc.nextInt();
			if(num == 0) {
				break;
			}
			if(num % 3==0) {
				if(num % 5==0) {
					System.out.println("피즈버즈");
				}
				else {
					System.out.println("피즈");
				}
			}
			else if(num % 5 ==0) {
				System.out.println("버즈");
			}
			else {
				System.out.println(num);
			}
			
		}
	}

}
