package tms.vagazzi.lesson_7.PCs;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PersonalComputer extends Computer implements Calculable {

    @Override
    public void power() {
        System.out.println("I don't have any battery!");
    }

    @Override
    public void calculate() {
        System.out.println("1+1 = 2");
    }

    @Override
    public void printMessage(){
        System.out.println("im not useless");
    }
}
