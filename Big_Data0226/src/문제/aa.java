package 문제;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class aa {
    public static void main(String[] args) throws IOException {
        TreeSet<sco> arrList = new TreeSet<>();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("score");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(inputStream);
        Iterator<sco> iterator = arrList.iterator();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(line, " ");
            String name = tokenizer.nextToken(); // 이름
            int kor = Integer.parseInt(tokenizer.nextToken());
            int math = Integer.parseInt(tokenizer.nextToken());
            int eng = Integer.parseInt(tokenizer.nextToken());
            int sss = kor + math + eng;
            double avg = sss / 3;
            arrList.add(new sco(name, kor, math, eng, sss, avg));
        }
        int rank = 0;
        for (sco e : arrList) {
            rank++;
            System.out.println(rank+"등"+" "+"이름: "+e.name + " "+"평균: " + e.avg + " "+"총점: " + e.sss);
        }

    }


    public static class sco implements Comparable<sco> {
        String name;
        int kor;
        int math;
        int eng;
        int sss;
        double avg;

        public sco(String name, int kor, int math, int eng, int sss, double avg) {
            this.name = name;
            this.kor = kor;
            this.math = math;
            this.eng = eng;
            this.sss = sss;
            this.avg = avg;
        }

        @Override
        public int compareTo(sco o) {
            if (this.sss == o.sss) return this.name.compareTo(o.name);
            else if (this.sss < o.sss) return 1;
            else return -1;
        }
    }
}

