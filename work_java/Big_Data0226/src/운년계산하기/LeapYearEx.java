package 운년계산하기;

import java.util.Scanner;

// 연습문제
// 윤년: 지구가 한바퀴 도는데 365일 정확히 365.xxxx 그래서 4년에 한번 2월에 하루를 추가함 (2월 29일)있는 날
// 윤년의 규칙
// 1. 연도가 4로 나누어 지면 윤년임
// 2. 100으로 나누어지면 윤년이 아님
// 3. 400으로 나눠지면 윤년이 아님
public class LeapYearEx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); // 값을 얻기 위해 스캐너 만듬
        System.out.println("연도를 입력 하세요");
        int year = sc.nextInt(); // 정수 값을 입력 받아 year에 대입

        if(year % 4 == 0 && year %100 !=0 || year % 400 ==0) {
            System.out.println(year +"년은" + " 윤년 입니다."); // 조건식이 참인 경우 수행
        } else {
            System.out.println(year+"년은"+"윤년이 아닙니다."); // 조건식이 거짓이면 수행
        }

    }
}
