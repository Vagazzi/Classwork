package tms.vagazzi.lesson_7;

import tms.vagazzi.lesson_7.PCs.*;

public class SeventhClasswork implements Cloneable{
    public static void main(String[] args) {

//        Computer computer = new Laptop();
//        computer.setCPU("322");

        PersonalComputer PC = new PersonalComputer();
        Laptop laptopNext = new Laptop(PCSizes.Portative,32,"Seagate","AMD Ryzen 5 5600X", "Lenovo");
        laptopNext.power();
        PC.power();

        PC.printMessage();
        laptopNext.printMessage();

        Calculable[] calculable = new Calculable[4];


        laptopNext.calculate();
        PC.calculate();

        System.out.println(laptopNext.toString());

    }
}
