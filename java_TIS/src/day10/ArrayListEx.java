package day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        String[] a = new String[10];
        a[0] = "안녕";
        a[1] = "반가워요";
        a[2] = "잘있어요";
        // System.out.println(a[0]);
        a[0] = "안녕하세요";

        // arrayList
        List<String> b = new ArrayList<String>(); // ArrayList생성
        b.add("안녕"); // 값 추가
        b.add("반가워요");
        b.add("잘있어요");
        // System.out.println(b.get(0)); // 값 확인
        b.set(0, "안녕하세요");

        // a와 b의 값을 for문으로 출력
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < b.size(); i++) { // size()는 리스트의 길이
            System.out.println(b.get(i));
        }

    }
}
