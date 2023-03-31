public class TaskForStar {

    public static void main(String[] args) {

        for (int i=0, j=1; i<5; j++){
            System.out.print("*");

            //J를 초기화 하고  I가 1씩 증가하여 차례대로 출력된다.
            if (j-1==i){
                System.out.println("");
                i++;
                j=0;

            }

        }
    }
}
