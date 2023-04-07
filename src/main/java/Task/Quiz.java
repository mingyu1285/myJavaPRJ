package Task;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        int[] check = new int[10];

        // 숫자 입력받기
        System.out.println("중복되지 않은 다섯개의 숫자를 입력해주세요.");
        for (int i = 0; i < 5; i++) {
            int x = s.nextInt();
            if (check[x] == 1) { //배열의 초기 값은 모두 0 이므로 x에 5를 넣어서 check[5] 에 1을 저장한다.
                // arr[i]=x 를 하면 arr[i]값에 x 가 들어가고 다시 위로 올라가서 i를 1증가 시킨후 x를 또 넣는다 그 x값이 1이면 중복이 되고 i--로 다시 쓰게 한다.
                //값이 0 이면 반복 해서 중복 된 숫자들을 검사한다.
                System.out.println("중복된 숫자입니다. 다시 입력해주세요.");
                i--;
            } else {
                check[x] = 1;
                arr[i] = x;
            }
        }

        //정렬하기
        for (int i = 0; i < 4; i++) {
            int index = i;
            for (int j = i+1; j < 5; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[i]; //잔디 심기에 올렸던 거랑 똑같음 새로운 변수에 미리 값을 저장해놓는다. n3 = n1
            arr[i] = arr[index]; //n1 = n2
            arr[index] = temp; // n2 = n3 형식이 됨
        }

        // 정렬된 숫자 출력하기
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]);
        }
    }
}
//        Scanner s = new Scanner(System.in);
//
//        int arr[] = new int[5];
//        int check[] = new int[5];
//
//        System.out.println("중복되지 않은 다섯개의 숫자를 입력해주세요");
//        for (int i = 0; i < 5; i++) {
//            int x = s.nextInt();
//            arr[i] = x; //arr[i]랑 그 다음 값이 i-1이랑 비교했을 때 같으면 false
//
//        }
//        for (int i = 0; i < 4; i++) { // index를 생성한 후 arr[j] 번째가 arr[index]번째 보다 작으면 index에 j값을 넣어줌
//            int index = i; //index 변수 생성
//            for (int j = i+1; j < 5 ; j++) { //반복문을 이용하여 검사를 함.
//                if (arr[j] < arr[index]){ // arr[j]가 arr[index]보다 작으면 index에 j값을 넣음으로써 arr[j]가 arr[index]보다 작을 때 마다 값을 초기화 시킴.
//                    index = j;//작을 때 마다 index 값 초기화중.
//                }
//            }
//            //안쪽 for문이 끝나면 temp라는 임의의 변수 하나를 생성 후 그 안에 arr[i] 값을 저장해줌. 왜냐하면  한 번 더 위로 올라가서 배열 위치 값이 증가하면서 값을 비교하기 때문에 미리 저장 시켜놔야함.
//            int temp = arr[i]; // n3  = n1;
//            arr[i] = arr[index]; //n1 = n2;
//            arr[index] = temp; // n2 = n3;
//        }
//
//        System.out.println(Arrays.toString(arr)); //정렬된 배열을 출력함. Arrats.toString => 문자열로 받아옴 (arr) 개수만큼 출력함
//    }

