package day09;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("이름\t나이");
		System.out.println("============");
		//이름 홍길동 나이 90 people객체 생성
		People hong = new People("홍길동",90);
		
		//ageUp메서드 사용
		hong.ageUp();
		//print메서드 사용
		hong.print();
		
		//이름 이순신 나이 80 People객체 생성
		People lee = new People();
		lee.setName("이순신");
		lee.setAge(80);
		//ageUp1메서드 사용해서 5살증가
		lee.ageUp1(5);
		//print메서드 사용
		lee.print();
		
		System.out.printf("%s 만나이 : %d\n",hong.getName(),hong.koreanAge());
		System.out.printf("%s 만나이 : %d\n",lee.getName(),lee.koreanAge());
	}

}
