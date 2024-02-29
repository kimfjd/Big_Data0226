package 스위치문기본;

import com.sun.source.tree.ContinueTree;

import java.util.Scanner;

// 스위치 문에서 변수로 비교하는 변수로 사용할 수 있는 것은 정수, 문자, 문자열 가능(실수는 안됨)
public class switchEx2 {
    public static void main(String[] args) {
        int x, y; // 좌변값과 우변값
        char op; //연산자
        Scanner sc= new Scanner(System.in);
        System.out.println("계산식을 입력 :");
        x= sc.nextInt();
        op= sc.next().charAt(1);
        y=sc.nextInt();

        switch (op) {
            case '+':
                System.out.println("뎃셈 결과: "+(x+y));
                break;
            case '-':
                System.out.println("뺄셈 결과:" + (x-y));
                break;
            case '*':
                System.out.println("곱셈 결과: " + (x*y));
                break;
            case '/':
                System.out.println("나눗셈 결과: "+ (x/y));
                break;
            default:
                System.out.println("계산식을 잘 못 입력 했습니다.");
        }
    }
}
