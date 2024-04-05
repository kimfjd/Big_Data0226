package 은행만들기;

public class Bank {
    private static int count = 0; // 클래스 내부에서만 접근 가능하고  static이 있으므로 정적 변수 필드(클레스 생성시 생성)
    private int account;//계좌정보
    private String bank;

    Bank(String name, int account) {
        count++;
        this.bank = name;
        this.account = account;
        System.out.println(name + "은행에 계좌 개설 합니다. 잔액은" + account + "입니다");
    }

    public static int getCount() {
        return count;
    }

    public void setDeposit(final int dep) { // final 붙이는 이뉴는 예금 금액의 변경을 막기 위해
        this.account += dep; // 현재 잔액 + 예금+잔액
        System.out.println(dep + "을 예금 했습니다.");
    }

    public void setWithDraw(final int with) {
        if (with > account) {
            System.out.println("잔액이 부족 합니다");
        }
        else {
            account -= with;
        }
    }
    public void viewAccount(){
        System.out.println("현재 잔액은"+account+"입니다");
    }
}
