package 반복문3;

// 이중 for문을 사용하여 구구단 찍기
 public class double_for_Ex {
    public static void main(String[] args) {
        for(int i = 2; i <10; i++) {
            System.out.println("구구단수 찍기 : " + i + "단");
            for(int j = 1; j < 10; j++) {
                System.out.printf(" %d x %d = %d\n", i , j, (i*j));
            }

            System.out.println();
        }
    }
}
