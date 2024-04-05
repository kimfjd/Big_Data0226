package 연습문제;

import java.util.Scanner;

public class house {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("번호판의 숫자를 입력하여 주세요 범위 1~9999");
        int sum=0;
        int sum1=0;
        int sum2=0;
        int sum3=0;
        int dig=0;
        int count=0;
        int pan=sc.nextInt();
        int aa=pan;
        while (aa!=0){
            aa/=10;
            count++;
        }

        if(pan>=1&&pan<=9999){
            if(pan%10==0){
                sum=4;
            }
            else if (pan%10==1) {
                sum=2;
            } else{
                sum=3;
            }
            if((pan/10)%10==0){
                sum1=4;
            }
            else if ((pan/10)%10==1) {
                sum1=2;
            }
            else {
                sum1=3;
            }
            if ((pan/100)%10==0){
                sum2=4;
            }
            else if ((pan/100)%10==1) {
                sum2=2;
            }
            else {
                sum2=3;
            }
            if(pan/1000==1){
                sum3=2;
            }
            if(pan/1000==0){
                sum3=0;
            }
            else{
                sum3=3;
            }

        }
        else{
            System.out.println("잘못 입력 하였습니다 1~9999자리의 숫자를 입력해주세요");
        }
        if (count==4){
            dig=3;
        }
        else if (count==3) {
            dig=2;
        } else if (count==2) {
            dig=1;
        }
        else {
            dig=0;
        }
        System.out.println(sum+sum1+sum2+sum3+dig+2);
    }
}
