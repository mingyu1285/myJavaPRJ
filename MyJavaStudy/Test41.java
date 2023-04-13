package MyJavaStudy;

public class Test41 { //args는 String 타입의 배열 주소를 가지는 변수인데 이것을 명령행 매개변수라고 한다.
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
