package 접근제한자;

// 접근제한자 : 객체지향의 주요 특성 중 하나, 주로 내부 필드 값에 대한 접근 여부를 제한 할 때 사용
// private: 동일 클래스 내부에서만 접근 가능
// default : 접근 제한자를 붙이지 않으면 default
// protected: 동일한 패키지 내부이거나, 다른 패키지에 있더라도 상속 관계가 있으면 접근 가능
// public: 접근제한을 하지 않음
public class RestricEx {
    public static void main(String[] args) {
        Restrictor restrictor=new Restrictor();

        restrictor.seoul();
        restrictor.busan();
        restrictor.inchun();
        //restrictor.daegu(); private은 동을 클래스 내에서만 접근 가능
    }
}

