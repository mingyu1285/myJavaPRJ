public class Hello {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("안녕하세요123");
    }
}
