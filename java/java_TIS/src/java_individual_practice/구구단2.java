package java_individual_practice;
import java.util.Scanner;

public class 구구단2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 단을 보시겠습니까? : ");
        int num = sc.nextInt();

        for(int i = 1; i<10; i++){
            System.out.println(num+"X"+i+"="+num*i); 
        } 
        sc.close();
    }
    
}
