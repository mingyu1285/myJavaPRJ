public class Ex03_07 {
    public static void main(String[] args) {
        int a;
        float b;
        a=(int)123.45f;
        //b=200; 은 b가 float이기 때문에 올바르지 않은 값이다.
        b=200.0f;
        System.out.printf("a의 값 ==> %d \n",a);
        System.out.printf("b의 값 ==> %f \n",b);
    }
}
