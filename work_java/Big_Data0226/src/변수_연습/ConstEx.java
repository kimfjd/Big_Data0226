package 변수_연습;

import java.util.Scanner;

public class ConstEx {
    public static void main(String[] args) {
        final double TAX_RATE=0.10;//세율은 바뀌면 안되서 final로 지정
        Scanner sc = new Scanner(System.in); //
        System.out.print("수입을 입력하세요 : "); //
        int income=sc.nextInt(); // 정수값을 입력 받아 income 변수에 대입
        System.out.println("당신을 내야하는 세금은"+ (income * TAX_RATE));
    }
}
