package MyStudy;

public class ForStarEx2 {
//            *
//            **
//            ***
//            ****
//            *****
//            ******
//            *******
//            ******
//            ****
//            ***
//            **
//            *

    public static void main(String[] args) {

//        for (int j = 0; j < 7; j++) {
//            for (int i = 0; i < 1+j; i++) {
//                System.out.printf("*");
//            }
//            System.out.println();
//        }
//
//        for (int j = 0; j < 5; j++) {
//            for (int i = 0; i < 5-j; i++) {
//                System.out.printf("*");
//            }
//            System.out.println();
//        }

        for (int j = 0; j < 13; j++) {
            if (j<7){
                for (int i = 0; i < 1+j; i++) {
                    System.out.printf("*");
                }
                System.out.println();
            }else {
                for (int i = 0; i < 13-j; i++) {
                    System.out.printf("*");
                }
                System.out.println();
            }

        }

    }
}
