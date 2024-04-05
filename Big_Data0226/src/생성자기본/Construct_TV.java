package 생성자기본;

public class Construct_TV {
    public static void main(String[] args) {
        Tv LGTV=new Tv();
        LGTV.setON(true);
        LGTV.setVolume(200);
        LGTV.setChannel(980);
        LGTV.prnTvInfo();

        Tv samsungTV = new Tv(true,280,99);
        samsungTV.prnTvInfo();
    }
}
