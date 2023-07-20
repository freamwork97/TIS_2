package day06;

import java.util.Scanner;

public class Ex01_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];   // 예금주
		String[] account = new String[10];// 계좌번호
		int[] balance = new int[10];      // 잔액
		int cnt=0;
		int bal=0;
		String acc="";
		while(true) {
			System.out.println("===============은행===============");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 0.종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			
			if(menu ==1) {
				System.out.print("예금주 입력 : ");
				name[cnt] = sc.next();
				System.out.print("계좌번호 입력 : ");
				account[cnt] = sc.next();
				System.out.print("초기잔액 : ");
				balance[cnt] = sc.nextInt();
				if(balance[cnt]>=0) {
					System.out.println("생성되었습니다.");
					cnt++;
				}
				else {
					System.out.println("계좌생성 실패");
				}
				
			}
			else if(menu ==2) {
				System.out.print("입금할 계좌 : ");
				acc = sc.next();
				for(int i=0; i<cnt; i++) {
					if(account[i].equals(acc)) {
						System.out.print("입금할 금액 : ");
						bal = sc.nextInt();
						if(bal > 0) {
							balance[i] += bal;
							System.out.printf("%,d원 입금되었습니다\n",bal);
							System.out.printf("%,d원 있습니다.\n",balance[i]);
							break;
						}
						else {
							System.out.println("입금실패");
							break;
						}
					}
					else if(i==cnt-1){
							System.out.println("없는 계좌입니다.");
					}	
				}
			}
			else if(menu ==3) {
				System.out.print("출금할 계좌 : ");
				acc = sc.next();
				for(int i=0; i<cnt; i++) {
					if(account[i].equals(acc)) {
						System.out.print("출금할 금액 : ");
						bal = sc.nextInt();
						if(bal>0) {
							if(balance[i]>=bal) {
								balance[i] -= bal;
								System.out.printf("%,d원 출금하였습니다\n",bal);
								System.out.printf("%,d원 있습니다\n",balance[i]);
								break;
							}
							else {
								System.out.println("출금실패");
								break;
							}
						}
						else {
							System.out.println("출금실패");
						}
					}
					else if(i==cnt-1){
						System.out.println("없는 계좌입니다.");
					}	
				}
			}
			else if(menu ==4) {
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("=================================");
				for(int i=0; i<cnt;i++) {
					System.out.printf("%s\t%s\t%,d\n",
							name[i],account[i],balance[i]);
				}
			}
			else if(menu ==0) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("다시선택");
			}
		}
	}

}