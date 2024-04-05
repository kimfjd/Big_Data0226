package 연습문제;

import java.util.Scanner;

public class PlusEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sumNumber=0; //입력 받은 수의 10자리와 1의 자리를 분리해서 더함
        int newNumber=0; // 새롭게 만들어진 변수
        int cnt=0;//누적 횟수 구하기
        System.out.print("입력");
        int input=sc.nextInt();
        int tmp=input; // 입력 받은 값을 변경되는걸 막기 위해
        while(true){
            sumNumber=(tmp/10) + (tmp%10); // 입력 받은 수의 10자리와 1의 자리를 분리해서 더함
            newNumber=(tmp%10)*10+(sumNumber%10); //입력값의 1의 자리 + 계산된 값의 1의 자리를 더함
            cnt++;
            if(input==newNumber) break;
            tmp=newNumber;
        }
        System.out.println(cnt);
    }
}
