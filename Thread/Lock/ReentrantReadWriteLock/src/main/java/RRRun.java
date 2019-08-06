/**
 * @author draper_hxy
 */
public class RRRun {

    public static void main(String[] args) {
        RRService rrService = new RRService();
        ThreadA threadA = new ThreadA(rrService);

        threadA.setName("A");
        ThreadB threadB = new ThreadB(rrService);
        threadB.setName("B");

        threadA.start();
        threadB.start();

    }

}
