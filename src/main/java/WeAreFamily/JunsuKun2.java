package WeAreFamily;

import java.util.Scanner;

public class JunsuKun2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int [] arr;
        int n = s.nextInt();
        arr = new int[n];
        int count = 0;

        for (int i=0; i <arr.length; i++){
            int x = s.nextInt();
            arr[i] = x;
        }
        int l = s.nextInt();
        for (int k = 0; k<arr.length; k++){
            if (arr[k] == l){
                count = count+1;
            }
        }
        System.out.printf("%d",arr.length-count );



    }
}
