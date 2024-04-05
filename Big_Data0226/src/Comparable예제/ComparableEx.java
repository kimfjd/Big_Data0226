package Comparable예제;

import 자동차프로젝트.Car;

import java.util.TreeSet;

// Comparable : 인터페이스는 객체들을 정렬하는 데 사용되는 인터페이스
// Comparable : 자기 자신과 외부로 부터 전달ㅈ된 객체를 비교
// Comprator : 두개의 객체를 전달 받아 비교해 봄
public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<CarCompare> list=new TreeSet<>();
        list.add(new CarCompare("Santafe",2016,"흰색"));
        list.add(new CarCompare("Sorento",2012,"은색"));
        list.add(new CarCompare("Grander",2018, "블랙"));
        list.add(new CarCompare("Morning",2012,"노란색"));

        for(CarCompare e: list){
            System.out.println(e.modelName+":"+e.modelYear);
        }
    }
}
