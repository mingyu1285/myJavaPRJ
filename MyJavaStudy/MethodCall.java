package MyStudy;

public class MethodCall {

    //메서드 호출

    //[메서드 호출]
    // 메서드명();

    //메서드 실행을 멈추고 값 반환하기
    //return은 메서드의 실행을 중지하는 명령문이다.

//    public void takeOff(){
//        System.out.println("엔진을 시동하다.");
//        System.out.println("엔진 시동이 실패하다");
//        return; // --> 여기서 return은 실행을 종료하는 명령문이므로 다음에 실행문이 나온다는 것은 논리적으로 잘못된 것 그래서 오류가 남.
//        System.out.println("상승 속도를 증가하다");
//        System.out.println("비행하다");
//    }

    //반환값
    //return 문은 메서드의 실행을 중지하고 메서드를 호출한 곳으로 되돌아가게 하는 명령이다.
    //그런데 메서드 호출한 곳으로 되돌아가면서 특정한 값을 전달할 수가 있다.
    //이것을 '반환값'이라고 한다.
    //반환 값을 지정학 싶으면 아래와 같이 return 다음에 작성하면 된다.

    //[반환값]
    //return 값;

//    public void takeOff(){
//        System.out.println("엔진을 시동하다");
//        System.out.println("엔진 시동이 실패하다");
//        return false;
//    }
    //위에 코드는 컴파일 오류가 발생.
    //이유는 메서드 선언부에 반환 타입이 void로 지정되어 있기 때문이다.
    //void는 값이 없다는 의미로 return될 때 돌려주는 값, 즉 반환 값이 필요 없다는 뜻이다.
    //선언부에서 반환타입을 고쳐주면 된다.
    //false의 반환타입은 boolean이다.
    //아래와 같이 코딩한다.
//
//    public boolean takeOff(){
//        System.out.println("엔진을 시동하다");
//        System.out.println("엔진 시동이 실패하다");
//        return false;
//    }
//
//    //또 다른 예시
//    public int takeOff(){
//        System.out.println("엔진을 시동하다");
//        System.out.println("엔진 시동이 실패하다");
//        return 0;
//    }

    public static void main(String[] args) {

    }
}
