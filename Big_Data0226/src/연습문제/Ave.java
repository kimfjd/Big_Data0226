package 연습문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시험 몇과목봄?");
        int test=sc.nextInt();
        int finSc=0;
        int avg=0;
        int arravg=0;
        for(int i=0; i<test;i++){
            finSc=0;
            avg=0;
            arravg=0;
            System.out.println("시험 몇명봄");
            int N=sc.nextInt();
            int[] testSc=new int[N];
            System.out.println("시험 점수 입력");
            for(int j=0; j<N; j++){
                //testSc[j]=((int)(Math.random() *100));
                testSc[j]= sc.nextInt();
                finSc+=testSc[j];
                avg=finSc/N;
            }
            for(int j=0;j<N;j++){
                if (testSc[j]>avg){
                    arravg++;
                }
            }
            double p =(double)arravg/N;
            System.out.println((int)(p*100)+"%");
            }
        }
    }

