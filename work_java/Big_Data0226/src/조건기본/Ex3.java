package 조건기본;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("이름을 입력해 주세요");
        String name=sc.next();
        sc.nextLine(); //버퍼 비우기
        System.out.println("행사 제목을 알려주세요");
        String title=sc.nextLine();
        System.out.println("날짜를 입력 해주세요: 날짜 형식 YYYYMMDD");
        String date = sc.next();
        System.out.println("행사 시간을 입력해 주세요 hh");
        int hour=sc.nextInt();

        String year= date.substring(0, 4);
        String month= date.substring(4, 6);
        String day= date.substring(6, 8);
        System.out.println(name+"님");
        switch(month) {
            case "01":
                System.out.println("한파의 연속인 1월 입니다.");
                break;
            case "02":
                System.out.println("겨울이 끝나가는 2월 입니다.");
                break;
            case "12":
                System.out.println("한파의 연속인 12월 입니다.");
                break;
            case "03":
                System.out.println("봄의 기운이 느껴지는 3월 입니다.");
                break;
            case "04":
                System.out.println("새싹이 피어나는 4월 입니다.");
                break;
            case "05":
                System.out.println( "계절의 여왕 5월 입니다.");
                break;
            case "06":
                System.out.println("활동하기 좋은 6월 입니다.");
                break;
            case "07":
                System.out.println("휴가가 기다려지는 7월 입니다.");
                break;
            case "08":
                System.out.println("무더운 8월 입니다.");
                break;
            case "09":
                System.out.println("선선한 9월 입니다.");
                break;
            case "10":
                System.out.println("천고마비의 계절 10월 입니다.");
                break;
            case "11":
                System.out.println("쓸쓸한 늦가을 11월 입니다.");
                break;
        }
        System.out.println("아래의 일정으로"+title+"를 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.");
        System.out.println("=========행사 안내======");
        System.out.println(title);
        System.out.println(year+"년"+month+"월"+day+"일");
        System.out.println(hour+"시");

    }
}
