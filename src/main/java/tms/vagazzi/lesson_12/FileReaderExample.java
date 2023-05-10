package tms.vagazzi.lesson_12;

import lombok.SneakyThrows;

import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileReaderExample {
    @SneakyThrows
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("template.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){

            System.out.println(scanner.nextLine());
        }
        fileReader.close();
        scanner.close();
    }
}
