package 코코아톡;

public interface NetworkAdapter {
    void connect();
    void send(String msg);
}

class WiFi implements NetworkAdapter {
    @Override
    public void connect() {}

    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}
class FiveG implements NetworkAdapter {
    @Override
    public void connect() {}

    @Override
    public void send(String msg) {
        System.out.println("5G >> " + msg);
    }
}