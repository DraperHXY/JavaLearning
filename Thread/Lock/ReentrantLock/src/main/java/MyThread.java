/**
 * @author draper_hxy
 */
public class MyThread extends Thread{

    public MyService myService;

    public MyThread(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }

}
