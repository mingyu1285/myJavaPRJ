package Quiz;

public class Quiz7 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5 ; j++) {
                System.out.printf(" ");
            }
            for (int j = i-3; j < 5; j++) {
                System.out.printf("*");
            }

            System.out.println();

        }
    }
}
