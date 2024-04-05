package 제네릭;
// 프린터에 사용될 재료
public class Powder {
    public void doPrinting(){
        System.out.println("Powder 재료로 출력합니다.");
    }
    @Override
    public String toString(){
       return "재료는 Powder 입니다.";
    }
}
