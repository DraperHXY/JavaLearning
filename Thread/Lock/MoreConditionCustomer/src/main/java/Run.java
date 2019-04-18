/**
 * @author draper_hxy
 */
public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();

        Thread[] threadsA = new Thread[10];
        Thread[] threadsB = new Thread[10];

        for (int i = 0; i < threadsA.length; i++) {
            threadsA[i] = new ThreadA(service);
            threadsB[i] = new ThreadB(service);
            threadsA[i].start();
            threadsB[i].start();
        }
    }

}
