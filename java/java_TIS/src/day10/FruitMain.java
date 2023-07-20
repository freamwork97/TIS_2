package day10;

public class FruitMain {
    public static void main(String[] args) {
        Fruit apple = new Fruit();
        apple.name = "사과";
        apple.color = "빨강";
        apple.isSeed = true;
        // 두번째 생성자 사용하여 바나나 객체 생성
        Fruit banana = new Fruit("바나나");
        banana.color = "노랑";
        banana.isSeed = false;
        // 세번째 생성자 사용하여 멜론 객체 생성
        Fruit melon = new Fruit("멜론", "초록");
        melon.isSeed = true;
        // 네번째 생성자를 사용하여 오렌지 객체 생성
        Fruit orange = new Fruit("오렌지", "주황", true);

        System.out.println("색상\t색상\t씨앗유무");
        System.out.println("========================");
        apple.print();
        banana.print();
        melon.print();
        orange.print();
    }
}
