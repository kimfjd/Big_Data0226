package 예외상황;

public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test=null;
        try{
            String testStr = test.name;
            System.out.println(test);
        } catch (NullPointerException e){
            System.out.println("NullPointerException 에외 발생");
        }

    }
}
class Test{
    String name = "김동환";

}