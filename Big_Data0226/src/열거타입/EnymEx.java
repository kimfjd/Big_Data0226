package 열거타입;
// 열거 타입이란 한정된 값이 열서 상수 중에서 하나의 상수를 지정하는 타입
// 입력 값의 타입을 제한할 수 있음
public class EnymEx {
    public static void main(String[] args) {
        Developer developer=new Developer("동환",Carreer.JUNIOR,Devtype.DEA,Gender.MALE);
        developer.devInfo();

    }
}
enum Carreer{
    JUNIOR,SENIOR
}
enum Devtype{
    MOBILE,FRONTEND,BACKEND,DEA
}
enum Gender{
    MALE,FEMALE
}

class Developer{
    private String name;
    private Carreer career; //개발자 등급(senior, junior)
    private Devtype devtype;
    private Gender gender;

    public Developer(String name, Carreer career, Devtype devtype, Gender gender) {
        this.name = name;
        this.career = career;
        this.devtype = devtype;
        this.gender = gender;
    }
    public void devInfo(){
        System.out.println("이름 "+ name);
        System.out.println("업무"+ devtype);
        System.out.println("경력"+ career);
        System.out.println("성별"+gender);
    }
}