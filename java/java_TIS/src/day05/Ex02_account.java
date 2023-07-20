package day05;

import java.util.Scanner;

public class Ex02_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int cnt=0;
		String acc="";
		int bal=0;
		while(true) {
			System.out.println("=====인천일보은행=====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 0.종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			
			if(menu==1) {
				//예금주
				//계좌번호
				//초기잔액
				System.out.print("예금주 : ");
				name[cnt]= sc.next();
				System.out.print("계좌번호 : ");
				account[cnt] = sc.next();
				System.out.print("초기잔액 : ");
				balance[cnt] = sc.nextInt();
				
				cnt++;
			}
			else if(menu==2) {
				//입금할 계좌
				//입금 금액
				System.out.print("입금할 계좌입력 : ");
				acc = sc.next();
				
				System.out.print("입금 금액을 입력하시오 : ");
				
				boolean find =false;
				
				for(int i=0; i<cnt; i++) {
					
					if(account[i].equals(acc)) {
						balance[i] += sc.nextInt();
						System.out.println("입금 되었습니다.");
						find = true;
						break;
					}
					else if(find==false) {
						System.out.println("없는 계좌입니다.");
					}
				}
			
			}
			else if(menu==3) {
				System.out.print("출금할 계좌입력 : ");
				acc = sc.next();
				
				for(int i=0; i<cnt; i++) {
					if(account[i].equals(acc)) {
						System.out.print("출금 금액을 입력하시오 : ");
						bal = sc.nextInt();
						if(balance[i]>=bal) {
							balance[i] -= bal;
							
							
							System.out.println("출금 되었습니다.");
							break;
							
						}
						else {
							System.out.println("잔액 부족");
						}
					}
					else {
						System.out.println("없는 계좌입니다.");
						
					}
				}
			}
			else if(menu==4) {
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("======================");
				for(int i=0; i<cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n",name[i],account[i],balance[i]);
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
	}

}
