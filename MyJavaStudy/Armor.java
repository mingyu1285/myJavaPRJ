package MyStudy;

public class Armor {
    private String name;
    private int height;
    private int weight;
    private String color;
    private boolean isFly;
    //Armor 클래스에 선언된 위에 필드는 모두 Armor 객체의 속성을 표현

    public void setName(){ //메서드 안에서 선언한 지역변수
        String value = "mark6"; //value 변수는 문자열
        //"mark6"을 저장해 setname() 메서드에서 사용할 목적으로 선언
        name=value;
    }
    public void setHeight(int value){
        height = value;
    }
    public static void main(String[] args) {


    }
}
