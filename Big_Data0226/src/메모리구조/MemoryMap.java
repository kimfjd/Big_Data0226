package 메모리구조;

public class MemoryMap {
    public static void main(String[] args) {
        // 기본 타입 변수
        int age =25;
        Integer age2=25;

        //참조
        String name ="개어렵다";
        String name2= new String("아 여기서 막히면 안되는데;;"); //heap영역

        // null nullponinterException
        // null은 객체를 참조하지 않는 다는 의미
        // 참조타입 변수가 바라보고 있는 위치에 객체가 없으면 nullpointerException
        int[] inrArray = null;
        String name3=null;
        Integer jobs=null;

        // 참조 변수의 ==, != 연산
        String strval1= "나히도";
        String strval2= new String("나히도");
        String strval3= "나히도";

        if (strval1 == strval3) {
            System.out.println("참조 타입의 주소가 같음을 의미");
        }
        else{
            System.out.println("참조 타입의 주소가 다름을 의미");
        }

        if (strval1.equals(strval2)) { //equals=참조하는 내용을 확인
            System.out.println("참조하는 내용이 같음");
        }
        else {
            System.out.println("참조하는 내용이 다름");
        }
    }
}
