package 연습문제;

import java.util.Scanner;

public class KMP4 {
    public static void main(String[] args) {
        // 배열로 변경후  'A'~'Z' 사이의 문자만 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력: ");
        String name = sc.nextLine();// 엔터키가 입력 될때 까지 입력 받음
        char[] chName=name.toCharArray();
        for(char e: chName){
            if(e>='A'&& e<='Z') System.out.print(e);
        }
    }
}
