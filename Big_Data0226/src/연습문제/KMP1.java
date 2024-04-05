package 연습문제;

import java.util.Scanner;

public class KMP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력: ");
        String name = sc.nextLine();// 엔터키가 입력 될때 까지 입력 받음
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)>='A'&&name.charAt(i)<='Z'){
                System.out.println(name.charAt(i));
            }
        }
    }
}
