package 예외상황;

import java.io.IOException;

public class ExceptionEx6 {
    public static void main(String[] args) {
        IOSample test=new IOSample();
        try {
            test.input();
            test.output();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
class IOSample{
    private int num;
    public void input() throws IOException{ // throws 상위 레벨에서 예외처리 던지기
        num=System.in.read();
    }
    public void output(){
        System.out.println(num);
    }
}