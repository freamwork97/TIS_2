package day09;

public class Animal {
	//필드
	private String name;  // 이름
	private String sound; // 울음소리
	private int leg;      // 다리갯수
	
	//메서드(get/set)
	
	// public -> 외부클래스 어디서든 접근 가능
	// private -> 같은 클래스에서 접근 가능
	// default -> 같은 패키지에서 접근 가능
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public String getSound() {
		return sound;
	}
	
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	public int getLeg() {
		return leg;
	}
	
	public void print() {
		System.out.printf("%s\t%s\t%d\n",
				name,sound,leg);
	}
	
	public void print1() {
		System.out.printf("이름:%s, 울음:%s, 다리:%d\n",
				name,sound,leg);
	}
}
