package Ex07;

public class Ex07_10 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        for (i=1; i<=100; i++){
            if (i%3 == 0) { //if(!(i%3==0)) 이런식으로 써도 돼서 continue는 사실 잘 안 씀.
//                continue;
            }else {
                hap += i;
            }

        }
        System.out.printf("1~100까지의 합(3의 배수의 제외): %d \n ",hap);
    }
}
