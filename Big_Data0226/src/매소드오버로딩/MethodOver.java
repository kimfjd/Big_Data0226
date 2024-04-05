package 매소드오버로딩;
//메소드 오버로딩: 같은 이름의 메소드를 중복 정의 하는 것
// 1. 메소드 이름이 같을것
// 2. 매개변수의 개수나 타입이 달라야함
// 3. 반환타입은 의미없음
public class MethodOver {
    public static void main(String[] args) {
        System.out.println(sum(300, 500));
        System.out.println(sum(700, 510, 365));
        System.out.println(sum("korea", "Seoul"));
        System.out.println(sum(100,"kk",200));
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static String sum(String x, String y) {
        return x + y;
    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }

    static int sum(int x, String y, int z) {
        if (y.equals("kk")) return x + 100000 + z;
        else return x+z;
    }
}
