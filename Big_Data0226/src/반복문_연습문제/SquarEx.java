package 반복문_연습문제;

import java.util.Scanner;

// 양의 정수 n을 입력 받아 n*n 크기의 행렬을 출력하는 프로그램 작성
// 정수 입력:
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
public class SquarEx {
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("정수를 찍어주세요");
                int aa= sc.nextInt();
                for(int i= 1; i<=aa*aa; i++) {
                    System.out.printf("%4d", i);
                    if (i % aa == 0) System.out.println();
                }
                System.out.println();
    }
}
