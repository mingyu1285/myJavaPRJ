package Quiz;

import java.util.Scanner;

public class JunsuQuiz {
    //Quiz : 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
    // Ex: 0 1 2 2 2 7 입력 하면 킹 1개 폰 8개 이므로 더해야하는 값이 정답이된다. 1 0 0 0 0 1 퀸 룩 비숍 나이트는 더 할 필요가 없으니 0

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = {1,1,2,2,2,8};
        int [] arr2 = new int[6];
        int [] arr3 = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]){
                arr3[i] = arr[i] - arr2[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
