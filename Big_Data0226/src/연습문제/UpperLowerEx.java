package 연습문제;

import java.util.Scanner;

public class UpperLowerEx {
    public static void main(String[] args) {
        // 문자열 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력: ");
        String input = sc.nextLine();// 엔터키가 입력 될때 까지 입력 받음
        for(int i=0; i<input.length();i++){
            char ch= input.charAt(i); //해당 인덱스의 문자 추출
            if(ch<'a') System.out.println((char)(ch+('a'-'A')));
            else System.out.println((char) (ch-('a'-'A')));
        }
    }
}
