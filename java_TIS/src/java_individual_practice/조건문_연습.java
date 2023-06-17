package java_individual_practice;
import java.util.Scanner;
public class 조건문_연습 {
    public static void main(String[] args) {
        //변수 num값에 따라 짝수, 홀수 0 출력
		// Scanner sc = new Scanner(System.in);
		// System.out.print("숫자입력 : ");
		// int num = sc.nextInt();	
		
        // if(num == 0){
        //     System.out.println("0");
        // }
        // else if(num % 2 == 0){
        //     System.out.println("짝수");
        // }
        // else{
        //     System.out.println("홀수");
        // }

		// 변수 num 값에 따라 3의 배수, 5의 배수, 3과 5의 배수, 둘다 아님 출력 
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력");
		int num = sc.nextInt();	
		if(num % 3 == 0 && num % 5 == 0){
            System.out.println("3과 5의 배수");
        }
        else if(num % 3 == 0){
            System.out.println("3의 배수");
        }
        else if(num % 5 ==0){
            System.out.println("5의 배수");
        }
        else{
            System.out.println("둘다 아님");
        }
        sc.close();
    }
}
