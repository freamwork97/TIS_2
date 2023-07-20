package day10;

public class Calculator {
    int num1;
    int num2;

    // 메서드 형식
    // 접근제한자 리턴타입 메서드명(매개변수){
    // 실행문구
    // }

    // 메서드명 sum 타입리턴x 매개변수x 실행문구 필드 num1+num2 출력
    public void sum() {
        System.out.println(num1 + num2);
    }

    // 메서드명 sub 타입리턴x 매개변수 정수2개 실행문구 매개변수로 받은 두개 값의 차
    public void sub(int a, int b) {
        System.out.println(a - b);
    }

    // 메서드명 mul 타입리턴o 매개변수x 실행문구 필드 num1*num2 리턴
    public int mul() {
        return num1 * num2;
    }

    // 메서드명 div 타입리턴o 매개변수 정수2개 실행문구 매개변수로 받은 두개의 나눈 값 리턴
    public double div(int a, int b) {
        return a / (double) b;
    }
}
