package tms.Vagazzi;

import java.util.Scanner;

public class ThirdLessonClasswork {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Set a number 'a' ");
        int a = scanner.nextInt();

        System.out.println("Set a number 'b' ");
        int b = scanner.nextInt();

        System.out.println(a < b ? "A is less than b" : "A is not less than b");
    }
}
