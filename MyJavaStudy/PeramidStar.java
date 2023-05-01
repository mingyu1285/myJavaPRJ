package MyStudy;

public class PeramidStar {
    public static void main(String[] args) {

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 4-j; i++) { //행 for문이 반복될때 마다 공백은 한 칸씩 줄어야되기 때문에 4-j가 된다
                System.out.printf(" ");
            }
            for (int i = 0; i < 2*j+1; i++) {
                System.out.printf("*");
            }
            System.out.println();
        }




    }
}
