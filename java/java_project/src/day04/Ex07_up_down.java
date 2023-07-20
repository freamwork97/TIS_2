//package day04;
//
//import java.util.Scanner;
//
//public class Ex07_up_down {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int answer = (int)(Math.random()*31)+1; // 1~31까지 랜덤숫자
////		System.out.println(answer);
//		int sum=0;
//		String re="";
//		while(true) {
//			System.out.println("Up & Down");
//			System.out.printf("도전가능%d회\n",(5-sum));
//			System.out.print("숫자입력 : ");
//			int num=0;
//			if(sc.hasNextInt()) {
//				num = sc.nextInt();sc.nextLine();
//			}
//			else {
//				sc.nextLine();
//				System.out.println("숫자만 입력가능");
//				System.out.println();
//				continue;
//			}
//			
//			
//			// up, down, 정답후 반복문 종료
//			if(sum==5) {
//				System.out.println("실패");
//				System.out.println("재시도하시겠습니까?(Y/y) : ");
//				re = sc.next();
//	
//				if(!re.equals("Y") && !re.equals("y")) {
//					break;
//				}
//				answer = (int)(Math.random()*31)+1;
//				sum=0;
//			}
//			else if(num == answer){
//				sum+=1;
//				System.out.println("정답");
//				System.out.printf("%d회\n",sum);
//				System.out.println("계속하시겠습니까?(Y/y) : ");
//				re = sc.next();
//				if(!re.equals("Y") && !re.equals("y")) {
//					break;
//				}
//				answer = (int)(Math.random()*31)+1;
//				sum=0;
//			}
//			else if(num > answer) {
//				System.out.println("DOWN");
//				sum +=1;
//				System.out.println("========");
//			}
//			else if(num < answer) {
//				System.out.println("UP");
//				sum +=1;
//				System.out.println("========");
//			}
//
//		}
//		System.out.println("프로그램 종료");
//	}
//
//}

package day04;

import java.util.Scanner;

public class Ex07_up_down {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 // 1~31까지 랜덤숫자
//		System.out.println(answer);
		int cnt = 0;
		int t = 10;
		int answer = (int)(Math.random()*31)+1;
		while(true) {
			System.out.println("Up & Down 시도가능횟수 : "+(t-cnt));
			System.out.print("숫자입력> ");
			int num = 0;
			if(sc.hasNextInt()) {
				num = sc.nextInt();sc.nextLine();
				cnt++;
			}else {
				sc.nextLine();
				System.out.println("숫자만 입력가능");
				System.out.println();
				continue;
			}
			
			// up, down, 정답후반복문 종료
			if(num == answer) {
				System.out.println("시도횟수 : "+cnt);
				if(cnt == 1) {
					System.out.println("perfect");
				}else if(cnt <= 3) {
					System.out.println("good");
				}else if(cnt <= 5) {
					System.out.println("noraml");
				}else {
					System.out.println("soso");
				}
				break;
			}else if(cnt == 10) {
				System.out.println("시도횟수 초과");
				System.out.print("재시작?(Y/y)> ");
				String re = sc.next();
				if(!(re.equals("Y") || re.equals("y"))) {
					break;
				}
				cnt = 0;
				answer = (int)(Math.random()*31)+1;
			}else if(num > answer) {
				System.out.println("down");
			}else if(num < answer) {
				System.out.println("up");
			}
			System.out.println();
		}
		System.out.println("게임종료");
	}

}
