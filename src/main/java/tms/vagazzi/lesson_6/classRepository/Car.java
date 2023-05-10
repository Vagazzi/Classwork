package tms.vagazzi.lesson_6.classRepository;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
@NonNull
public class Car {

    // признаки
    // цвет машины, год машины, марка машины, количество колёс,
    // двигатель, кузов, наличие магнитолы, тип коробки передач
    private String carColor;
    private int yearOfBuilding;
    private String carBrand;
    private int countOfWheels;
    private String engine;
    private boolean isHasARecorder;

    private int initialSpeed;
    private String typeOfTransmission;
    // действия машины: завестись, подать сигнал, поехать вперед,
    // повернуть (влево/вправо), ускориться, замедлиться

    public Car(){

    }
    public Car(String carColor, int yearOfBuilding, String carBrand, int countOfWheels, String engine, boolean isHasARecorder, String typeOfTransmission) {
        this.carColor = carColor;
        this.yearOfBuilding = yearOfBuilding;
        this.carBrand = carBrand;
        this.countOfWheels = countOfWheels;
        this.engine = engine;
        this.isHasARecorder = isHasARecorder;
        this.typeOfTransmission = typeOfTransmission;
    }

    public void printInfoAboutCar(){

        System.out.println("Car specs: ");
        System.out.println("-------------------------------------------------");
        System.out.println("Car brand is: " + this.carBrand);
        System.out.println("Car year  is: " + this.yearOfBuilding);
        System.out.println("Car color  is: " + this.carColor);
        System.out.println("Car's engine info: " + this.engine);
        System.out.println("Is car has a recorder? " + this.isHasARecorder);
        System.out.println("-------------------------------------------------");

    }

    public void move(){
        System.out.println("Beeep-beeep, motherfucker.");
    }

    public void switchDirection(boolean isRightOne){
        if (isRightOne) {
            System.out.println("Im moving on the right direction");
        } else {
            System.out.println("Im moving on the left direction");
        }
    }

    public void changeSpeed(int speedChange){
        if (speedChange > 50){
            System.out.println("I can't improve the move speed. PLZ, stop it");
            return;
        }
        if (speedChange>0){
            System.out.println("we are moving faster!!");
            initialSpeed += speedChange;
            System.out.println("New speed is : " + this.initialSpeed);
        }
        else {
            initialSpeed = initialSpeed - Math.abs(speedChange);
            System.out.println("we are moving slower!");
        }
    }

    public Car checkSpeedByPatrol(Car car) {
        if (this.initialSpeed > 120){
            System.out.println("You are got busted. Your car will be withdraw and destroyed, little street racer. ");
            System.out.println("Your car was destroyed");
            return null;

        } else {
            System.out.println("You can go further, 300 icq gigachad");
        }
        return car;
    }
}
