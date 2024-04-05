package 생성자기본;

public class Tv {
    private boolean isoN; //전원
    private int channel;
    private int volume;
    // 매개변수가 없는 기본 생성자
    Tv() {
        isoN=false;
        channel=11;
        volume=10;
        System.out.println("기본 생성자 호출!! 전원: "+ isoN+ "채널: "+ channel+"볼륨: "+ volume);
    }
    // 생성자 오버로딩된 생성자
    Tv(boolean isoN, int channel, int volume){
        this.isoN=isoN;
        this.channel=channel;
        this.volume=volume;
    }
    public void setON(boolean onoff) {
        isoN=onoff;
        String onoffstr = (isoN)? "on":"off"; // 불리언 값으로 받은 값을 on/off 문자열로 변환
        System.out.println("Tv 전원: "+onoffstr);
    }
    public void setChannel(int chl){
        if(chl>=1 &&chl<=999){// 인스턴스 필드에 값을 쓰기전에 유효한 값인지 여부 확인
            channel=chl;
            System.out.println("채널을"+ channel+"로 변경하셨습니다");
        }
        else {
            System.out.println("유효한 채널이 아닙니다");
        }
    }
    public void setVolume(int vol){
        if(vol>=0&&vol<=100){
            volume=vol;
            System.out.println("볼륨을"+volume+"변경하셨습니다");
        }
        else {
            System.out.println("유효하지 않는 볼륨값 입니다");
        }
    }
    public void prnTvInfo(){
        String onoffStr = (isoN)? "ON":"OFF";
        System.out.println("=======TV정보======");
        System.out.println("전원"+onoffStr);
        System.out.println("채널"+ channel);
        System.out.println("볼륨"+volume);
    }
}
