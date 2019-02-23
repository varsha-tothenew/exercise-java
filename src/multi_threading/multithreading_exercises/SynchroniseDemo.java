// 10.Use Synchronize method to enable synchronization between multiple threads trying to access method at same time.
// 11.Use Synchronize block to enable synchronization between multiple threads trying to access method at same time.
// 12.Use Atomic Classes instead of Synchronize method and blocks.

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//same variable count incremented by two threads simultaneously might result in wrong result as sum dont add up tp be 2000
public class SynchroniseDemo{

    int count;
    int countsync1;
    int countsync2;
    AtomicInteger countsync3=new AtomicInteger();
    Lock lock = new ReentrantLock(true);
    int countsync4;

    public void incrementCount() {
        count++;
        //synchroised block
        synchronized (this){countsync2++;}
        countsync3.incrementAndGet();//++ cannot be applied to atomic integer its a operation only for primitives
        lock.lock();
        countsync4++;
        lock.unlock();
    }
    //synchronised method
    synchronized public void incrementCountsync1(){
        countsync1++;
    }

    public void worker1() {
        for (int i=1;i<=1000;i++){
            incrementCount();
            incrementCountsync1();
        }
    }

    public void worker2() {
        for (int i=1;i<=1000;i++){
            incrementCount();
            incrementCountsync1();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        SynchroniseDemo synchronizeDemo = new SynchroniseDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizeDemo.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizeDemo.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchronizeDemo.count);
        System.out.println(synchronizeDemo.countsync1);
        System.out.println(synchronizeDemo.countsync2);
        System.out.println(synchronizeDemo.countsync3);
        System.out.println(synchronizeDemo.countsync4);
    }

}
