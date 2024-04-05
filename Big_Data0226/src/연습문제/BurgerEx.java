package 연습문제;

import java.util.Scanner;

// 햄버거 3가지 종류
// 음료 2가지 종류
// 햄거버 3가지중 가장 싼거, 음료 2가지중 가장 싼거 선택하고,
// 세트메뉴 이므로 50월 활인해서 금액 계산
// 1차원 배열 사용하는 문제
public class BurgerEx {
    public static void main(String[] args) {

        // 메뉴를 저장할 5개 배열 생성
        // 배열에 햄버거와 가격을 입력
        // 햄버거와 음료의  값중 비교하기  위한 기준값 설정(배열의 값 중 한개)
        // 햄버거와 음료 중 제일 싼 메튜 찾기
        // 50원 할인해서 결과 출력
        int[] menu=new int[5];// 정수 5개자리 배열 생성
        Scanner sc=new Scanner(System.in); // 입력을 받기 위한 스캐너
        System.out.println("메뉴 이름: ");
        // 배열과 햄버거와 음료 가격을 입력 받음
        for(int i=0; i< menu.length; i++){
            menu[i] = sc.nextInt();
        }
        // 햄버거와 음료의 값을 비교하기 위한 기준값 결정(배열의 값 중 한개)
        int minBurger = menu[0]; //버거중 한개의 임의의 값
        int minDrink = menu[3]; // 음료중 한개의 임의의 값
        // 햄버거와 음료 중 제일 싼 메뉴 찾기
        for(int i=0; i <menu. length; i++) {
            if((i<3) && (minBurger>menu[i])) minBurger=menu[i];
            if((i>2)&& (minDrink>menu[i])) minDrink=menu[i];

            // 50원 할인해서 출력
        System.out.println(minBurger+minDrink-50);
        }
    }
}
