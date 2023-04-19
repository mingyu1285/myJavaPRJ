package Collectionfamework;

import java.util.*;

public class ListMapExam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 최종 저장되는 List 구조
        List<Map<String, String>> list = new ArrayList<>();

        // List 구조 안에 저장될 Map 객체
        Map<String, String> map = null;


        for (int i = 0; i < 3 ; i++) {
            System.out.print("이름 : ");
            String name = s.next(); //이름 입력받기

            System.out.print("이메일 : ");
            String email = s.next();//이메일 입력받기

            System.out.print("부서 : ");
            String dept = s.next();//부서 입력받기

            map = new HashMap<>(); //List 구조에 저장할 Map 메모리에 올리기

            map.put("name", name); //입력받은 값을 name 키에 저장하기
            map.put("email", email); //입력받은 값을 email 키에 저장하기
            map.put("dept", dept); //입력받은 값을 dept 키에 저장하기

            list.add(map); // Map 구조를 List에 저장하기

            map = null; //다 사용하면 메모리 비우기

        }
        //List 저장된 데이터 수
        int listSize = list.size();

        System.out.println("저장된 데이터 수 : "+listSize);

        //일반적인 반복문 -- 1세대
        //단점 : 반드시 반복의 횟수를 알고 있어야 사용 가능함

        System.out.println("1세대 반복문");

        for (int i = 0; i < listSize; i++) {
            Map<String, String> rMap = list.get(i);

            System.out.println("name : "+rMap.get("name"));//이름 가져오기
            System.out.println("email : "+rMap.get("email")); //이메일 가져오기
            System.out.println("dept : "+rMap.get("dept")); //부서 가져오기

            rMap = null; // 다 사용하면 메모리 비우기
        }

        System.out.println("2세대 반복문");
        //장점 : 1세대 반복문의 단점인 횟수를 알아야하는 반복문의 문제점을 개선

        for (Map<String, String> rMap:list) {
            System.out.println("name : "+rMap.get("name"));//이름 가져오기
            System.out.println("email : "+rMap.get("email")); //이메일 가져오기
            System.out.println("dept : "+rMap.get("dept")); //부서 가져오기
        }

        //개선된 반복문 --3세대
        //장점 : 2세대보다 코딩해야 하는 줄(라인)이 감소함, 람다식 전용, 자바 1.8부터 사용 가능
        System.out.println("3세대 반복문");

        list.forEach(rMap ->{
            System.out.println("name : "+rMap.get("name"));//이름 가져오기
            System.out.println("email : "+rMap.get("email")); //이메일 가져오기
            System.out.println("dept : "+rMap.get("dept")); //부서 가져오기
        });

        //개선된 반복문 -- 4세대
        //장점 : 3세대에 비동기식 처리 방법 적용
        //단점 : 처리 완료가 누가 먼저 될 지 알 수가 없음. 모든 경우에 다 쓸수 없음
        System.out.println("4세대 반복문");
        list.parallelStream().forEach(rMap->{
            System.out.println("name : "+rMap.get("name"));//이름 가져오기
            System.out.println("email : "+rMap.get("email")); //이메일 가져오기
            System.out.println("dept : "+rMap.get("dept")); //부서 가져오기
        });

    }
}
