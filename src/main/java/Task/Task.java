package Task;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        num = s.nextInt();

        if((num%3 ==0) && (num%2 ==0)){
            System.out.println("2와 3의 배수입니다.");
        } else if (num%3 ==0) {
            System.out.println("3의 배수입니다.");

        } else if (num%2 ==0) {
            System.out.println("2의 배수입니다.");

        }
    }
}
