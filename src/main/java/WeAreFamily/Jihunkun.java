package WeAreFamily;

import java.util.Random;
import java.util.Scanner;

public class Jihunkun {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int ai [] =  new int[4];
        Random random = new Random();
        int mynumber[] = new int[4];
//        String result [] = new String[];

        for (int i = 1; i < ai.length; i++) {
            ai[i] = random.nextInt(3)+1;
            for (int j = 0; j<i; j++){
                if (ai[i] == ai[j]){
                    i--;
                }
            }
        }

//        for (int i = 1; i < ai.length; i++) { ai가 랜덤값 세개를 출력하는걸 보여주는 코드
//            System.out.println(ai[i]);
//        }
        int goal;
        while(true){
            for (int i = 1; i < mynumber.length; i++) {
                mynumber[i] = i;

            }
            break;
        }














    }
}
