package 샘플프로그램;
/* 요거는 주석입니다.
주석은 대부분 이 코드가 뭔지 설명할때 씁니다
주석을 주는 방법은 여러가지 있지만 "/*~ 이 방법은 범위 주석입니다 일정 범위를 주석으로 해줍니다.
 */

// {} 배열을 정의 할 때 사용
// {} 함수의 블록을 지정
// () 함수의 매개변수 전잘
public class SampleClass {
    public static void main(String[] args) {
        System.out.println("집중");
        System.out.println("집 가고 싶다"); // 주석은 아님
        if(true) {
            int age = 100;
            System.out.println("장난");
        }
        System.out.println(7);
        System.out.println("7");
        System.out.println(7.00);
        System.out.printf("%d\n", 7); //d는 정수 표현
        System.out.printf("%s\n", "7"); // s는 문자열 표현
        System.out.printf("%.1f\n", 7.00); // f는 실수형 표현
        }
    }

