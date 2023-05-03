package Ex09;

public class Ex09_13 {

    static int b= 10;
    public static int plus(int v1, int v2){
        int result;
        result = v1+v2;
        return result;
    }

    public static void main(String[] args) {
        int hap;
        hap = plus(100,200);
        System.out.printf("100과 200의 plus() 메서드 결과는 :%d\n",hap);
        System.out.println(b);
    }
}
