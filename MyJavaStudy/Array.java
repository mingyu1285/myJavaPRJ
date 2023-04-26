package MyStudy;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        int hap = 0;

        for (int i = 0; i < arr.length; i++) {
            hap+=arr[i];
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.printf("최대 값 : %d / 최소 값 : %d / 총합 : %d / 평균 : %d",max,min,hap,hap/arr.length);
    }
}
