package day10;

public class CalculatorMain {
    public static void main(String[] args) {
        // 객체생성 후 각 메서드 호출하여 값 출력
        Calculator c = new Calculator(); // 객체생성

        c.num1 = 10;
        c.num2 = 3;

        c.sum();
        c.sub(8, 7);
        System.out.println(c.mul());
        System.out.println(c.div(6, 5));
        System.out.println("========================");

        Calculator c1 = new Calculator(); // 객체생성
        c1.num1 = 9;
        c1.num2 = 4;
        c1.sum();
        c1.sub(7, 2);
        System.out.println(c1.mul());
        System.out.println(c1.div(10, 3));
    }
}
