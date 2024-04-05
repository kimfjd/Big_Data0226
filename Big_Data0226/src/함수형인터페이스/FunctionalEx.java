package 함수형인터페이스;
// 함수형 인터페이스: 자바는 함수가 독립적으로 만들어 질 수 없으므로 사용하는 문법
@FunctionalInterface // 두개 들어가면 에러남
interface Calculator{
    int sum(int a, int b);
    //int div(int c, int d);
}
/*class Mycalculator implements Calculator{
    @Override
    public int sum(int a, int b){
        return a+b;
    }
}*/

public class FunctionalEx {
    public static void main(String[] args) {
        /*Mycalculator mc=new Mycalculator();
        int result=mc.sum(100,500);
        System.out.println(result);*/
        Calculator mc=(a, b)-> a+b;
        int result =mc.sum(100,200);
        System.out.println(result);
    }
}
