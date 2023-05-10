package tms.vagazzi.lesson_12;


import java.io.*;
import java.util.Scanner;


public class twelvethclasswork {
    public static void main(String[] args) throws IOException {
        String hatefulGreeting = "ah fuck you leatherman";
        File file = new File("template.txt");
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println(hatefulGreeting);
            System.out.println("File has been written!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(FileReader fileReader = new FileReader(file)){
            Scanner sc = new Scanner(fileReader);
            System.out.println(sc.nextLine());
            sc.close();
        }
        catch (IOException e){
            System.out.println("Something goes wrong" + e);
        }

    }
}
