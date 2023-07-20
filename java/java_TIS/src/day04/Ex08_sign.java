package day04;

import java.util.Scanner;

public class Ex08_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = "";
		String id = "";
		String pw = "";
		int menu =0;
		boolean con =true;
		while(true) {
			if(con) {
				System.out.println("1.회원가입 2.로그인 0.종료");
			}
			else{
				System.out.println("1.회원정보("+name+"님) 2.로그아웃 0.종료");
			}
			System.out.print("선택 : ");
			if(sc.hasNextInt()) {
				menu = sc.nextInt();sc.nextLine();
				
			}else {
				sc.nextLine();
				System.out.println("숫자만 입력가능");
				System.out.println();
				continue;
			}
			if(menu==1) {
				if(con) {
					System.out.print("이름 : ");
					name = sc.next();
					System.out.print("아이디 : ");
					id = sc.next();
					System.out.print("비밀번호 : ");
					pw = sc.next();
					System.out.println(name+"님 회원가입을 축하드립니다.");
				}
				else {
					System.out.println("이름\t아이디\t비밀번호\t");
					System.out.println("=====================");
					System.out.printf("%s\t%s\t%s",name,id,pw);
				}

			}
			else if(menu==2) {
				if(con) {
					System.out.println("=====로그인=====");
					System.out.print("아이디 : ");
					String loginId = sc.next();
					System.out.print("비밀번호 : ");
					String loginPw = sc.next();
					if(id.equals(loginId) && pw.equals(loginPw)) {
						System.out.print("로그인성공");
						con=false;
					}
					else {
						System.out.print("로그인실패");
					}
				}
				else {
					System.out.println("로그아웃 되었습니다.");
					con = true;
				}
			}
			else if(menu==0) {
				break;
			}
			else {
				System.out.println("다시선택");
			}
			System.out.println();
		}
		System.out.println("프로그램종료");
	}

}