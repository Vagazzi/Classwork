package tms.vagazzi.lesson_7.PCs;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor

public class Laptop extends Computer implements Calculable {
    private String touchpad;

    public Laptop(PCSizes pcSize, int sizeOfRAM, String HDD, String CPU, String touchpad) {
        super(pcSize, sizeOfRAM, HDD, CPU);
        this.touchpad = touchpad;
    }

    public Laptop(String touchpad) {
        this.touchpad = touchpad;
    }

    @Override
    public String toString() {
        return "Laptop{} " + super.toString();
    }

    @Override
    public void power() {
        System.out.println("I have a battery!");
    }

    @Override
    public void calculate() {
        System.out.println("My creators is a javascript developers");
        System.out.println("1+1 = 11");
    }
}
