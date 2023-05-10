package tms.vagazzi.lesson_7.PCs;

public interface Calculable {
    void calculate();

    default void printMessage(){
        System.out.println("im useless");
    }
}
