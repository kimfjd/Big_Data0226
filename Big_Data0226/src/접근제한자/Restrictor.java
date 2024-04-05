package 접근제한자;

import 접근제한자.City;

public class Restrictor extends City {
    public void seoul(){
        System.out.println("서울 메소드는 public입니다.");
    }
    void busan(){
        System.out.println("부산 메소드는 default 입니다.");
    }
    protected void inchun(){
        System.out.println(("인천의 메소드는 protected입니다."));
    }
    private void daegu(){
        System.out.println("대구의 메소드는 private입니다");
    }
}
