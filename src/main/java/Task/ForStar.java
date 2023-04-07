package Task;

public class ForStar {
    public static void main(String [] args){
        for (int i= 0, j =1; i<5;  j++){
            System.out.printf("*");

            if (j-1 == i){
                System.out.println("");
                i++;
                j=0;
             }
        }
    }
}
