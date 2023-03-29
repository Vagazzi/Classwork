package tms.vagazzi.lesson_3;

public class ForLoopClass {
    public static void runLoop(){

        int sum = 0;
        for (int i = 1; i <100; i+=2){
            System.out.println("it is a not integer " +i);
            sum+=i;
        }
        System.out.println("Sum of all elements is equal to: " + sum);

    }
}
