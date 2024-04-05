package 생성자기본;

// 시제품 티비를 만들고, 상속 받아 기능이 개선된 양산용티비 만들기
public class InheritanceTV {
    public static void main(String[] args) {
        ProductTV productTV=new ProductTV();
        ProductTV lgTv=new ProductTV("My home TV");
        lgTv.setPower(true);
        lgTv.setVolume(90);
        lgTv.setChannel(1500,true);
        lgTv.viewTV();
    }
}
