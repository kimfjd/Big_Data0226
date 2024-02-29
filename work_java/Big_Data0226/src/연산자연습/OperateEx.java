package 연산자연습;

import java.util.Scanner;

// 산술연산자: 사칙연산, 나머지 연산자
public class OperateEx {
    public static void main(String[] args) {
        int num1= 10, num2=4;
        /* System.out.println("+연산자:"+(num1+num2));
        System.out.println("-연산자:"+(num1-num2));
        System.out.println("*연산자:"+(num1*num2));
        System.out.println("/연산자:"+(num1/num2)); //몫을 구하는 용도
        System.out.println("나머지% 연산자:"+(num1%num2));//나머지를 구히는 용도
        System.out.println("/연산자:"+((double)num1/num2));//나누기 영도 */

        // 예외적인 연산
        /* try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e){
            System.out.println("0으로 나누면 안됨");
        }
        System.out.println(5 / 0.0);*/

        // 대입연산자: 생성한 변수에 값을 집어넣는것
        int num3=10;
       /* System.out.println(num3+=2); // num3에 2를 더해서 집어 넣기
        System.out.println(num3-=2); // num3에 2를 빼고 집어 넣기
        System.out.println(num3*=2); // num3에 2를 곱하고 집어 넣기
        System.out.println(num3/=2); // num3에 2를 나누고 집어 넣기 */

        //증감연산자: 피연산자에 1씩 증가 혹은 감소
        /* int num4=10;
        System.out.println(num4++); // 후위에 붙어 있는 연산자는 값을 출력후 1 증가 고로 출력 결과는 10 다시 num4 출력시 11
        // 선 대입후 증가
        System.out.println(num4);
        System.out.println(++num4); // 1증가후 출력 고로 11 */

        // 비교연산자: 크다, 작다, 크거나 같다, 작거나 같다
        int x= 10;
        int y= 20;
        /* System.out.println(x>y); //false 출력
        System.out.println(x<y); // true 출력
        System.out.println(x==y); // false 출력
        System.out.println(x>=y); //false 출력
        System.out.println(x<=y); // true 출력 */

        // 논리연산자: &&(and), ||(or), !(not)
       /*  boolean rst1, rst2, rst3; // 1byte 참과 거짓을 구분하는 용도로 사용
        rst1 = (x>0) && (x>y); // and는 둘다 만족 햐여하기 떄문에 거짓 false가 나옴
        rst2 = (x>0) || (x>y); // or는 둘중 하나만 참이여도 참 true가 나옴
        rst3 = !((x>0) || (x>y)); // 참true 인 식에 !(부정)을 하여 거짓 false가 나옴

        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);

        // 삼향연산자 : 항이 3개라 삼함(피연산자가 3개)
        Scanner sc= new Scanner(System.in);
        System.out.println("나이를 입력하세요:");
        int age = sc.nextInt();
        String Adult = (age> 19) ? "성인입니다" : "미성년자 입니다"; // 조건식이 참이면 물음표 뒤에 코드 실행 아니면 콜론뒤에 있는거 실행
        System.out.println(Adult); */

        //문자열 결합 연산자
        System.out.println("Java JDK"+ 11.04 + 12); // 문자열이 먼져 시작되서 뒤에 있는 숫자도 문자열로 취급됨
        System.out.println(3+3.3+"JDK"); // 숫자가 먼져 와서 6.3JDK가 출력됨

        // 연산자 우선 순위 확인
        int val1 = 5, val2= 5, val3= 5;
        int rst11, rst22, rst33;
        rst11=val1+val2*val3;
        rst22=(val1+val2)*val3;
        rst33=val1+(++val2 *val3);
        System.out.println(rst11);
        System.out.println(rst22);
        System.out.println(rst33);
    }
}
