/**
 * @author draper_hxy
 */
public class ThreadB extends Thread {

    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        try {
            service.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
