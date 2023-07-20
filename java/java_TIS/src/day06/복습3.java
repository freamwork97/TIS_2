package day06;

import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // 입력받을 준비
		int answer = (int)(Math.random()*31)+1; // 1~31까지 랜덤 숫자 생성
//		System.out.println(answer); // 정답부분
		
		// while문으로 up&down 게임만들기
		int cnt=1; // 초기 카운트횟수
		int a=10; // 초기 시도가능횟수 
		while(true) {
			System.out.printf("%d회째 시도중\n",cnt);
			System.out.printf("%d회 시도 가능\n",a);
			System.out.print("숫자입력 : ");
			int num = sc.nextInt(); // num에 입력한 숫자 저장
			a--; // a를 1 감소
			
			if (num == answer){ // num이 answer와 같을 때 실행
				System.out.println("정답");
				System.out.printf("%d회째 정답\n",cnt);
				break; // while문 종료
			}
			else if(a == 0) { // a가 0일 때 실행
				System.out.println("시도회수 초과");
				break; // while문 종료
			}
			else if(num < answer) { // num이 answer보다 작을 때 실행
				System.out.println("up");
			}
			else if(num > answer) { // num이 answer보다 클 때 실행
				System.out.println("down");
			}
			cnt++; // cnt 1증가
			System.out.println("==========");
		}
		System.out.println("프로그램 종료");
	}

}
