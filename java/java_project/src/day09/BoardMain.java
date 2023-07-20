package day09;

public class BoardMain {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//board객체 하나만들기
		Board a = new Board("자바",20,true);
		//cntUp사용하기
		a.cntUp();
		//print사용하기
		a.print();
		System.out.println();
		//Board객체 하나만들기
		Board b = new Board();
		b.setTitle("파이썬");
		b.setCnt(5);
		b.setOpen(false);
		//cntup1메세드 사용하고 리턴값 출력하기
		System.out.println(b.cntUp1(8));
		System.out.println();
		//print
		b.print();
	}

}
