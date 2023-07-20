package day09;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit apple = new Fruit();
		
		System.out.println("이름\t색상\t씨유무");
		System.out.println("====================");
		apple.name = "사과";
		apple.color = "빨강";
		apple.isSeed = true;
		apple.print();

		//두번째 생성자 사용하여 melon객체 생성후 print
		Fruit melon = new Fruit("멜론");
		melon.color = "초록";
		melon.isSeed=true;
		melon.print();
		
		//세번째 생성자 사용하여 orange객체 생성후 print
		Fruit orange = new Fruit("오렌지","주황");
		orange.isSeed = true;
		orange.print();
			
		Fruit banana = new Fruit("바나나","노랑",false);
		banana.print();
	}

}
