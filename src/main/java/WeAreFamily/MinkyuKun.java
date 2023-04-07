package WeAreFamily;

import java.util.Scanner;

public class MinkyuKun {
    public static void main(String[] args) {

        //입력 받은 수를 작은 수 부터 큰 수까지의 합을 출력
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt(); //5
        int n2 = s.nextInt();  //2
        int result = 0;
        int n3= 0;

        if (n1<n2){
            for (int i = n1; i <= n2; i++) {
                result += i;
            }
        } else if (n1>n2) {
            n3 = n1;
            n1 = n2;
            n2 = n3;
            for (int i = n1; i <= n2; i++) {
                result +=i;
            }
        }


        System.out.printf("%d",result);



    }
}
