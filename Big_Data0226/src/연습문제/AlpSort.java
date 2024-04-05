package 연습문제;

import java.util.*;

public class AlpSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String[] aa=new String[num];
        sc.nextLine();
        for(int i=0;i<num;i++){
            aa[i]=sc.next();
        }
        HashSet<String>set=new HashSet<>(Arrays.asList(aa));
        aa=set.toArray(new String[0]); // set이 길이를 유지하면서 배열로 변환
        Arrays.sort(aa, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2); //길이가 같은 경우 사전 순 정렬
                }
                else {
                    return o1.length()-o2.length(); //o1 길이가 길면 양수(오름차순)
                }
            }
        });
            System.out.println(Arrays.toString(aa));

    }
}

