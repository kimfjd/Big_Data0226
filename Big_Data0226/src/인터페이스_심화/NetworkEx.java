package 인터페이스_심화;

import java.util.Scanner;

public class NetworkEx {
    public static void main(String[] args) {
        NetworkAdapter adapter;
        Scanner sc=new Scanner(System.in);
        System.out.println("연결할 네트워크를 선택하세요. [1]WiFi [2]5G [3] LTE : ");
        int num=sc.nextInt();
        switch (num){
            case 1:
                adapter=new WiFi("KT Megapass");
                adapter.connect();
                break;
            case 2:
                adapter=new FiveG("SK Teleconm");
                adapter.connect();
                break;
            case 3:
                adapter=new LTE("LG U+");
                adapter.connect();
                break;
            default:
                System.out.println("네트워크를 선택할 수 없습니다");
        }
    }
}
