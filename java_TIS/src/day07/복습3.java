package day07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10]; // 이름
		String[] id = new String[10];   // 아이디
		String[] pw = new String[10];   // 비밀번호
		String[] date = new String[10]; // 가입날짜
		int[] balance = new int[10];
		DateTimeFormatter dtf = 
				DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		int cnt=0;
		int lindex=-1;
		boolean login = false;
		
		int black =3000;
		int red =3500;
		int tang=8000;
		while(true) {
			System.out.println("========마켓커리========");
			if(login) {
				System.out.println("1.물품구매 2.로그아웃 3.회원정보("+name[lindex]+"님) 0.종료");
			}
			else {
				System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			}
			
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			
			if(menu==1) {
				if(login) {
					//물품구매
					while(true) {
						System.out.printf("=====마켓커리 물품구매=====[%,d원]\n",balance[lindex]);
						System.out.printf("1.짜장면(%,d원) 2.짬뽕(%,d원) 3.탕수육(%,d원) 4.충전 0.나가기\n",
								black,red,tang);
						System.out.print("선택 : ");
						menu = sc.nextInt();
						if(menu==1) {
							if(balance[lindex] >=black) {
								balance[lindex] -=black;
								System.out.println("짜장면 구매");
							}
							else {
								System.out.println("잔액부족");
							}
							
						}
						else if(menu==2) {
							if(balance[lindex] >=red) {
								balance[lindex] -= red;
								System.out.println("짬뽕 구매");
							}
							else {
								System.out.println("잔액부족");
							}
							
						}
						else if(menu==3) {
							if(balance[lindex] >=tang) {
								balance[lindex] -=tang;
								System.out.println("탕수육 구매");
							}
							else {
								System.out.println("잔액부족");
							}
							
						}
						else if(menu==4) {
							System.out.println("충전하실 금액 : ");
							int bal = sc.nextInt();
							if(bal>=0) {
								balance[lindex] += bal;
								System.out.println(bal+"원 충전되었습니다.");
							}
							else {
								System.out.println("충전실패");
							}
						}
						else if(menu==0) {
							System.out.println("나가기");
							break;
						}
						else {
							System.out.println("다시선택");
						}
					}
				}
				else {
					System.out.print("이름 : ");
					name[cnt] = sc.next();
					System.out.print("아이디 : ");
					id[cnt] = sc.next();
					System.out.print("비밀번호 : ");
					pw[cnt] = sc.next();
					LocalDateTime now = LocalDateTime.now(); //현재날짜
					date[cnt] = dtf.format(now); //현재날짜 포맷해서 입력
					System.out.println(name[cnt]+"님 회원가입을 축하드립니다.");
					cnt++;
				}
			}
			else if(menu==2) {
				if(login) {
					login = false;
					System.out.println(name[lindex]+"님 로그아웃 되었습니다.");
					lindex = -1;
				}
				else {
					System.out.print("아이디 : ");
					String lid = sc.next();
					System.out.print("비밀번호 : ");
					String lpw = sc.next();
					boolean find = false;
					
					for(int i=0;i<cnt;i++){
						if(lid.equals(id[i])) {
							find = true;
							if(lpw.equals(pw[i])){
								System.out.println(name[i]+"님 반갑습니다.");
								login =true;
								lindex = i;
								break;
							}
							else {
								System.out.println("비밀번호가 틀렸습니다");
							}
						}
					}
					if(find == false) {
						System.out.println("아이디가 틀렸습니다.");
					}
				}
			}
			else if(menu==3) {
				if(login) {
					//회원정보
					System.out.println("========회원목록========");
					System.out.println("이름\t아이디\t비밀번호\t보유금\t가입날짜");
					System.out.println("=====================");
					System.out.printf("%s\t%s\t%s\t%,d\t%s\n",
							name[lindex],id[lindex],pw[lindex],balance[lindex],date[lindex]);
				}
				else {
					System.out.println("========회원목록========");
					System.out.println("이름\t아이디\t비밀번호\t보유금\t가입날짜");
					System.out.println("=====================");
					for(int i=0;i<cnt;i++) {
						System.out.printf("%s\t%s\t%s\t%,d\t%s\n",
								name[i],id[i],pw[i],balance[i],date[i]);
					}
				}
			}else if(menu==0) {
				break;
			}
			else {
				System.out.println("다시선택");
			}
		}
		System.out.println("프로그램 종료");
	}
}