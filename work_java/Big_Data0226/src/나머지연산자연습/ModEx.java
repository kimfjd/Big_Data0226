package 나머지연산자연습;

import java.util.Scanner;

// 100의 자리 점수를 입력 받아서 3개의 변수에 나눠담기
// ex) 257=> a변수에 2 b변수에 5 c변수에 7
// 몫과 나머지를
public class ModEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("백의 자리 숫자 아무거나를 입력하세요");
        int in = sc.nextInt();

        int a= in/100;
        int b= (in%100)/10;
        int c= in%10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
