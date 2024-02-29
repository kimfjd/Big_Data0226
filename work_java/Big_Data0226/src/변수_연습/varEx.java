package 변수_연습;

public class varEx {
    public static void main(String[] args) {
        int age; // 나이를 저장하기 위해 4Byte 공간 확보 (int)
        age = 100; // age라는 변수에 100의 값을 넣는다
        double taxRate = 1.0; // 파이썬_tax_rate
        // 자바는 taxRate 처럼 소문자로 시작해서 대문자로 가는 듯한 카멜 표기법
        // 파이썬은 tax_rate와 같이 흐르듯이 가는 스네이크 표기법을 변수 표기명으로 쓴다.
        /*
        int switch; // 예약어라서 안됨
        int 23rete;// 숫자가 앞에 와서 안됨
        int kor#$;//특수 문자는 "_"와 "$"만 사용가능 */
        int jobs; // 변수 이름은 소문자로 지어야 함 (대문자도 되지만 관래임)

        int year = 2024; // 선언과 동시에 값 할당
        int day = 0; // 선언과 동시에 값을 0으로 초기화
        String name = null; // 이름이라는 문자열을 담는 변수를 선언하고 초기화
        String name1= "";


        int n =20;
        if (n>10) {
            int m;
            m=n-10;
            int k = n+m;
            System.out.println(k);
        }
        // int k= n+m; 여기서 m은 이미 지워 졌기 때문에 사라지고 없어서 에러가 남
        String addr = "서울시 강남구 역삼동 KG 정보 교육원";
        String addr2=  "서울시 강남구 역삼동 KG 정보 교육원";
            // 실수형 : 지수와 가수로 표현되면 가수 부분이 정밀도와 연관이 있다. (근사치 표기법)
            float height =170.55f; // float형은 여기서 대문자F, 소문자f를 붙여야함
            double pi= 3.141459925545;

            // 상수(constant) : 상수는 고정된 값을 표기 할 때 사용
        final double pi1 = 3.141592;
        final int YEAR= 365; // final 한번 값이 대입 되면 값에 변화를 줄 수 없음 즉 대입하면 더이상 변경 될 수 없음


        }
}
