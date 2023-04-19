package Collectionfamework;

import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        //키     //값
        Map<String,String> map = new HashMap<>();
        //키(절대 중복 되면 안됨),//값
        map.put("name", "이협건");
        map.put("email", "mingyu1285@naver.com");
        map.put("dept", "데이터분석과");

        System.out.println("조회 결과");
        System.out.println("name : "+ map.get("name"));
        System.out.println("email : "+ map.get("email"));
        System.out.println("dept : "+ map.get("dept"));


        //맵의 키는 중복되지 않으며, Set 데이터구조와 같이 중복을 허용하지 않음
        //entrySet은 Map 구조 데이터를 Set 구조로 변환하기 위해 개발된 데이터 구조 키 값만 리스트 구조로 만드는 역할 값을 버림
        //Set은 중복된 값을 하나하나 중복된 값을 검사하는 로직이 들어가 있어서 허용하지 않고 순서가 없음
        //그래서 속도가 늦지만 빠르게 만들기 위해 순서 상관 없이 되는대로 저장한다.
        //Map 저장된 데이터 한 개마다 Set 구조로 데이터를 저장함
        //
        map.entrySet().forEach(entry-> {
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        });
    }

}
