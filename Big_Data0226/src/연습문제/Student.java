package 연습문제;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Student {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("학생수 입력");
        String na;
        int s=0;
        int stu=sc.nextInt();
        TreeSet<st> list= new TreeSet<>();
        for(int i=0;i<stu;i++){
            na=sc.next();
            s=sc.nextInt();
            list.add(new st(na,s));
        }
        for(st e:list) System.out.println(e.name+":"+e.score);
    }
}
class st implements Comparable<st> {
    String name;
    int score;

    public st(String name, int score) {
        this.name = name;
        this.score = score;
    }

   /* @Override
    public int compare(st o1, st o2) {
        if (o1.score > o2.score) return 1;
        else if (o1.score == o2.score) return 1;
        else return -1;
    }*/

    @Override
    public int compareTo(st o) {
        if(this.score<o.score) return 1;
        else if(this.score==o.score) return name.compareTo(o.name);
        else return -1;
    }
}

