package 스캐너사용하기;

import java.util.Scanner; // 유틸에 있는 Scanner 을 가져옴

// Scanner 클래스: 자바에서 입력을 받기 위해서 만들어진 클래스(문자 입력, 파일 입력등 가능)
public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // Scanner 클래스를 sc 참조변수에 객체를 생성해 대입함
        /* byte a = sc.nextByte(); 		// byte 형 입력 및 리턴
        short b = sc.nextShort(); 		// short 형 입력 및 리턴
        int c = sc.nextInt(); 			// int 형 입력 및 리턴
        long d = sc.nextLong(); 		// long 형 입력 및 리턴
        char ch = sc.next().charAt(0); // 문자 입력

        float e = sc.nextFloat(); 		// float 형 입력 및 리턴
        double f = sc.nextDouble(); 	// double 형 입력 및 리턴

        boolean g = sc.nextBoolean(); 	// boolean 형 입력 및 리턴

        String h = sc.next(); 			// String 형 입력 및 리턴 (공백을 기준으로 한 단어를 읽음)
        String i = sc.nextLine(); 		// String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음) */

        System.out.print("이름을 입력하세요:");
        String name = sc.next(); //이름 (문자열)을 입력 받아 name변수에 대입
        sc.nextLine(); //버퍼 비우기
        System.out.print("주소를 입력하세요:");
        String add= sc.nextLine(); // 주소는 공백이 포함 되기 때문에 nextLine()사용
        System.out.print("성별을 입력하세여: ");
        char gender = sc.next().charAt(0);// 스캐너에서 문자를 입력 받기 위해서는 문자열 인덱스 추출
        System.out.print("나이를 입력하세요.:");
        int age= sc.nextInt();

        System.out.println("====회원 정보 출력====");
        System.out.println("이름"+name);
        System.out.println("주소:"+add);
        System.out.println("성별:"+gender);
        System.out.println("나이"+age);
    }
}
