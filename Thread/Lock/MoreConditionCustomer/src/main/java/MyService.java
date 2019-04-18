import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author draper_hxy
 */
public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void set() throws InterruptedException {
        try {
            lock.lock();
            while (hasValue) {
                System.out.println("生产");
                condition.await();
//                System.out.println("生产结束");
            }
            System.out.println("set 赋值");
            hasValue = true;
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public void get() throws InterruptedException {
        try {
            lock.lock();
            while (!hasValue) {
                System.out.println("消费");
                condition.await();
//                System.out.println("消费结束");
            }
            System.out.println("get 赋值");
            hasValue = false;
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

}
