package 벡터;

import java.util.List;
import java.util.Vector;

// Vector: List 인터페이스를 상속 받아 만든 리스트 타입의 자료구조
// Vector: 동기화 기능을 제공하므로 멀티쓰레드 환경에서 안전
// 하지만 성능이 ArrayList에 비해서 떨어지므로 특별히 경우가 아니면 ArrayList를 사용
public class VectorEx {
    public static void main(String[] args) {
        List<NameCard> list=new Vector<>();
        list.add(new NameCard("아이우에오","아이우@우이아","010-****-****","무직"));
        list.add(new NameCard("집가고","싶다@개졸려","010-****-****","자고싶다."));
        list.add(new NameCard("춥고","배고프고@이것보다 안좋을수는 없을꺼야","(비옴)","이야 안좋아질수가 있구나"));

        for(NameCard name: list){
            System.out.println("이름 : "+name.name);
            System.out.println("메일 : "+name.eMail);
            System.out.println("전화 : "+name.phone);
            System.out.println("직업 : "+name.jobs);
        }
    }
}
class NameCard{
    String name;
    String eMail;
    String phone;
    String jobs;

    public NameCard(String name, String eMail, String phone, String jobs) {
        this.name = name;
        this.eMail = eMail;
        this.phone = phone;
        this.jobs = jobs;
    }
}