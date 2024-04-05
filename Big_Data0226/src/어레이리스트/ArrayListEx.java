package 어레이리스트;

import java.util.ArrayList;
import java.util.List;

// List 인터페이스: ArrayList, Vector, LinkedList 부모 인터페이스
// List의 특징은 배열과 유사하지만, 동적으로 크기가 변함
// -요소의 저장순서 유지
// -중복 저장 허용
// -여러가지 메소드 제공
public class ArrayListEx {
    public static void main(String[] args) {
        // asList() 배열을 LIST로 변환하기 위해 사용
        //String[] data={137,129,142};
        //List<String> pitches = new ArrayList<>(ArrayList.asList(data));
        //System.out.println(pitches);
        List<String> pitches = new ArrayList<>();
        pitches.add("138"); // 리슽트에 값 추가
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches);
        String one=pitches.get(0); // 해당 인덱스의 값을 가져옴
        String two=pitches.get(1);
        System.out.println(one+", "+two);
    }
}
