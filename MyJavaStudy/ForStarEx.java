package MyStudy;

public class ForStarEx {
    //*****
    // ****
    //  ***
    //   **
    //    *
    //for문으로 위에 모양 만들기
    public static void main(String[] args) {

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 0+j; i++) {
                System.out.printf(" ");
            }
            for (int i = 0; i < 5-j; i++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
