package MyJavaStudy;

public class MethodExample {
    public static void main(String[] args) {
//        String a = "hello";
//        String b = "hongdroid";
//
//        System.out.println(a + b);
         MethodExample methodExample = new MethodExample();
//         methodExample.StrConbine("Hello","world"); //메소드 실행(String 타입 두개를 넘겨준거임

        System.out.println(methodExample.Strdroid("aw","wad"));
    }

    //메소드를 만드는 이유
    //1.유지보수를 위해서
    //2. 가독성이 좋아지니까
    //3. 캡슐화(여러 곳에서 중복된 코드를 작성할 필요가 없어짐)
    public void StrConbine(String a, String b){ //void는 실행형 메소드다.
        String result = a+b;

        System.out.println(result );
    }

    public String Strdroid (String a, String b){ // 리턴형 메소드
        String result = a + b;
        return result;

    }


}
