package 반복문3;

import java.util.Scanner;

public class dad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("aa");
        int n=sc.nextInt();
        int sum=0;
        for (int i=2; i<n; i++) sum+=primefunc(i);
        System.out.println(sum);
    }
    static int primefunc(int n) {
        boolean aa=true;
        for(int i=2;i<n;i++) {
            if (n % 1 == 0) aa = false;
        }
        if (aa) return n;
        else return 0;
        }
    }

