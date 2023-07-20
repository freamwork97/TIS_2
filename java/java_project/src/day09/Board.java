package day09;

public class Board {
	private String title;
	private int cnt;
	private boolean open;
	
	// 기본생성자
	public Board() {
		
	}
	// 생성자
	public Board(String title, int cnt, boolean open) {
		this.title = title;
		this.cnt = cnt;
		this.open = open;
	}
	
	// 메서드 (get/set)
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	public int getCnt() {
		return cnt;
	}
	
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public boolean getOpen() {
		return open;
	}
	
	// 메서드명 cntUp 매개변수 x 리턴 타입: x 실행문구: cnt1증가
	public void cntUp() {
		cnt++;
	}
	
	// 메서드명 cntUp1, 매개변수 정수하나, 리턴타입o,
	// 실행문구: 매개변수만큼 cnt증가하고 cnt리턴
	public int cntUp1(int cnt) {
		return this.cnt += cnt;
	}
	
	// 전체필드 다 출력하는 print 메서드
	public void print() {
		System.out.println("title\tcnt\topen");
		System.out.println("====================");
		System.out.printf("%s\t%d\t%b\n"
				,title,cnt,open);	
	}
	
	
	
	
}
