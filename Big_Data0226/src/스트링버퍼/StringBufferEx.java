package 스트링버퍼;
// StringBuffer와 StringBuilder는 문자열을 추가 하거나 변경할때 사용
// 동일한 기능을 하는 String을 사용하면 더 간결하기는 함
// String 자료형과의 차이는 문자열이 여러번 반복 추가 되어서 한번만 생성
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("hellow");
        sb.append(" ");
        sb.append("JAVA");
        sb.delete(0, 3);
        sb.insert(0, "hhhh");
        System.out.println(sb);
    }
}
