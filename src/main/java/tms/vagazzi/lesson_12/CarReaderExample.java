package tms.vagazzi.lesson_12;

import java.io.*;

public class CarReaderExample {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("car.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            while (true) {
                Car myCar = (Car) objectInputStream.readObject();
                System.out.println(myCar.toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
