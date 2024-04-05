package 현재시간사용하기;

import static java.lang.Thread.sleep;

// currentTimeMillis(): 1970년 1월1일 00:00:00.000을 기준으로 현재 시간의 차이를 변환
// 성능 측정할때
public class CurrentTimeEx {
    public static void main(String[] args) throws InterruptedException {
        int[] data=new int[1000];
        int cnt=0;
        // 배열 내에서 찾고자 하는 임의의 수
        int randVal = (int)((Math.random())*1000+1);
        for(int i=0; i< data.length;i++){
            data[i]=i+1;
        }
        long startTime = System.currentTimeMillis();//  성능 측정을 시작한 시간
        for(int i=0; i< data.length;i++){
            cnt++;
            sleep(1);
            if(randVal==data[i]){
                System.out.println("위치: "+(i+1));
                break;
            }
        }
        long endTime=System.currentTimeMillis();//성능 측정을 완료한 시간
        System.out.println("검색에 소요된 시간"+(startTime-endTime)+"밀리초");
    }
}
