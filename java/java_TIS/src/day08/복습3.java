package day08;

import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int cnt=0;
		while(true) {
			System.out.println("=====은행=====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 0.종료");
			System.out.print("메뉴선택 : ");
			int menu=sc.nextInt();
			
			if(menu==1) {
				System.out.print("이름 : ");
				name[cnt] = sc.next();
				System.out.print("계좌번호 : ");
				account[cnt] = sc.next();
				System.out.print("초기잔액 : ");
				balance[cnt] = sc.nextInt();
				
				cnt++;
			}
			else if(menu==2) {
				System.out.print("입금할 계좌 : ");
				String acc = sc.next();
				for(int i =0; i<cnt; i++) {
					if(account[i].equals(acc))
					{
						System.out.print("입금할 금액 : ");
						int bal = sc.nextInt();
						if(bal>0) {
							System.out.printf("%d원 입금\n",bal);
							balance[i] +=bal;
							break;
						}
						else {
							System.out.println("입금실패");
						}
					}
					else if(i==cnt-1) {
						System.out.println("없는 계좌");
					}
				}
			}
			else if(menu==3) {
				System.out.print("출금할 계좌 : ");
				String acc = sc.next();
				for(int i=0; i<cnt; i++) {
					if(account[i].equals(acc)) {
						System.out.print("출금할 금액 : ");
						int bal = sc.nextInt();
						if(bal >0) {
							if(balance[i]>=bal) {
								System.out.printf("%,d원 출금\n",bal);
								balance[i] -= bal;
								break;
							}
							else {
								System.out.println("잔액부족");
								break;
							}
						}
						else {
							System.out.println("출금실패");
						}
					}
					else if(i==cnt-1) {
						System.out.println("없는 계좌");
					}
				}
			}
			else if(menu==4) {
				System.out.println("계좌목록");
				System.out.println("이름\t계좌번호\t보유금");
				System.out.println("=======================");
				for(int i=0; i<cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n",
							name[i],account[i],balance[i]);
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
