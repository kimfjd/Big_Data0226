package 스트림기본;

import 예외상황.CustomExceptionEx;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        TravelCustomer customerA=new TravelCustomer("안유진",21,100);
        TravelCustomer customerB=new TravelCustomer("유나",21,100);
        TravelCustomer customerC=new TravelCustomer("지수",25,80);
        List<TravelCustomer> customersList = new ArrayList<>();
        customersList.add(customerA);
        customersList.add(customerB);
        customersList.add(customerC);
        customersList.add(new TravelCustomer("민지",18,90));
        System.out.println("고객 명간 순서대로 출력");
        customersList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
        int total = customersList.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println("총 여행 비용"+ total);
        System.out.println("====20세 이상====");
        customersList.stream()
                .filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
    }
}
class TravelCustomer{
    private String name;
    private int age;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;

    }
}
