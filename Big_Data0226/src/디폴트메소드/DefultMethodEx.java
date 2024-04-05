package 디폴트메소드;

import java.util.Scanner;

//디폴트 메소드: 인터페이스에 있는 구현 메서드를  의미
// 메서드 앞에 defult 예약어 사용
// { } 구현부가 존재해야 함
public class DefultMethodEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RemoteContol remoteContol;
        System.out.println("제품 선택: [1] TV [2] Audio: ");
        int sal = sc.nextInt();
        if(sal==1){
            remoteContol=new TV();
            remoteContol.turnON();
            remoteContol.setVolume(20);
            remoteContol.setMute(true);
            RemoteContol.changeBatter(); //인터페이스에 있는 메소드 접근
        }
        else {
            remoteContol=new Audio();
            remoteContol.turnON();
            remoteContol.setVolume(30);
            remoteContol.setMute(true);
        }
        RemoteContol rc = new RemoteContol() {
            int volume;
            @Override
            public void turnON() {
                System.out.println("플레이스테이션5를 켭니다");
            }

            @Override
            public void turnOFF() {
                System.out.println("플레이스테이션5를 끕니다");
            }

            @Override
            public void setVolume(int volume) {
                if(volume>RemoteContol.MAX_VOLUME){
                    this.volume=RemoteContol.MAX_VOLUME;
                }
                else if (volume<RemoteContol.MIN_VOLUME){
                    this.volume=RemoteContol.MIN_VOLUME;
                }
                else {
                    this.volume=volume;
                }
                System.out.println("현재 TV 볼륨: "+this.volume);
            }
        };
        rc.turnON();
        rc.setVolume(100);
    }
}
