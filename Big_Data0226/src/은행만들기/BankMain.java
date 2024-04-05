package 은행만들기;

public class BankMain {
    public static void main(String[] args) {
        Bank kakao=new Bank("카카오",1000);
        Bank shinhan=new Bank("신한은행",1000);
        Bank NH=new Bank("농협",10);
        kakao.setDeposit(3500);
        kakao.viewAccount();

        shinhan.setDeposit(900);
        shinhan.viewAccount();

        NH.setDeposit(100);
        NH.viewAccount();

        System.out.println(Bank.getCount());
    }
}
