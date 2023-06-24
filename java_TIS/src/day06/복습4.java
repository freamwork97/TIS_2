package day06;

import java.util.Scanner;

public class 복습4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {12,3,4,5,34}; // a배열의 길이 5
//		
//		//a배열의 0번째 값을 출력할 땐 a[0]
//		for(int i=0; i<a.length; i++) { //i는 0부터 4까지 반복
//			if(i==a.length-1) {  // a.length =5 i가 4일 때 실행
//				System.out.println(a[i]);
//				break;
//			}
//			System.out.print(a[i]+",");
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		int[] b = new int[10]; // 길이 10인 빈 배열 b생성
//		b[3] = 5;
//		
//		//b배열에 1~10까지 값을 넣으세요
//		
//		for(int i=0; i<b.length; i++) {
//			System.out.print("숫자입력 : ");
//			b[i] = sc.nextInt();
//			if(i==b.length-1) {
//				for(int j=0; j<b.length; j++) {
//					System.out.printf("b[%d]배열 : %d\n",j,b[j]);
//				}
//			}
//		}
		
//		int[] c = {12,3,5,2,15};
//		//c배열의 총합 출력
//		int s=0;
//		for(int i=0; i<c.length; i++) {
//			s+=c[i]; // s에 c[0]부터 c[4]까지 더한다
//		}
//		System.out.println(s);
	
		//d[0]째에 모든 값 누적
//		int[] d = {12,3,2,24,42};
//		
//		for(int i =1; i<d.length; i++) {
//			d[0] += d[i]; 
//		}
//		System.out.println(d[0]);

		int[] e = {12,3,2,24,42};
		// e = {3,2,24,42,12}
		int t =e[0];
		for(int i=1; i<e.length; i++) {
			
			e[i-1] = e[i];
			if(i==e.length-1) {
				e[i] =t;
			}
		}
		for(int i=0; i<e.length; i++) {
			System.out.println(e[i]);
		}
	}

}
