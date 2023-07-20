package day07;

import java.util.Scanner;

public class Ex01_login_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10]; //회원이름
		String[] id = new String[10];   //회원아이디
		String[] pw = new String[10];   //회원비밀번호
		String[] account = new String[10]; //회원계좌번호
		int[] balance = new int[10];
		int cnt=0;
//		boolean login = false;
		int lindex = -1;
		while(true) {
			System.out.println("=====스마트뱅킹=====");
			if(lindex !=-1) {
				System.out.println("1.마이페이지 2.로그아웃 3.입금 4.출금 5.계좌이체 0.종료"); //로그인시
			}
			else {
				System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료"); // 비로그인시
			}
			System.out.print("메뉴선택 : ");
			int menu=sc.nextInt();
			if(menu==1) {
				if(lindex !=-1) {
					System.out.println("마이페이지");
					System.out.println("이름\t아이디\t비밀번호\t계좌번호\t소지금");
					System.out.println("==============================");
					System.out.printf("%s\t%s\t%s\t%s\t%,d\n",
							name[lindex],id[lindex],pw[lindex],account[lindex],balance[lindex]);
					
				}
				else {
					System.out.print("이름 : ");
					name[cnt] = sc.next();
					System.out.print("아이디 : ");
					id[cnt] = sc.next();
					System.out.print("비밀번호 : ");
					pw[cnt] = sc.next();
					System.out.print("계좌번호 :");
					account[cnt] = sc.next();
					
					cnt++;
				}
			}
			else if(menu==2) {
				if(lindex !=-1) {
					lindex = -1;
					System.out.println("로그아웃 되었습니다.");
				}
				else {
					System.out.print("아이디 : ");
					String lid = sc.next();
					System.out.print("비밀번호 : ");
					String lpw = sc.next();
					for(int i=0; i<cnt;i++) {
						if(id[i].equals(lid)) {
							if(pw[i].equals(lpw)) {
								System.out.println("로그인성공");
								lindex = i;
								break;
							}
							else {
								System.out.println("로그인실패");								
								break;
							}						
						}
						else if(i==cnt-1) {
							System.out.println("로그인실패");						
						}
					}									
				}
			}
			else if(menu==3) {
				if(lindex !=-1) {
					//입금
					System.out.print("입금할 금액 : ");
					int bal = sc.nextInt();
					if(bal >0) {
						balance[lindex] += bal;
						System.out.printf("%,d 원 입금하였습니다.\n",bal);						
					}
					else {
						System.out.println("입금실패");
					}
				}
				else {
					System.out.println("회원목록");
					System.out.println("이름\t아이디\t비밀번호\t계좌번호\t소지금");
					System.out.println("==============================");
					for(int i=0; i<cnt; i++) {
						System.out.printf("%s\t%s\t%s\t%s\t%d\n",
								name[i],id[i],pw[i],account[i],balance[i]);
					}
				}
			}
			else if(menu==4 && lindex !=-1 ) {
					//출금
				System.out.print("출금할 금액 : ");
				int bal = sc.nextInt();
				if(bal > 0) {
					if(balance[lindex]>=bal) {
						System.out.print("출금 비밀번호 : ");
						String outpw = sc.next();
						if(pw[lindex].equals(outpw)) {
							balance[lindex] -= bal;					
							System.out.printf("%,d원 출금하였습니다.\n",bal);		
						}
						else {
							System.out.println("출금실패");
						}
					}
					else {
						System.out.println("출금실패");
					}
				}
				else {
					System.out.println("출금실패");
				}				
			}
			else if(menu==5 && lindex !=-1) {
					//이체
				System.out.print("입금할 계좌");
				String acc = sc.next();
				for(int i=0; i<cnt; i++) {
					if(account[i].equals(acc)) {
						System.out.print("이체할 금액 : ");
						int bal = sc.nextInt();
						if(bal >0) {
							if(balance[lindex]>bal) {
								System.out.print("이체 비밀번호 : ");
								String outpw = sc.next();
								if(pw[lindex].equals(outpw)) {
									balance[i] += bal;
									balance[lindex] -= bal;
									System.out.println("이체하였습니다.");
									break;
								}
								else {
									System.out.println("비밀번호가 틀렸습니다.");
									break;
								}

							}
							else {
								System.out.println("이체실패");
								break;
							}
						}
						else {
							System.out.println("이체실패");
							break;
						}
					}
					else if(i==cnt-1){
						System.out.println("없는 계좌입니다.");
					}
				}
			}
			else if(menu==0) {
				break;
			}
			else {
				System.out.println("다시선택");
			}	
		}
		System.out.println("프로그램 종료");
	}
}