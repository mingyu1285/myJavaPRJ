package WeAreFamily;

public class JunsuKun {
    public static void main(String[] args) {

        int n = 5;
        String s = "*";
        for (int i = 0; i<n; i++){
            for (int j = 4; j>i; j-- ){
                System.out.print(" ");
            }
            System.out.println(s);
            s += "*";

        }

    }
}
