package MyJavaStudy;


//배열에 저장된 점수들의 총점, 평균, 최솟값, 최대값을 구하는 예제
public class Test37 {
    public static void main(String[] args) {

        int [] score = {90, 85, 78, 100, 98};
        int sum = 0; //총점
        double avg = 0.0; //평균
        int max = 0; //최대값
        int min = 999; //최솟값 //999로 초기화한 이유는 score 배열에 저장된 값들보다 큰 수로 초기화함으로써
                       // 첫 번째 배열의 값을 무조건 저장하기 위해서이다.

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
            if (max<score[i]) //if 문의 조건식이 true 일 때는 {}를 생략해도 상관 없다.
                max = score[i];

            if (min > score[i])
                min = score[i];

        }

        avg = sum / score.length;
        System.out.println("총 점 : "+sum);
        System.out.println("평 균 : "+avg);
        System.out.println("최댓값 : "+max);
        System.out.println("최솟값 : "+min);
    }
}
