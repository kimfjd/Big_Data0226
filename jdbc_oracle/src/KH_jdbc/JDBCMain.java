package KH_jdbc;

import KH_jdbc.dao.EmpDao;
import KH_jdbc.vo.EmpVo;

import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class JDBCMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpDao dao = new EmpDao();

        while (true){
            System.out.println("==================");
            System.out.println("메뉴선택: [1] SELECT [2] INSERT [3] UPDATE [4] DELETE [5] QUIT");
            int sel =sc.nextInt();
            switch (sel){
                case 1:
                    List<EmpVo> list = dao.empSelect();
                    dao.empSelectPrn(list);
                    break;
                case 2:
                    dao.empInsert();
                case 3:

                default:
                    System.out.print("메뉴를 잘못 신청하셨습니다.");
            }
        }
    }
}
