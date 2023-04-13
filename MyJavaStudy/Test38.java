package MyJavaStudy;

//5X5 크기의 2차원 배열을 생성하고 위의 그림처럼 값들을 초기화하는 소스입니다.
public class Test38 {
    public static void main(String[] args) {
        int [][] arr = new int[5][5]; //5X5 크기 배열 생성 new 연산자를 사용했으므로 자동으로 배열의 각 요소는 0으로 초기화된다.
        int num = 1; // 각 요소에 1부터 25까지 1씩 증가된 값을 저장하고자 선언한 변수입니다.
        for (int i = 0; i < arr.length; i++) {//arr 배열 행의 수
            for (int j = 0; j <arr[i].length ; j++) { // 2차원 배열에서 열의 길이는 행마다 다를 수 있으므로
                // 열의 수를 사용 할 때는 '배열 변수명[행 인덱스].length', 즉 arr[i].length로 표현한다.
                arr[i][j] = num++; // arr 배열의 i행과 j열에 해당하는 곳에 num 변수값을 저장한 후에 num 값을 1 증가시킨다.
            }
        }

        for (int i = 0; i < arr.length; i++) { //이 for문은 값을 출력하기 위한 for문임.
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");

        }
    }
}
