package day09;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int answer = (int)(Math.random()*31)+1;
		
		// 반복하면서 입력받는데 정답보다 크면 down 정답보다 작으면 up
		while(true) {
			
			System.out.print("수 입력 : ");
			int n = sc.nextInt();
			if(answer > n) {
				System.out.println("up");
			}
			else if(answer < n) {
				System.out.println("down");
			}
			else{
				System.out.println("정답");
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
