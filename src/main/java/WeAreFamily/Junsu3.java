package WeAreFamily;

import java.util.Scanner;

public class Junsu3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr;
        int n = s.nextInt();
        arr = new int[n];
        int index = 0;
        int max = arr[0];
        int min = arr[0];

        for (int i=0; i<arr.length; i++){
            int x = s.nextInt();
            arr[i] = x;
        }
        for (int k = 0; k<arr.length; k++){
            if (arr[k] > max){
                max = arr[k];
            }
            if (arr[k]<min){
                min = arr[k];
            }
        }
        System.out.println(max);
        System.out.println(min);


    }
}
