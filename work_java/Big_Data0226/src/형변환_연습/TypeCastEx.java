package 형변환_연습;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

// 형변환: 하나의 데이터 타입을 다른 타입으로 변환 하는것
// 형변환에는 묵시적 형변환과 명시적 형변환이 있음
// 묵시적 형변환: 자동으로 일어나는 형변환 (자바 컨파일러가 유리한 방향으로 형을 변환)
// 명시적 형변환: 개발자가 의도를 가지고 하는 형변환
public class TypeCastEx {
    public static void main(String[] args) {
        int num1=1,num2=4;
        double rst1=num1/num2; //정수를 나누기 연산을 했기 때문에 소수점 이하는 없어짐 ...1/4=0.25
        // 아래의 코드는 명시적 형변환과 묵시적 형변환이 동시에 일어남
        double rst2=(double) num1/num2; // 앞 double에서 묵시적 형변환 뒤 double에서 명시적 형변환
        System.out.println(rst1);
        System.out.println(rst2);

        // 타입 변환 메소드
        // 문자열을 정수로 변환하는 메소드
        int value1 = parseInt("123");
        double value2= parseDouble("123.4567");
        System.out.println(value1);
        System.out.println(value2);

    }
}
