package 배열기본;

public class ArrayBasicEx {
    public static void main(String[] args) {
       int[] arr= new int[3]; //길이가 3개인 정수 타입 배열 생성
        arr[0]=85;
        arr[1]=67;
        arr[2]=100;

        /*for(int i=0; i<arr.length; i++){
            arr[i] += 5; // 배열에 직접적인 영향을 줌
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // 향상된 for문: 자동 순회, 자동 순회 하면서 요소의 값을 가져옴
        for(int e: arr){
            e+=3; // 값에만 영향을 주지 배열에 직접적인 영향을 안줌
            System.out.print(e+" "); */
        String[] weeks ={"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
        for (int i=0; i<weeks.length; i++) {
            System.out.println(weeks[1]);
        }
        for(String e: weeks) System.out.println(e+" ");
    }
}
