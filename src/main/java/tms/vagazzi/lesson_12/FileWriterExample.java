package tms.vagazzi.lesson_12;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("template.txt",true);) {

            writer.write("i'll show you who's a boss of this gym");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
