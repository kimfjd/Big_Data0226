package 회원정보예제;

// 이름 입력
// 나이 입력: 1~199 사이의 정수 값
// 성별 입력: m/M, f/F
// 직업 입력: 1~4 사이의 정수 입력(1은 학생,2는 회사원, 3은 무직, 4는 주부)
// 최종 입력: 모든 입력이 완료되면 한번에 출력
// 나이, 성별, 직업에서 유효한 값이 아니면 제 입력 요구
public class MemberMain {
    public static void main(String[] args) {
        MemberIf Memberif=new MemberIf();// Memberif 클래스 객체 생성
        Memberif.setName(); //이름을 입력 받는 메소드 호출
        Memberif.setAge();//나이를 입력 받는 메소드 호출
        Memberif.setGender();//성별을 입력 받는 메소드 호출
        Memberif.setJobs();//직업을 입력 받는 메소드 호출
        Memberif.getMember();//전체 출력
    }
}
