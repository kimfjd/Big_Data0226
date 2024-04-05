package 다중인터페이스;

public class MultiInterface {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer; // Customer Type의 customer 참조 변수를 Buy 인터페이스형에 대입하여 형 변환
        buyer.buy();          //  Buyer는 Buy 인터페이스의 메서드만 호출 가능

        Sell seller = customer;
        seller.sell();
        Customer customer2 = (Customer) seller; // 다시 역으로 형 변환
        customer2.buy();
        customer2.sell();
    }
}

interface Sell{
    void sell();
    default void order(){
        System.out.println("판매 주문");
    }
}
interface Buy{
    void buy();
    default void order(){
        System.out.println("구매 주문");
    }
}
class Customer implements Buy, Sell{

    @Override
    public void sell() {
        System.out.println("판매하기");
    }

    @Override
    public void buy() {
    System.out.println("구매하기");
    }

    @Override
    public void order() {
        System.out.println("주문하기");
    }
}