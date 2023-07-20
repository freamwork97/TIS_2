package day09;

public class People {
	private String name; //이름
	private int age;     //나이

	// 기본생성자	
	public People() {
		
	}
	
	// 전체필드를 다 받는 생성자
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 모든 필드 get/set 메서드
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void print() {
	
		System.out.printf("%s\t%d\n",name,age);
	}
	
	//메서드명 ageUp, 매개변수 x 리턴타입 x 실행문구 age를 1증가
	public void ageUp() {
		age += 1;
	}
	//메서드명 ageUp1, 매개변수 정수1개 리턴타입 x 실행문구 age를 매개변수 만큼 증가
	public void ageUp1(int age) {
		this.age += age;
	}
	
	public int koreanAge() {
		return age-2;
	}
}
