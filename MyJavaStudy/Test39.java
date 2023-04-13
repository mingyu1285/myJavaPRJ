package MyJavaStudy;

//오른쪽 대각선 1,7,13,19,25의 합을 구하기
//공통점은 (0,0),{1,1),(2,2),(3,3),(4,4) 이다.
public class Test39 {
    public static void main(String[] args){
        int [][] arr = { {1,2,3,4,5},
                         {6,7,8,9,10},
                         {11,12,13,14,15},
                         {16,17,18,19,20},
                         {21,22,23,24,25} };

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {//행의 갯수만큼 반복
            for (int j = 0; j <arr[i].length ; j++) { //열의 개수만큼 반복 ... 2차원배열을 순회하는 for문 기본적으로 그냥 외우자
                if (i == j) //행의 i가 열의 j랑 같아지면 sum의 값에 대입하게 된다.
                    sum += arr[i][j];

            }
        }
        System.out.println("합계 : "+sum);
    }
}
