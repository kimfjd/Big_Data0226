package 예외상황;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionEx5 {
    public static void main(String[] args) {
        FileWriter fw=null;
        try{
            fw=new FileWriter("test TxT");
            fw.write("ㅇㅇㅇㅇㅇㅇㅇㅇ");
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fw !=null){
                try {
                    fw.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
