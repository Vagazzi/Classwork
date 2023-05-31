package tms.vagazzi.lesson_19;

public class MyRunnable implements Runnable {

    private Counter counter;

    public MyRunnable(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            //System.out.println("run from runnable lul");
            try {
                counter.increment();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
