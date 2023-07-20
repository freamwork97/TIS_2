package day04;

import java.util.Scanner;

public class Ex04_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		boolean run2 = true;
		boolean con = true;
		int n1=0;
		while(run) {
			System.out.println("=====계산기=====");
			if(con) {
				System.out.print("첫번째숫자입력 : ");
				n1 = sc.nextInt();
			}

			
			String cal = "";
			while(true) {
				System.out.print("연산자 선택 : ");
				cal = sc.next();
				if(cal.equals("+")||cal.equals("-")||cal.equals("*")||cal.equals("/")||cal.equals("%")) {
					break;
				}
				else {
					System.out.println("다시선택");
				}
			}
			
			System.out.print("두번째숫자입력 : ");
			int n2 = sc.nextInt();
			
			if(cal.equals("+")) {
				System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);
			}
			else if(cal.equals("-")) {
				System.out.printf("%d - %d = %d\n",n1,n2,n1-n2);
			}
			else if(cal.equals("*")) {
				System.out.printf("%d * %d = %d\n",n1,n2,n1*n2);
			}
			else if(cal.equals("/")) {
				System.out.printf("%d / %d = %.2f\n",n1,n2,(double)n1/n2);
			}
			else{
				System.out.printf("%d %% %d = %d\n",n1,n2,n1%n2);
			}
			
			while(run2) {
				System.out.println("0.종료 1.새로하기 2.이어하기");
				int end = sc.nextInt();
				if(end ==0) {
					run2 = false;
					run=false;
				}
				else if(end ==1) {
					con = true;
					break;
				}
				else if(end ==2) {
					con = false;
					if(cal.equals("+")) {
						n1=n1+n2;
					}
					else if(cal.equals("-")) {
						n1=n1-n2;
					}
					else if(cal.equals("*")) {
						n1=n1*n2;
					}
					else if(cal.equals("/")) {
						n1=n1/n2;
					}
					else{
						n1=n1%n2;
					}
					break;
				}else {
					System.out.println("다시 선택");
				}
			}
		}
		System.out.println("프로그램종료");
	}

}
