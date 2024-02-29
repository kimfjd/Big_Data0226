package 조건기본;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("3자리 정수를 입력하세요");
        int aa=sc.nextInt();

        int a=aa/100;
        int b=(aa%100)/10;
        int c=aa%10;

        if (a>b && a>c) {
            System.out.println(a);
        }
        else if (b>a && b>c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }

    }
}
