/**
 * @author draper_hxy
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        ThreadB threadB = new ThreadB(myService);

        threadA.start();
        threadB.start();
        Thread.sleep(2000);

        myService.signalA();
        Thread.sleep(2000);
        myService.signalB();
    }

}
