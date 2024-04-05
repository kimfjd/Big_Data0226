package Arrays클래스;
// 과일 이름이을 길이순으로 정렬하고 길이가 같은 경우 사전순 정렬
// compare(): 두개의 매개변수가를 받아 값 비교함
// g: 두 객채가 같음을 의미
// 양수: 첫번째 객체가 두번째 객체보다 크다는 의미
// 음수: 첫번째 객체가 두번째 객체도다 작단ㄴ 의미
import java.util.Arrays;
import java.util.Comparator;

public class FruitSortEx {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi", "Orange", "Apple", "Banana", "Melon",
                "Mango", "Watermelon", "Cherry", "Plum", "Peach"};
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1; // 정렬 조건
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2);
                    }
                    return -1; // 현 상태 유지
                }
            }
        };
        System.out.println(Arrays.toString(fruit));
    }

}

