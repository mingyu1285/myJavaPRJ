import java.util.Scanner;

public class Task999 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("1~9부터 원하는 구구단을 입력하세요 :");

        int a = s.nextInt();

        if ((a>0)&& (a<10)){
            for (int i=1; i<=9; i++){
                System.out.printf("%d * %d = %d\n",a,i,a*i);
            }
        }else{
            System.out.printf("다른 숫자를 입력해주세요.");
        }
    }


}
