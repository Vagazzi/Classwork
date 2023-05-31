package tms.vagazzi.lesson_19;

import lombok.Getter;

import java.util.Random;

@Getter
public class MyThread extends Thread{

    private int count;

    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        count = new Random().nextInt();
        try {
            super.run();
            System.out.println("start of my thread with name " + getName());
            Thread.sleep(2000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("end of my thread " + getName());
    }
}
