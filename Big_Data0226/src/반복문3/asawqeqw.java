package 반복문3;

public class asawqeqw {
    public static void main(String[] args) {
        int sumOfPrimes = 0; // 소수의 합을 저장할 변수를 초기화합니다.

        for (int num = 2; num <= 10; num++) { // 10 이하의 모든 숫자에 대해 반복합니다.
            boolean isPrime = true; // 초기에는 현재 숫자가 소수임을 가정합니다.

            // 현재 숫자가 1과 자기 자신을 제외한 다른 수로 나누어 떨어지는지를 확인합니다.
            for (int i = 2; i < num; i++) {
                if (num % i == 0) { // 현재 숫자가 다른 수로 나누어 떨어지면 소수가 아닙니다.
                    isPrime = false;
                    break; // 소수가 아니므로 더 이상 확인할 필요가 없습니다.
                }
            }

            // 현재 숫자가 소수인 경우, 소수의 합에 더합니다.
            if (isPrime) {
                sumOfPrimes += num;
            }
        }

        // 소수의 합을 출력합니다.
        System.out.println("10 이하의 소수의 합: " + sumOfPrimes);
    }
}

