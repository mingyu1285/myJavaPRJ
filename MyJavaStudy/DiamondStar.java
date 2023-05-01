package MyStudy;

public class DiamondStar {
    public static void main(String[] args) {

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 4-j; i++) {
                System.out.printf(" ");
            }
            for (int i = 0; i < 2*j+1; i++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 1+j; i++) {
                System.out.printf(" ");
            }
            for (int i = 0; i < 7-j*2; i++) {
                System.out.printf("*");
            }
            System.out.println();
        }


    }
}
