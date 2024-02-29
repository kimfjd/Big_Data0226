package 조건기본;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        while(true){
            System.out.println("시험 점수를 입력하세요");
            int num= sc.nextInt();

            if (num>100||num<0) {
                System.out.println("숫자를 다시 입력하세요");
            }
            else if (num>=90) {
                System.out.println("A 입니다");
                break;
            } else if (num>=80) {
                System.out.println("B 입니다");
                break;
            } else if (num>=70) {
                System.out.println("C 입니다");
                break;
            }
            else if (num>=60){
                System.out.println("D 입니다");
                break;
            }
            else{
                System.out.println("F 낙제 입니다");
                break;
            }
        }


    }
}
