package 연습문제;

import java.util.Scanner;

public class ColorRS {
    public static void main(String[] args) {
        String Rs = null;
        String Rs1= null;
        int mult=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("특정 색 3개를 입력해 주세요");
        System.out.println("특정 색 black, brown, red, orange, yellow, green, blue, violet, grey, white");
        String[] arr=new String[3];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.next();
        }
        switch (arr[0]){
            case "black":
                Rs="0";
                break;
            case "brown":
                Rs="1";
                break;
            case "red":
                Rs="2";
                break;
            case "orange":
                Rs="3";
                break;
            case "yellow":
                Rs="4";
                break;
            case "green":
                Rs="5";
                break;
            case "blue":
                Rs="6";
                break;
            case "violet":
                Rs="7";
                break;
            case "grey":
                Rs="8";
                break;
            case "white":
                Rs="9";
                break;
            default:
                System.out.println("문자를 잘못 입력 하셨습니다.");
        }
        switch (arr[1]){
            case "black":
                Rs1="0";
                break;
            case "brown":
                Rs1="1";
                break;
            case "red":
                Rs1="2";
                break;
            case "orange":
                Rs1="3";
                break;
            case "yellow":
                Rs1="4";
                break;
            case "green":
                Rs1="5";
                break;
            case "blue":
                Rs1="6";
                break;
            case "violet":
                Rs1="7";
                break;
            case "grey":
                Rs1="8";
                break;
            case "white":
                Rs1="9";
                break;
            default:
                System.out.println("문자를 잘못 입력 하셨습니다.");
        }
        switch (arr[2]){
            case "black":
                mult=1;
                break;
            case "brown":
                mult=10;
                break;
            case "red":
                mult=100;
                break;
            case "orange":
                mult=1000;
                break;
            case "yellow":
                mult=10000;
                break;
            case "green":
                mult=100000;
                break;
            case "blue":
                mult=1000000;
                break;
            case "violet":
                mult=10000000;
                break;
            case "grey":
                mult=100000000;
                break;
            case "white":
                mult=1000000000;
                break;
            default:
                System.out.println("문자를 잘못 입력 하셨습니다.");
        }
        String RST=Rs+Rs1;
        int num = Integer.parseInt(RST);
        System.out.println(num*mult);
    }
}
