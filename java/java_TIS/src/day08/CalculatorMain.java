package day08;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calculator 객체만들고
		// 모든메서드 호출하여 계산출력
		Calculator cal = new Calculator();

		cal.num1 = 2;
		cal.num2 = 3;
		cal.sum();
		
		cal.sub(5, 3);
			
		System.out.println(cal.mul());
	
		System.out.printf("%.2f",cal.div(8, 3));
	}

}
