package BaekJoon;

import java.util.Scanner;

public class B_2439 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.printf("별 개수를 입력하세요 : ");
        int a = s.nextInt();

        for (int i=1; i<=a; i++){
            for (int j=a-i; j>0; j--){
                System.out.printf(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.printf("*");
            }
            System.out.println("");
        }

    }
}
