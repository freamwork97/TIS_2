package day10;

public class AnimalMain {
    public static void main(String[] args) {
        System.out.println("이름\t울음소리\t다리");
        System.out.println("====================");
        Animal dog = new Animal();
        // dog.name = "강아지";
        dog.setName("강아지");
        // System.out.println(dog.getName());
        dog.setSound("멍멍");
        dog.setLeg(4);

        dog.print();

        // cat, chicken, snake 객체 생성하여 값 셋팅

        Animal cat = new Animal();
        cat.setName("나비탕");
        cat.setSound("야옹");
        cat.setLeg(4);
        cat.print();

        Animal chicken = new Animal();
        chicken.setName("후라이드");
        chicken.setSound("꼬끼오");
        chicken.setLeg(2);
        chicken.print();

        Animal snake = new Animal();
        snake.setName("뱀술");
        snake.setSound("스윽");
        snake.setLeg(0);
        snake.print();
    }
}
