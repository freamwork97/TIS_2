package day09;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal();  // 강아지 객체 생성
//		System.out.println("이름\t울음소리\t다리갯수");

//		dog.name = "뽀삐";
		dog.setName("뽀삐");
//		dog.sound = "멍멍";
		dog.setSound("멍멍");
//		dog.leg = 4;
		dog.setLeg(4);
		dog.print();
		// 객체이름 cat, 이름은 야옹이, 울음소리 야옹, 다리갯수 4개
		Animal cat = new Animal();  // 고양이 객체 생성
		cat.setName("야옹이");
		cat.setSound("야옹");
		cat.setLeg(4);
		cat.print();
		
		Animal chicken = new Animal(); // 닭 객체 생성
		chicken.setName("치킨");
		chicken.setSound("꼬끼오");
		chicken.setLeg(2);
		chicken.print1();
		// 뱀
		Animal snake = new Animal(); // 뱀 객체 생성
		snake.setName("뱀술");
		snake.setSound("스스스슥"); 
		snake.setLeg(0);
		snake.print1();
		
	}

}
