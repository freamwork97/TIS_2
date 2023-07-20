package day05;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String n1= "홍길동";
//		String n2= "이순신";
//		String n3= "심청이";
//		System.out.println(n1);
//		System.out.println(n2);
//		System.out.println(n3);
		
		// 배열선언방법1
//		String names[] = {"홍길동","이순신","심청이"};
		String[] names = {"홍길동","이순신","심청이"};
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);  예외발생(에러)
		
		//배열선언방법2
		String[] names1= new String[5];  // 5칸짜리 배열만들기
		names1[0] = "장동건";
		names1[1] = "원빈";
		names1[2] = "이정재";
		names1[3] = "정우성";
		names1[4] = "이병헌";
//		names1[5] = "이민정";  예외발생(에러)
//		System.out.println(names1[0]);
		
		// 배열길이확인
		System.out.println("배열의길이 : "+names1.length);
		
		
		// names1의 값을 for문을 통해 출력
		for(int i=0; i<names1.length; i++) {
			System.out.println(names1[i]);
		}
		
		
	} 
	
}
