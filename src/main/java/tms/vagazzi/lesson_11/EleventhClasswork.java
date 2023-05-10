package tms.vagazzi.lesson_11;

import java.util.Scanner;

public class EleventhClasswork {

    private String result;

    private static final int initialAge = 25;

    public static void main(String[] args) throws ExceptionExample {


        boolean isContinuedGame = true;

        while (isContinuedGame) {
            System.out.println("Enter the guested age");
            Scanner scanner = new Scanner(System.in);
            int currentAge = scanner.nextInt();

            String result = checkAge(initialAge, currentAge);

            try {
                switch (result) {
                    case "You are missed, im a bit younger", "You are missed, im a bit elder" -> {
                        System.out.println(result);
                        System.out.println("Try again");
                    }
                    case "Prepare your face" ->
                            throw new ExceptionExample("Prepare your face, rude user, my age is: ", initialAge);
                    case "You god damn right" -> {
                        System.out.println(result);
                        System.out.println("Game has ended right now");
                        isContinuedGame = false;
                    }
                    default -> throw new ExceptionExample("im crashed, fix me immediately!", 0);
                }
            } catch (ExceptionExample e) {
                System.out.println("You are not an expert in this game, just keep it in mind");
                isContinuedGame = false;
            }
        }
    }

    private static String checkAge(int initialAge, int currentAge) {
        if (initialAge - currentAge > 5 || initialAge - currentAge < -5) return "Prepare your face";
        if (initialAge - currentAge < 0) return "You are missed, im a bit younger";
        if (initialAge - currentAge > 0) return "You are missed, im a bit elder";
        if (initialAge - currentAge == 0) return "You god damn right";
        return "";
    }
}
