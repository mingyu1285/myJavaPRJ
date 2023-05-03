package Ex09;

public class Test01 {
    public static void main(String[] args) {
        String log ="123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";

        //문제1 ip만 출력하기
        String strIp[] = log.split(" ");

        System.out.println("ip는 : "+strIp[0]);

        //문제2 호출날짜와 시간만 출력
        strIp = log.split(" ");
        System.out.println("시간 : "+strIp[3]);
        String time;
        time = strIp[3].replace("[", "");
        System.out.println("시간 : "+time);



    }

}
