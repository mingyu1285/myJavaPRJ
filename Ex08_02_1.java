package Ex08;

import java.util.Scanner;

public class Ex08_02_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int aa []= new int[4];
        int hap=0;

        for (int i = 0; i < aa.length; i++) {
            System.out.printf(i+1+"번째 숫자를 넣으세요 : ");
            aa[i] = s.nextInt();
            hap += aa[i];
        }
        System.out.printf("합계 : %d",hap);
    }
}
