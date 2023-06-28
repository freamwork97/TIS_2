package day09;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//객체 생성후 모든 메서드 사용하여 각각의 값 출력
		Calculator c = new Calculator();
		
		c.num1 = 5;
		c.num2 = 10;
		
		
	
		c.sum();
		
		
		c.sub(70, 80);
		
		System.out.println("곱 : "+c.mul());
		System.out.println("나누기 : "+c.div(8, 5));
		
		Calculator c1 = new Calculator();
		c1.sum();
	}

}
