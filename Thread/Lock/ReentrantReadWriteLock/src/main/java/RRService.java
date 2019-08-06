import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author draper_hxy
 */
public class RRService implements Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    @Override
    public void read() {
        try {
            try {
                lock.readLock().lock();
                System.out.println("获得读锁\t" + Thread.currentThread().getName() + "\t" + System.currentTimeMillis());
                Thread.sleep(2000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write() {
        try {
            try {
                lock.writeLock().lock();
                System.out.println("获得写锁\t" + Thread.currentThread().getName() + "\t" + System.currentTimeMillis());
                Thread.sleep(2000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
