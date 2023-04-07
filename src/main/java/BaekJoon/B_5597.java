package BaekJoon;

import java.util.Scanner;

public class B_5597 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean boolArr[] = new boolean[31];

        for (int i = 0; i < 28; i++) {
            boolArr[s.nextInt()] = true;
        }
        for (int i = 1; i <=30; i++) {
            if (!boolArr[i]) System.out.println(i);

        }

//
//        for (int i = 0; i < 30; i++) {
//            boolArr[i] = false;
//        }
//        for (int i = 0; i < 28; i++) {
//            boolArr[s.nextInt()-1] = true;
//
//        }
//
//        for (int i = 0; i < 30 ; i++) {
//            if (!boolArr[i]){
//                System.out.println(i+1);
//            }
//
//        }






//        int nonumber[] = new int[28];
//        int arr[] = new int[30];
//        int i, j;
//        for (int k = 0; k < arr.length; k++) {
//            arr[k] = -1;
//        }
//
//        for (int k = 0; k < 28; k++) {
//            arr[s.nextInt() - 1] = 1;
////            nonumber[k] = s.nextInt();
////            for (int l = 0; l < arr.length; l++) {
////                if (arr[k]!=nonumber[k]){
////
////                }
////            }
//        }
//        for (int k = 0; k < arr.length; k++) {
//            if (arr[k] == -1) {
//                System.out.println(k + 1);
//            }
//        }


    }
}

