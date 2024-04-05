package 예외상황;
// ArrayIndexOutOfBoundsException: 배열의 인덱스를 넘어가는 경우 발생하는 예외
public class ExceptionEx1 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        try{
            for(int i=0; i<=5; i++){
                arr[i]=i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            //e.printStackTrace();
            System.out.println("ArrayIndexOutOfBoundsException 발생함");
        }
        System.out.println("프로그램 정상 종료");
    }
}
