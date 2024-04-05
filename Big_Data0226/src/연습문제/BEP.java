package 연습문제;

import java.util.Scanner;

public class BEP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("고정 비용이 얼마죠: ");
        int A=sc.nextInt();// 고정
        System.out.println("가변 비용이 얼마죠? ");
        int B=sc.nextInt(); // 가변
        System.out.println("상품의 가격이 얼마인가요? ");
        int C=sc.nextInt(); // 판매 비용
        int n=0; // 판매 개수
        if(B>C){
            System.out.println("-1");
            return;
        }
        while(true){
            if ((C*n)>A+(B*n)) break;
            n++;
        }
        System.out.println(n);
    }
}
