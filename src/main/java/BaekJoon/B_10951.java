package BaekJoon;

import java.util.Scanner;

public class B_10951 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a,b;

        for (int i =1; i<=5; i++){
            a=s.nextInt();
            b=s.nextInt();
            if ((a>0 && b<10)){
                System.out.println(a+b);
            }
        }


    }
}
