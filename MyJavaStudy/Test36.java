package MyJavaStudy;


//배열 실습 알파벳 처리
public class Test36 {
    public static void main(String[] args) {
        char letter = 'A'; // char 타입은 문자의 유니코드 값을 저장하는 데이터 타입. 'A'의 유니코드는 65이다. 따라서 65를 저장
        char [] alphabet = new char[26];//알파벳 A부터 Z까지 26개이므로 26개의 배열이 필요함

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (letter+i);//자바에서 서로 다른 타입끼리 연산을 하면 그중 큰 크기의 타입으로 자동 변환된다.
            //따라서 char 와 int의 연산결과는 int 타입으로 바뀐다. 하지만 alphabet 배열은 char 타입 배열이므로 int 타입으로 저장할 수 없다.
            //왜냐하면 char 타입은 2바이트이고 int 타입은 4바이트이기 때문에  강제로 char타입으로 캐스팅 해야 배열에 값을 저장할 수 있게 된다.
            //주의해야 할 점은 ()로 식을 감싸야 한다는 것이다.
        }
        for (char c : alphabet){ // 확장 for문을 사용했다. 이 for문은 alphabet 배열의 요소 수만큼 반복 실행된다.
                                // 그리고 반복이 될 때 마다 변수 c에는 alphabet 배열의 첫 번째 요소부터 마지막 요소까지 차례로 저장된다.
            System.out.println(c); // 여기서 출력한다.
        }
    }
}
