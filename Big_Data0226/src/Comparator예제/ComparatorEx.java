package Comparator예제;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Frult> list= new TreeSet<>(new DescendingComparator());
        list.add(new Frult("포도", 3000));
        list.add(new Frult("수박", 10000));
        list.add(new Frult("딸기", 6000));
        Iterator<Frult> iterator=list.iterator();
        while (iterator.hasNext()){
            Frult frult=iterator.next();
            System.out.println(frult.name+": "+frult.price);
        }
    }
}
