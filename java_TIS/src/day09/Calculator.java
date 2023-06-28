package day09;

public class Calculator {
	//필드(인스턴스 변수)
	int num1;
	int num2;
	
	
	// 메서드
	// 메서드명 sum 리턴 타입 x 매개변수 x, 실행문구 필드 num1+num2 출력 
	public void sum() {
		System.out.printf("합 : %d\n",num1+num2);
	}
	
	// 메서드명 sub 리턴 타입 x 매개변수 정수2개 실행문구 매개변수로 받은 두개의 차 출력
	public void sub(int a, int b) {
		if(b>a) {
			System.out.printf("b가 큰경우 : %d\n",b-a);
		}
		else {
			System.out.printf("a가 큰경우 : %d\n",a-b);
		}
		
	}
	
	// 메서드명 mul 리턴 타입 o 매개변수 x 실행문구 필드 num1*num2 리턴
	public int mul() {
		return num1*num2;
	}
	
	// 메서드 div 리턴 타입 o 매개변수 정수2개 실행문구 매개변수로 받은 2개의 나눈 값 리턴
	public double div(int a,int b) {
		return a/(double)b;
	}
}

	