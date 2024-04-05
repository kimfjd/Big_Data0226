package 연습문제정답;

import java.util.Scanner;

public class WordEx {
    public static void main(String[] args) {
        int[] alphabet = new int[26];//알파벳의 개수 만큼 배열 생성
        int max=0; //가장많이 등장하는 알파벳 수 저장
        char result =0; // 가장 많이 등장하는 단어 저장(출력을 위해)
        Scanner sc=new Scanner(System.in);
        System.out.println("단어 입력:");
        String word= sc.next();
        for(int i=0; i< word.length();i++){
            if(word.charAt(i)>='a') alphabet[word.charAt(i)-'a']++; // 해당 알파벳의 인덱스에 1 증가
            else alphabet[word.charAt(i)-'A']++;
        }
        for(int i=0;i<alphabet.length;i++){
            if(alphabet[i]==max) result='?';
            else if (alphabet[i]>max) {
                max=alphabet[i];
                result=(char) ('A'+i);
            }
        }
        System.out.println(result);
    }
}
