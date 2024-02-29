package 조건기본;

import java.util.Scanner;

// 조건문: 제어문이다 주어진 조건에 따라 명령을 수행함
// 삼항연산자: 참과 거짓을 구분
// if문(if, if-else, if~ else if~else)
// switch문
public class ConditionEX {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //System.out.println("정수를 입력하세요");
        System.out.println("시험 점수를 입력하세요");
            int num= sc.nextInt();

        /* if (num>=0) {
            System.out.println(num+"은 양수 입니다");
        }
        else {
            System.out.println(num+"은 음수입니다");
        } */
        if (num>=90) {
            System.out.println("A 입니다");
        } else if (num>=80) {
            System.out.println("B 입니다");
        } else if (num>=70) {
            System.out.println("C입니다");
        }
        else if (num>=60){
            System.out.println("D입니다");
        }
        else {
            System.out.println("F 낙제 입니다");
        }
    }
}
