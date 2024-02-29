package 짝수홀수판단하기;

import java.util.Scanner;

// 임의의 정수를 입력 받아 짝수인지 홀수 인지 판단하기
public class OddEvenEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("정수를 입력해 주세요");
        int aa= sc.nextInt();

        // String outString=(aa%2==0)? "짝수입니다" : "홀수입니다";

        if(aa%2==0) {
            System.out.println("짝수임");
        } else{
            System.out.println("홀수임");
        }
    }
}
