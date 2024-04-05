package 다차원배열;

public class DoubleArray {
    public static void main(String[] args) {
        int[][] arr=new int[2][3];//arr은 값이 아닌 주소
        //arr[0] 주소
        //arr[0][1]로 접근
        int k=10;
        for (int i =0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=k;
                k+=10;

            }
        }
        for(int i=0;i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]+" ");
            }
        }
    }
}
