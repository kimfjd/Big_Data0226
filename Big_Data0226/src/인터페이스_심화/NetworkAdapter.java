package 인터페이스_심화;

public interface NetworkAdapter {
    void connect();// public abstract
}
class WiFi implements NetworkAdapter{
    String company;
    WiFi(String com){
        company=com;
    }
    public void connect(){
        System.out.println(company+"WiFi가 연결되었습니다");
    }
}
class FiveG implements  NetworkAdapter{
    String company;
    FiveG(String com){
        company=com;
    }

    @Override
    public void connect() {
        System.out.println(company+"FiveG가 연결되었습니다.");
    }
}
class LTE implements NetworkAdapter{
    String company;
    LTE(String com){
        company=com;
    }

    @Override
    public void connect() {
        System.out.println(company+"LTE가 연결 되었습니다");
    }
}