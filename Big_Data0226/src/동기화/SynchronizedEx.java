package 동기화;
// 동기화(Synchronized): 여러개의 쓰레드가 동시에 같은 자원을 접근하는 Lock을 걸어
// 다른 쓰레드의 진입을 막는 것
public class SynchronizedEx {
    public static void main(String[] args) {
        ShareThread shareThread=new ShareThread();
        // 람다식으로 익명의 클래스 생성
        Thread thread1=new Thread(()->{
            shareThread.setVaule(100);
        });
        Thread thread2 = new Thread(()->{
            shareThread.setVaule(10);
        });
        thread1.setName("쓰레드 1");
        thread2.setName("쓰레드 2");
        thread1.start();
        thread2.start();
    }

    }

class ShareThread{
    private int vaule =0;
    public int getVaule(){
        return vaule;
    }

    public synchronized void setVaule(int vaule) {
        this.vaule = vaule;
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"의 Value 값은 " + this.vaule + "입니다." );
    }
}