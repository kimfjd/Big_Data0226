package 조건문연습1;

import java.util.Scanner;

public class ConditionEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in 파일 이름으로 변경 가능
        System.out.print("문자를 입력하세요.");
        char ch = sc.next().charAt(0); // 스케너로 문자를 입력 받기 위해서는 문자열에서 혹은 인덱스에서 문자를 추출
        if (ch >= 'a' && ch <= 'z') {  // 아스키 97~
            System.out.println(ch + "는 알파벳 소문자 입니다.");
        } else if (ch >= 'A' && ch <= 'Z') { // 아스키 코드 65~
            System.out.println(ch + "는 알파벳 대문자 입니다.");
        } else if(ch>='0' && ch<='9') {
            System.out.println(ch + "는 숫자입니다.");
        }
        else {
            System.out.println(ch+"은 숫자나 알파벳이 아닙니다.");
        }
    }
}