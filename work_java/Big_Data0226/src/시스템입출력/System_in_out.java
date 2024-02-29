package 시스템입출력;
// 시스템 출력은 println(), print(), printf() 가 있음
public class System_in_out {
    public static void main(String[] args) {
        String ddd= "집가고 싶다";
        String add="ㅇㄴ 감기 좆같네"; // "" 문자열
        char gender = 'M'; // char형은 문자를 입력 받으며 ""를 쓰면 에러남 "" 는 문자열을 쓸떄 사용할수 있음 '' 이걸 써야함
        // ASCII 또는 UNCODE로 값이 바뀌기 때문에
        int age=22;
        int kor=99;
        int eng=88;
        int mat=55;
        double avg= 0.0; //평균을 구하기 위한 변수

        // 자바 스타일 출력
        System.out.println("========== Java Style 출력=========");
        System.out.println("=".repeat(5) + "JAVA Style 출력" + "=".repeat(5));
        System.out.println("하고 싶은말:"+ddd);
        System.out.println("지금 심정:"+add);
        System.out.println("성별"+gender);
        System.out.println("나이"+age);
        System.out.println("총정"+(kor+eng+mat)); /* kor+eng+mat는 괄호 없이 찍으면 문장으로 인식하여 더하기가 안되고 998855값이
        왜냐하면 처음에 찍힌 변수가 숫자인지 문자인지에 따라 결정되기 때문이다 괄호를 넣어 kor을 숫자를 맨앞으로 인식 시켜 정상적으로 +가 되서
        나오게 하는 방법 */
        System.out.println("평균" + (double)(kor+eng+mat)/3);
        System.out.printf("평균: %2f\n",(double)(kor+eng+mat)/3);
        // C언어 스타일 : 서식 지정자를 사용하는 방식
        System.out.printf("======== c언어 스타일(서식지정자 사용)\n");
        System.out.printf("이름: %s\n", ddd); //문자열 출력을 위한 서식을 지정하고 줄바꿈
        System.out.printf("주소: %s\n",add);
        System.out.printf("현재 습도:%d%%\n",65);

    }
}
