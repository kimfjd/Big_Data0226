package 예외상황;

import java.util.Scanner;

public class ExceptionEx4 {
    public static void main(String[] args) {
        int rst=0;
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("나눗셈 입력 : ");
            int a=sc.nextInt();
            int c=sc.nextInt();
            try{
                rst=a/c;
            }catch (ArithmeticException e){
               // System.out.println("0으로 안나눠짐");
                //continue;
                rst=-1;
            }
            finally { // finally 정상이든 비정상이든 무조건 구현
                System.out.println("프로그램 종료");
                System.out.println("결과 : "+rst);
                break;
            }
        }
    }
}
