package 디폴트메소드;

public interface RemoteContol {
    int MAX_VOLUME=100; //final static 이 자동 추가(기능 명세에서 미리 정한 값의 의미)
    int MIN_VOLUME=0;
    void turnON(); // public abstract가 자동으로 추가
    void turnOFF();
    void setVolume(int volume);
    // 디폴트 매소드 추가 : JDK 8 이후 추가 됨
    default void setMute(boolean mute){
        if(mute) System.out.println("무음 처리합니다.");
        else System.out.println("무음 해제 합니다.");
    }

    // static을 사용하면 RemoteContol 인터페이스 소속이므로 메소드 구현 가능
    static void changeBatter(){
        System.out.println("건전지 교환");
    }
}
