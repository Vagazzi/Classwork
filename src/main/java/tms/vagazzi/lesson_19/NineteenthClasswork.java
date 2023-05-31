package tms.vagazzi.lesson_19;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.concurrent.*;

public class NineteenthClasswork {
    /*

     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        extracted();
//
//        extracted1();
//        extracted2();
        Counter counter = new Counter();

        MyRunnable runnable = new MyRunnable(counter);
        Thread fi = new Thread(runnable);
        Thread se = new Thread(runnable);

        fi.start();
        se.start();

        fi.join();
        se.join();
        System.out.println(counter.getCount());
    }

    private static void extracted2() throws InterruptedException, ExecutionException {
        MyRunnable myRunnable = new MyRunnable(new Counter());
        Thread thread = new Thread(myRunnable);
        thread.start();
        new Thread(() -> System.out.println("Hello world")).start();

        MyCallable callable = new MyCallable();
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<String> result = service.submit(callable);
        System.out.println("here");
        System.out.println("res: " + result.get());

        new Thread(() -> {
            while (true) {
                System.out.println("Hello world spam");
            }
        }).start();
    }

    private static void extracted1() throws InterruptedException {
        System.out.println("Start " + LocalDateTime.now());
        MyThread threadFirst = new MyThread("first");
        MyThread threadSecond = new MyThread("second");
        MyThread threadThird = new MyThread("third");

        threadFirst.start();
        threadSecond.start();
        threadSecond.join();
        threadThird.start();
        System.out.println("End " + LocalDateTime.now());

        System.out.println(threadFirst.getCount());
        System.out.println(threadSecond.getCount());
        System.out.println(threadThird.getCount());
    }

    private static void extracted() {
        System.out.println("Hello world");
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(Thread.currentThread().isAlive());
        Thread.currentThread().setName("leatherstuff");
        System.out.println(Thread.currentThread().getName());
    }

}
