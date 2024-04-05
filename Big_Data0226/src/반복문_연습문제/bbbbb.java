package 반복문_연습문제;

// 10미만의 소수들 전부 더하기
public class bbbbb {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 2; i < 10; i++) {
            boolean axa = true;
            for (int j = 2; j < 10; j++) {
                if (10 % i == 0) axa = false;
                break;
            }

                if(axa) {
                    sum += i;
                }
                }
                System.out.println(sum);

        }
    }





