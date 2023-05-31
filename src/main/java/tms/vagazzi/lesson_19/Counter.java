package tms.vagazzi.lesson_19;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public class Counter {

    private AtomicInteger integer;
    private int count;

    private volatile int counter;

    private final Object lock = new Object();

//    public synchronized void increment() throws InterruptedException {
//        setCount(getCount() + 1);
//        Thread.sleep(1000);
//        System.out.println("lul");
//    }

    public  void increment() throws InterruptedException {
        synchronized (lock){
            setCount(getCount() + 1);
        }

        Thread.sleep(1);
        System.out.println("lul");
    }
}
