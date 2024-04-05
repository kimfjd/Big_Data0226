package 연습문제;

public class Lotto {
    public static void main(String[] args) {
        int[] lottoNum=new int[6];
        for(int i=0;i<lottoNum.length;i++){
          // while(lottoNum[i]==0){
                lottoNum[i] = (int)((Math.random() * 45 + 1));
           // }
        }
        while (lottoNum[0]==lottoNum[1]){
            lottoNum[1] = (int)((Math.random() * 45 + 1));
        }
        while (lottoNum[0]==lottoNum[2]||lottoNum[1]==lottoNum[2]){
            lottoNum[2] = (int)((Math.random() * 45 + 1));
        }
        while (lottoNum[0]==lottoNum[3] || lottoNum[1]==lottoNum[3] || lottoNum[2]==lottoNum[3]){
            lottoNum[3] = (int)((Math.random() * 45 + 1));
        }
        while (lottoNum[0]==lottoNum[4] || lottoNum[1]==lottoNum[4] || lottoNum[2]==lottoNum[4] || lottoNum[3]==lottoNum[4]){
            lottoNum[4] = (int)((Math.random() * 45 + 1));
        }
        while (lottoNum[0]==lottoNum[5] || lottoNum[1]==lottoNum[5] || lottoNum[2]==lottoNum[5] || lottoNum[3]==lottoNum[5] || lottoNum[4]==lottoNum[5]){
            lottoNum[5] = (int)((Math.random() * 45 + 1));
        }
        for (int i = 0; i < lottoNum.length; i++) {
            System.out.print(lottoNum[i] + " ");
        }
    }
}
