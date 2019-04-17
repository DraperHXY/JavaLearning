import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author draper_hxy
 */
public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void printA() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "\tA");
            conditionA.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void signalA() {
        try {
            lock.lock();
            conditionA.signal();
        } finally {
            lock.unlock();
        }
    }

    public void printB() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "\tB");
            conditionB.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalB() {
        try {
            lock.lock();
            conditionB.signal();
        } finally {
            lock.unlock();
        }
    }

}
