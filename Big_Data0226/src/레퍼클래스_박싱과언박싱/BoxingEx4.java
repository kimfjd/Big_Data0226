package 레퍼클래스_박싱과언박싱;
// Wrapper 클래스: 기본 타입을 객체 타입으로 취급해야 하는 경우 사용(제네릭, 컬렉션프레임워크)
public class BoxingEx4 {
    public static void main(String[] args) {
        Integer num=new Integer(17);
        int n=num.intValue();
        //"ㅡㅡㅡㅡㅡ자바 1점대  버전 기본 선언 방식-------"
        Integer q=7; // 오토박싱
        int w=8; // 오토언박싱(int는 기본방식이기 때문에 null값은 못넣음)

    }
}
