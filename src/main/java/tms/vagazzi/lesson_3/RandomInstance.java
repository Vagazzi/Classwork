package tms.vagazzi.lesson_3;

import java.util.Random;

public class RandomInstance {
    public static void generateNumber(){
        Random random = new Random();
        for (int i = 0; i <10; i++){
            System.out.println(random.nextInt());
        }
    }
}
