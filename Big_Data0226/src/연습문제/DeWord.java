package 연습문제;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("알파벳 입력");
        String word=sc.next();
        for(int i=0; i<word.length();i++){
            if(word.charAt(i)>='a'){
                sum+=word.charAt(i)-'a'+1;
            }
            else {
                sum+=word.charAt(i)-'A'+27;
            }
        }
        for(int i=2; i<sum; i++){
            if(sum%i==0){
                System.out.println("소수 아님");
            }
            else{
                System.out.println("소수임");
            }
        }
    }
}
