package com.draper;

import java.io.Serializable;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author draper_hxy
 */
public class Mute implements Serializable {


    private static class Sync extends AbstractQueuedSynchronizer {

        // 是否处于占用状态
        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }

        // 当前处于 0 的时候获取锁，CAS 成功，state 更新为 1
        @Override
        protected boolean tryAcquire(int arg) {
            if (compareAndSetState(0, 1)) {
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        // 释放锁， 将 state 更新为 0
        @Override
        protected boolean tryRelease(int arg) {
            if (getState() == 0)
                throw new IllegalMonitorStateException();
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }
    }

    private final Sync sync = new Sync();

    public void lock() {
        sync.acquire(1);
    }

    public boolean tryLock() {
        return sync.tryAcquire(1);
    }

    public void unlock() {
        sync.release(1);
    }

    public boolean isLocked() {
        return sync.isHeldExclusively();
    }

}
