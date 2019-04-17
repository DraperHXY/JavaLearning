/**
 * @author draper_hxy
 */
public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            service.signalB();
            service.printA();
        }
        service.signalB();
    }

}