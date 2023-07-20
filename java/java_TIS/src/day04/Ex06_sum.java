package day04;

import java.util.Scanner;

public class Ex06_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====sum=====");
	
			System.out.print("첫번째수입력 : ");
			int n1 = sc.nextInt();
			System.out.print("두번째수입력 : ");
			int n2 = sc.nextInt();	
			
			System.out.println("1.총합 2.짝수의합 3.홀수의합 0.종료");
			System.out.print("입력 : ");
			int menu = sc.nextInt();
			
			int sum=0;
			if(menu==1) {
				if(n1>n2) {
					int temp= n1;
					n1 = n2;
					n2 = temp;
				}
				for(int i=n1; i<=n2; i++) {
					sum +=i;
				}
			}
			else if(menu==2) {
				if(n1>n2) {
					int temp=n1;
					n1 = n2;
					n2 = temp;
				}
				for(int i=n1; i<=n2; i++) {
					if(i%2==0) {
						sum += i;
					}
				}
			}
			else if(menu==3) {
				if(n1>n2) {
					int temp=n1;
					n1 = n2;
					n2=temp;
				}
				for(int i=n1; i<=n2; i++) {
					if(i%2 !=0) {
						sum += i;
					}
				}
			}
			else if(menu ==0) {
				break;
			}
			else {
				System.out.println("다시선택");
			}
			System.out.println(sum);
			
		}
		System.out.println("프로그램 종료");
	}

}
