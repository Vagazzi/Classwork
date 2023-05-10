package tms.vagazzi.lesson_6;

import tms.vagazzi.lesson_6.classRepository.Car;

public class SixthClasswork {

    public static void main(String[] args) {
        Car myMercedes = new Car();

        myMercedes.setCarBrand("Mercedes");
        myMercedes.setYearOfBuilding(2023);
        myMercedes.setCarColor("Crimson");
        myMercedes.setEngine("2JZ 1400 Hp 1300 nm");
        myMercedes.setTypeOfTransmission("Mechanic");
        myMercedes.setCountOfWheels(4);
        myMercedes.setHasARecorder(false);
        myMercedes.setInitialSpeed(400);

        myMercedes.printInfoAboutCar();

        myMercedes.move();
        myMercedes.changeSpeed(-14);
        myMercedes.changeSpeed(10000);
       myMercedes = myMercedes.checkSpeedByPatrol(myMercedes);

        System.out.println(myMercedes.getCarBrand());
        // nooooooo my car ((9(9(9(9

    }
}
