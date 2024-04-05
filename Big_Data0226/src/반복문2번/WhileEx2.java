package 반복문2번;

import java.util.Scanner;

// 반복문의 종류: while, do while, for
// while문은 대부분의 횟수가 정해지지 않는 경우
// for문은 반복 횟수가 정해져 있는 경우 사용
public class WhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int age;
     /*   while (true) {
            System.out.println("나이를 입력하세요: ");
            age = sc.nextInt();
            if (age >= 0 && age<200) break; // 한줄짜리 코드 중괄호 생략 가능
            System.out.println("나이를 잘못 입력 했음");
        }
        System.out.println("당신의 나이는"+age+"입니다");*/

        boolean isRetry=false;
        do{
            System.out.println("나이를 입력하세요: ");
            age=sc.nextInt();
            if(isRetry) System.out.println("나이를 잘못 입력함");
        } while(age<0||age>=200);
        isRetry=true;
        System.out.println("당신의 나이는 "+ age+"입니다");
    }
}
