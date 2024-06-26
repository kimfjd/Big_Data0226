package 보조스트림;

import java.io.*;

// 성능 향상 보조 스트림: 입출력 장치가 느린 것 때문에 프로그램 동작이 느려지는 것을 완화하기 위해 사용
public class EnhancedBufferMain {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =null;
        FileOutputStream fos=null;
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        int data =-1; // -1은 데이터의 끝을 의미
        long start =0;
        long end=0;
        fis = new FileInputStream("C:\\Users\\82102\\dev\\work_java\\Big_Data0226\\src\\보조스트림\\집.jpg");
        bis=new BufferedInputStream(fis);
        fos=new FileOutputStream("테스트 이미지.jpg");
        bos=new BufferedOutputStream(fos);
        start=System.currentTimeMillis();
        while ((data = bis.read()) != -1){
            bos.write(data);
        }
        bos.flush();
        end=System.currentTimeMillis();
        bos.close();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("데이터를 사용 경우 "+(end-start)+"ms");
    }
}
