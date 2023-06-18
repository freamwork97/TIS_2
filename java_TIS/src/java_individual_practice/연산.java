package java_individual_practice;
import java.util.Scanner;

public class 연산 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("계산할 숫자 입력");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("=========");
		System.out.println("산술연산"); 
		System.out.println(a + b); // 더하기
		System.out.println(a - b); // 빼기
		System.out.println(a * b); // 곱하기
		System.out.println(a / b); // 나누기
		System.out.println(a % b); // 나머지
		System.out.println("=========");

        System.out.println("비교연산");
		System.out.println(a > b); // 큰지(초과)
		System.out.println(a < b); // 작은지(미만)
		System.out.println(a >= b); // 크거나 같은지(이상)
		System.out.println(a <= b); // 작거나 같은지(이하)
		System.out.println(a == b); // 같은지
		System.out.println(a != b); // 같지 않은지
		System.out.println("=========");
        sc.close();
    }
}
