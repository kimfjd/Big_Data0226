package 버블정렬;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr={9,4,3,10,5,8,7,6,2,1};
        int tmp = 0; // 갑을 임시로 담을 함수
        for(int i=0; i<arr.length; i++){
            for(int j= i; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    tmp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=tmp;

                }
            }
        }
        for(int e: arr) System.out.println(e+" ");
    }
}
