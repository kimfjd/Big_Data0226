package 연습문제;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        String[] art=new String[26];
        for(int i=0;i<26;i++){

        }
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String aa;
        int count = 0;
        int lenght = word.length();
        String word1 = word.toUpperCase(); // 입력 받은 문자 대문자로 변경
        String[] arrword = new String[lenght];
        String[] arrword1 = new String[lenght];
        for (int i = 0; i < word1.length(); i++) {// 입력 받은 문자를 배열에 집어넣음
            arrword[i] = String.valueOf(word1.charAt(i));
        }
        for (int i = 0; i < arrword.length; i++) {

        }
    }
}
