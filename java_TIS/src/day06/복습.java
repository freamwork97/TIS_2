package day06;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 아이디와 비밀번호를 입력받아 아이디가 틀렸습니다. 비밀번호가 틀렸습니다. 로그인성공
//		Scanner sc = new Scanner(System.in);
//		String id = "test";
//		String pw = "1234";
//	
//		int menu = 0;
//		while(true) {
//			System.out.println("1.로그인 0.종료");
//			System.out.print("메뉴선택 : ");
//			menu = sc.nextInt();
//			if(menu==1) {
//				System.out.print("아이디 입력 : ");
//				String loginid = sc.next();
//				System.out.print("비밀번호 입력 : ");
//				String loginpw = sc.next();
//				if(id.equals(loginid) & pw.equals(loginpw)) {
//					System.out.println("로그인성공");
//					break;
//				}
//				else if(id.equals(loginid) && !pw.equals(loginpw)) {
//					System.out.println("비밀번호가 틀렸습니다");
//				}
//				else{
//					System.out.println("아이디가 틀렸습니다");
//				}
//			}
//			else if(menu==0) {
//				break;
//			}
//			else {
//				System.out.println("다시선택");
//			}
//		}
		// 1~100까지 합출력
//		int s=0;
//		for(int i=1; i<=100; i++) {
//			s +=i;
//		}
//		System.out.println(s);
		
		// dan변수 활용 19단까지 출력
		int dan =5;
		for(int i=1; i<20; i++) {
//			System.out.println(dan+"x"+i+"="+dan*i);
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}

}
