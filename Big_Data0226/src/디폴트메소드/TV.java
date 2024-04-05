package 디폴트메소드;

    public class TV implements RemoteContol{
        private int volume;
        @Override
        public void turnON() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOFF() {
            System.out.println("TV를 끕니다.");
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

        @Override
        public void setMute(boolean mute) {
            if(mute) System.out.println("TV를 무음으로 처리 합니다.");
            else System.out.println("TV 무음 처리를 해제 합니다.");
        }
    }


