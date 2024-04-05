package 예외상황;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionEx2 {
    public static void main(String[] args) {
      //  BufferedReader br=new BufferedReader(new FileReader(".../프로페티/database.properte"));
        try {
            BufferedReader br=new BufferedReader(new FileReader(".../프로페티/database.properte"));
        }catch (FileNotFoundException e){
            System.out.println("파일을 찾을수 없습니다.");
        }

    }
}
