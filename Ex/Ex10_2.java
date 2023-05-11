package Ex10;

public class Ex10_2 {
    public static void main(String[] args) {
        int [] aa= new int[3];
        try{
            aa[2] = 100/0;
            aa[3] = 100;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 첨자가 배열 크기보다 커요");
        }
        catch (ArithmeticException e){
            System.out.println("0으로 나누는 등의 오류 발생");
        }catch (Exception e){ //이건 항상 제일 마지막에 써야함 // 자바는 실행 순서대로 실행하지만
            // 모든 걸 다 잡아주는 이 Exceptione이 맨 앞에 있다고 가정할 때  내가 원하는 방식으로 못 하고
            // 다 해버리기 때문에 catch중에서도 제일 밑에 써야만 한다.
            System.out.println("자바에서 발생되는 모든 에러를 다 잡을 수 있는 조상님");
            System.out.println("오류 메세지"+ e);
        }


        finally{
            System.out.println("이 부분은 무조건 나옴");
        }
    }
}
