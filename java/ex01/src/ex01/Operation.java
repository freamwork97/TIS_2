package ex01;

public class Operation {
    public static void run() {
        // 산술연산
        int kor = 50;
        int eng = 88;
        int mat = 76;
        int sum = kor + eng + mat;
        double avg = sum / (double) 3;

        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + mat);
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", avg);

        String pass = (kor >= 60 && eng >= 60 && mat >= 60 && avg >= 70) ? "합격" : "불합격";

        System.out.printf("결과 : %s\n", pass);

        int count = 0;
        if (kor < 60)
            count++;

        if (eng < 60)
            count++;

        if (mat < 60)
            count++;

        System.out.println("누락 과목수 : " + count);
    }
}
