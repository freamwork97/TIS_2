package day05;

import java.util.Scanner;

public class 배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] a = {1,2,3,4,5};
		// for(int i=0; i<a.length; i++) {
		// 	if(i==a.length-1) {
		// 		System.out.print(a[i]);
		// 	}
		// 	else {
		// 		System.out.print(a[i]+",");
		// 	}
			
		// }
		
		// a배열의 전체 합 출력
		// int sum=0;
		// for(int i=0; i<a.length; i++) {
		// 	sum +=a[i];
		// }
		// System.out.println(sum);
		
		// int[] b = new int[10];
		
		// for(int i =0; i<b.length;i++) {
		// 	System.out.print("b배열의 "+i+"번째 인덱스 : ");
		// 	b[i] = sc.nextInt();
		// }
		// b배열의 짝수번째 인덱스 값만 출력
		// for(int i =0; i<b.length;i++) {
		// 	if(i%2==0) {
		// 		System.out.print("b배열의 "+i+"번째 인덱스 : ");
		// 		System.out.println(b[i]);
		// 	}
		// }
		// b배열의 값들중 짝수값만 출력
		// for(int i=0; i<b.length; i++) {
		// 	if(b[i] %2==0) {
		// 		System.out.println(b[i]);
		// 	}
		// }
		// b배열의 값들중 홀수인 것의 합 출력
		// int sum=0;
		// for(int i=0; i<b.length; i++) {
		// 	if(b[i] %2!=0) {
		// 		sum +=b[i];
		// 	}
		
		// }
		// System.out.println(sum);
		
		// b배열의 값들중에 3의 배수의 합 5의 배수의 합 3,5의 배수의합 둘다 아닌값의 합출력
		// int s3=0;
		// int s5=0;
		// int s35=0;
		// int snon=0;
		
		// for(int i=0; i<b.length; i++) {
		// 	if(b[i]%3==0) {
		// 		if(b[i]%5==0) {
		// 			s35 += b[i];
		// 			s3 += b[i];
		// 		}
		// 		else {
		// 			s3 += b[i];
		// 		}
		// 	}
		// 	else if(b[i]%5==0) {
		// 		if(b[i]%3==0) {
		// 			s35 += b[i];
		// 			s5 += b[i];
		// 		}
		// 		else {
		// 			s5+=b[i];
		// 		}
		// 	}
		// 	else {
		// 		snon += b[i];
		// 	}
		// }
		
		
		// for(int i=0; i<b.length; i++) {
		// 	if(b[i] % 3 == 0 && b[i] % 5 == 0) {
		// 		sum35 += b[i];
		// 	}
		// 	if(b[i] % 3 == 0) {
		// 		sum3 += b[i];
		// 	}
		// 	if(b[i] % 5 == 0) {
		// 		sum5 += b[i];
		// 	}
		// 	if(b[i] % 3 != 0 && b[i] % 5 != 0) {
		// 		sum += b[i];
		// 	}
		// }
		
		// for(int i=0; i<b.length; i++) {
		// 	if(b[i] % 3 == 0 && b[i] % 5 == 0) {
		// 		sum35 += b[i];
		// 		sum3 += b[i];
		// 		sum5 += b[i];
		// 	}else if(b[i] % 3 == 0) {
		// 		sum3 += b[i];
		// 	}else if(b[i] % 5 == 0) {
		// 		sum5 += b[i];
		// 	}else {
		// 		sum += b[i];
		// 	}
		// }
		// System.out.println("3의배수 : "+s3);
		// System.out.println("5의배수 : "+s5);
		// System.out.println("3과5의배수 : "+s35);
		// System.out.println("둘다x : "+snon);
		
		
		int[] c= {1,2,3,4,5};
		// 0번쨰 인덱스에 모든값 누적
		// for(int i=1; i<c.length; i++) {
		// 	c[0] += c[i];
		// }
		// System.out.println(c[0]);
		
		// 배열의 값을 한칸씩 앞당기기
		// 예시 c = {2,3,4,5,1}
		int t = 0;
		for(int i=0; i<c.length; i++) {
			if(i==0) {
				t = c[i];
			}
			else if(i == c.length-1) {
				c[i]=t;
				System.out.println(c[i]);
				break;
			}
			c[i] = c[i+1];
				System.out.println(c[i]);
		}

	}

}
