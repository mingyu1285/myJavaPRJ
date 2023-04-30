package MyStudy;

import java.io.FileWriter;
import java.io.IOException;

public class OOP {
    public static void main(String[] args) throws IOException {

        // class : System, Math, FileWriter
        // instance : f1, f2가 가리키고 있는 값
        //
        System.out.println(Math.PI); //Math -> 수학고 관련된 PI ->파이 == 파이의 값을 출력함
        System.out.println(Math.floor(1.8)); // 바닥 //소수점 이하를 0으로 만듦
        System.out.println(Math.ceil(1.8)); // 천장 //소수점 이하에서 반올림 하여 값을 출력
        FileWriter f1 = new FileWriter("data.txt"); //어떤 정보를 기록할 때 사용
        f1.write("Hello");
        f1.write("Java");
        //HelloJava 라고 data.txt에 기록된다.
        f1.close();

        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("Hello");
        f2.write("Java");

        //파일 작업을 끝냈다는 뜻 close();
        f2.close();

    }
}
