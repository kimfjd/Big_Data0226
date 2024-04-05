package 연습문제;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayasList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("배열 길이 입력");
        int leg=sc.nextInt();
        int[] arr=new int[leg];
        for(int i=0;i<arr.length;i++){
            arr[i]=((int)(Math.random()*leg));
        }
        System.out.println("찾을 숫자를 입력해 주세요");
        int fin=sc.nextInt();
        if(fin<0&&fin>leg) {
            System.out.println("숫자의 범위가 아닙니다");
        }
        else {
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.binarySearch(arr,fin));
        }
    }
}
