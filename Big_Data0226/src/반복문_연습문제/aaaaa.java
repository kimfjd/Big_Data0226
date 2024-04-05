package 반복문_연습문제;

import java.util.Scanner;

public class aaaaa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("숫자 입력");
        int aa=sc.nextInt();
        boolean isPrime = true; //소수인지 아닌지 판단
        for(int i=2; i<aa; i++){
            if(aa%i==0) isPrime = false;
        }
        if(aa==1) {
            System.out.println("소수가 아닙니다");
        }
        else if (isPrime){
            System.out.println("소수입니다");
        }
        else {
            System.out.println("소수가 아입니다");
        }
    }
}
