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

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("A 加锁");
            conditionA.await();
            System.out.println("A 释放锁");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println("B 加锁");
            conditionB.await();
            System.out.println("B 释放锁");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalA() {
        lock.lock();
        System.out.println("A signal");
        conditionA.signal();
        System.out.println("A signal after");
        lock.unlock();
    }

    public void signalB() {
        lock.lock();
        System.out.println("B signal");
        conditionB.signal();
        System.out.println("B signal after");
        lock.unlock();
    }

}
