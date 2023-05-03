package Ex09;

import java.util.Scanner;

public class Ex09_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str, strRep, strRep2 ,strSub, strAry[];

        System.out.print("문자열을 입력하세요 : ");
        str = s.nextLine();

        strRep = str.replace(" ", "$");
        //replaceAll()을 더 많이 사용하는데  replace(target(이 단어와 매칭 되는 단어만 바꿈 : ) replaceAll( regex:);
        strRep2 = str.replaceAll("\\s", "\\$"); // \\를 붙여야됨 s는 space의 약자 공백을 의미
        strSub = str.substring(3, 8);
        strAry = str.split(" ");

        System.out.println("입력 문자열 ==> "+str);
        System.out.println("바꾼 문자열 ==> "+strRep);
        System.out.println("바꾼 문자열 ==>"+strRep2);
        System.out.println("일부 문자열 ==> "+strSub);
        for (int i = 0; i < strAry.length; i++) {
            System.out.println("분리한 문자열"+i+"==>"+strAry[i]);
        }
    }
}
