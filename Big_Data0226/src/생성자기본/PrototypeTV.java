package 생성자기본;

public class PrototypeTV {
    boolean isPower;
    int channel;
    int volume;
    public PrototypeTV(){// 생성자는 반환타입이 없고 클래스와 이름과 동일
        this.isPower=false;
        this.channel=10;
        this.volume=10;
    }
    // 생성자 오버로딩(동일한 이름의 매소드가 여러개 존재 하는 것, 매개변수의 타입이나 개수가 달라야함)
    public PrototypeTV(boolean isPower, int channel, int volume){
        this.isPower=isPower;
        this.channel=channel;
        this.volume=volume;
    }
    public void setChannel(int cnl){
        if(cnl>0 && cnl<1000){
            channel=cnl;
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
}
