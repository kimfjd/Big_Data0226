package 연습문제정답;

import java.util.Scanner;

public class XdownEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하여 주세요");
        int n = sc.nextInt();
        System.out.println("기준이 되는 숫자를 입력해 주세요");
        int x = sc.nextInt();
        int[] nn = new int[n];
        for (int i = 0; i < nn.length; i++) {
            nn[i] = sc.nextInt();
            if(nn[i]<x) System.out.println(nn[i] + " ");
        }
        System.out.println();
    }
}

