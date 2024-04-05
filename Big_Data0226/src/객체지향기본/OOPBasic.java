package 객체지향기본;

public class OOPBasic {
    public static void main(String[] args) {
       /* Student s1=new Student(); // Student 클래스로 s1객체 생성
        Student s2=new Student(); // Student 클래스로 s2객체 생성 */
        Student s1= new Student("안유진", "경기도 이천시 갈산동"); // student 클래스에 s1객체 생성
        Student s2=new Student("집마렵다","태양계 화성시");//student 클래스에 s2객체 생성

        // s2.address="태양계 화성";
        s1.showStudentInfo();
        s2.showStudentInfo();
    }
}
class Student{
    private int studentID;//학번
    private String studentName;
    private int grade;//학년
    private String address;//주소

    // 매개변수가 있는 생성자
    public Student(String name, String address) {
        studentName=name;
        this.address=address; //this는 자기자신의 객체를 가르키는 포인트
    }
    public void setStudenID(int id){
        studentID=id;
    }
    // 접근제한자: 해당 메소드에 접근 할 수 있는 범위를 명시(public/default/protected/default/private)
    // 반환 타입: 메소드가 작업을 마치고 반환하는 데이터 타입을 명시(void는 반환 할 게 없다는 의미)
    // 메소드 이름: 메소드를 호출하기 위한 이름(객체 이름.메소드이름)
    // 매개변수 목록:
    // 구현부가 있음
    public void setStudentName(String name){
        studentName=name;
    }
    public void setAddress(String addr){
        address=addr;
    }
    //메소드 추가
    public void showStudentInfo(){
        System.out.println(studentName+","+address);
    }
}