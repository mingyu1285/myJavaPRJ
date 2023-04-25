package MyStudy;

public class Method {

    void takeOff(){// <-- 제어자를 특별히 지정하지 않았으므로
        //접근 제한자는 default로 적용이 된다.
        //메서드가 실행된 후 돌려주는 값이 없으므로 반환 타입은 void로
        //지정했으며, 매개변수도 없어서 메서드 이름 다음에 괄호 안을 비어둠.

        System.out.println("엔진을 구동하다");
        System.out.println("속도를 높이다");
        System.out.println("비행하다");
    } //

    public static void main(String[] args) {

    }
}
