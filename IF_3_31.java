import java.util.Scanner;

public class IF_3_31 {
    public static void main(String[] args) {
        int a,b;
        Scanner s = new Scanner(System.in);

        a = s.nextInt();

        if (a>=90){
            System.out.printf("당신의 점수는 %d 점이고 예상 학점입니다.A학점입니다.",a);
        } else if (a>=75) {
            System.out.printf("당신의 점수는 %d 점이고 예상 학점입니다.B학점입니다.",a);
        }else if (a>=50){
            System.out.printf("당신의 점수는 %d 점이고 예상 학점입니다.C학점입니다.",a);
        }else {
            System.out.printf("당신의 점수는 %d 점이고 예상 학점입니다.F학점입니다.",a);
        }

    }
}
