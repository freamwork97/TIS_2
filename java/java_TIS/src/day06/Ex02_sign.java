package day06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex02_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//이름 아이디 비밀번호
		String[] name = new String[10];
		String[] id = new String[10];
		String[] pw = new String[10];
		String[] date = new String[10];
		DateTimeFormatter dtf = 
				DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh:mm:ss");
		int cnt=0;
		boolean con =true;
		while(true) {
			System.out.println("=====마켓커리=====");
			if(con) {
				System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			}
			else {
				System.out.println("1.회원정보 2.로그아웃 0.종료");
			}
			System.out.print("메뉴선택 : ");
		
		
			int menu = sc.nextInt();
			
			if(menu==1) {
				if(con) {
					System.out.print("이름 입력 : ");
					name[cnt]=sc.next();
					System.out.print("id 입력 : ");
					id[cnt] = sc.next();
					String signId = sc.next();
					boolean a = false;
					for(int i=0; i<cnt; i++) {
						if(signId.equals(id[i])){
							a = true;
							break;
						}
					}
					if(a) {
						System.out.println("중복아이디입니다.");
						continue;
					}
					else {
						id[cnt] = signId;
					}
					System.out.print("pw 입력 :");
					pw[cnt] = sc.next();
					LocalDateTime now = 
							LocalDateTime.now(); //현재날짜시간 구하는 문법
					date[cnt] = dtf.format(now);
						
					cnt++;
				}
				else {
					for(int i=0;i<cnt; i++) {
						
					}
				}
				
			}
			else if(menu==2) {
				if(con) {
					System.out.print("아이디 입력 : ");
					String lid=sc.next();
					System.out.print("비밀번호 입력 : ");
					String lpw=sc.next();
					
					for(int i=0; i<cnt; i++) {
						if(id[i].equals(lid) && pw[i].equals(lpw)) {
							System.out.println("로그인성공");
							con=false;
							break;
						}
						else if(i==cnt-1) {
							if(id[i].equals(lid)) {
								if(!(pw[i].equals(lpw))) {
									System.out.println("비밀번호가 틀렸습니다");
								}
							}
							else {
								System.out.println("아이디가 틀렸습니다.");
							}
						}
					}
				}
				else {
					System.out.println("로그아웃하였습니다.");
					con=true;
				}

			}
			else if(menu==3) {
				if(con) {
					System.out.println("이름\t아이디\t비밀번호\t가입날짜");
					System.out.println("======================");
					for(int i=0; i<cnt; i++) {
						System.out.printf("%s\t%s\t%s\t%s\n",
								name[i],id[i],pw[i],date[i]);
					}
				}
				else {
					System.out.println("다시선택");
				}
				
			}
			else if(menu==0){
				break;
			}
			else {
				System.out.println("다시선택");
			}
		}
		System.out.println("프로그램 종료");
	}

}
