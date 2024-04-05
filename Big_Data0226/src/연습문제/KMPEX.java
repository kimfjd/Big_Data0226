package 연습문제;

import java.util.Scanner;

public class KMPEX {
   public static void main(String[] args) {
   //      String[] name=new String[2];
       // Scanner sc=new Scanner(System.in);
       // for (int i=0;i<name.length;i++){
         //   name[i]=sc.next();

    // System.out.println(char); */
    Scanner sc=new Scanner(System.in);
    System.out.println("문자열 입력: ");
    String name=sc.next();
    String[] rst=name.split("-");
     // System.out.println(rst[0].charAt(0)+rst[1].charAt(0)+rst[2].charAt(0));
    for(String e: rst){
        System.out.print(e.charAt(0));
    }
    }
}
