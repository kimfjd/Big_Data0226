package 객체동일함구현;

import java.util.HashSet;
import java.util.Objects;

// 기본적으로 객체(인스턴스)주소가 같으면 같은 객체
public class MemberHashSetEx {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001, "유나");
        Member member2 = new Member(1002, "채원");
        Member member3 = new Member(1003, "지수");
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);

        hashSet.add(new Member(1003, "카리나"));
        for(Member e : hashSet) e.showMember();
    }
}
class Member{
    int id;
    String name;
    public int hashCode() {
        return id;
    }
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member= (Member) obj;
            if(this.id==member.id) return true;
            else return false;
        }
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void showMember(){
        System.out.println("아이디: "+id);
        System.out.println("이름"+name);

    }
    /* @Override
    public int hashCode(){
        return id;*/
    }
