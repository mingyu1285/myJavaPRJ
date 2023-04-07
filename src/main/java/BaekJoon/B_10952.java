package BaekJoon;

import java.util.Scanner;

public class B_10952 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        while (true){
            a=s.nextInt();
            b=s.nextInt();

            if (a==0 && b ==0){
                s.close();
                break;
            }
            System.out.println(a+b);
        }



    }
}
