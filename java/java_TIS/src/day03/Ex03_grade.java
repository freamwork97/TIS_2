package day03;

import java.util.Scanner;

public class Ex03_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====성적표=====");
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학 : ");
			int mat = sc.nextInt();
			
			int result = kor+ eng+ mat;
			double mean = result/3;
			
			System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("============================================");
			String grade;
			if(result > 280) {
				grade = "A";
			}
			else if(result >240) {
				grade = "B";
			}
			else if(result > 220) {
				grade = "C";
			}
			else if(result > 180) {
				grade = "D";
			}
			else {
				grade = "F";
			}
//			System.out.println(kor+"\t"+eng+"\t"+mat+"\t"+result+"\t"+mean+"\t"+grade);
			System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%s\n",kor,eng,mat,result,mean,grade);
//			System.out.println();

		}
	}
		
}