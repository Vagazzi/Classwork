package tms.vagazzi.lesson_12;

import java.io.*;

public class CarWriteExample {
    public static void main(String[] args) {
        File file = new File("car.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileOutputStream outputStream = new FileOutputStream("car.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)){

            objectOutputStream.writeObject(new Car(10000, "Ferrari"));
            objectOutputStream.writeObject(new Car(2000, "BMW"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
