//package tms.vagazzi.lesson_3;
//
//public class ThirdLessonClasswork {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Set a temperature ");
//        int temperature = scanner.nextInt();
//
//        if (temperature > 20) {
//            System.out.println("it's hot");
//        }
//        else if (temperature >= 5) {
//            System.out.println("it's warm");
//        }
//        else if (temperature >-100) {
//            System.out.println("it's cold");
//        }
//
//        String result = (temperature > 20) ? "hot" : temperature >= 5 ? "warm" : "cold";
//        System.out.println(result);
//
//        switch (temperature){
//            case 20 -> System.out.println("hot");
//            case 5 -> System.out.println("warm");
//            default -> {
//                System.out.println("i cannot determine the temperature, cause im stupid ((999");
//            }
//
//        }
//
//        System.out.println("Insert a number of month");
//        int month = scanner.nextInt();
//
//        // Java 14 switch-case construction
//
//        switch (month) {
//
//            case 12, 1, 2 -> System.out.println("It is a winter");
//            case 3, 4, 5 -> System.out.println("It is a spring");
//            case 6, 7, 8 -> System.out.println("It is a summer");
//            case 9, 10, 11 -> System.out.println("It is a autumn");
//            default -> {
//                System.out.println("I cannot recognize a time of year");
//            }
//        }
//
//        ForLoopClass.runLoop();
//        RandomInstance.generateNumber();
//
//         0 -5 10 -15 20 -25
//
//       solve the problem asap
//        for (int i = 0, iter = 0; i < 20; i++, iter++) {
//
//            if (iter % 2 == 0) {
//                System.out.println("Numbers " + i * 5);
//            } else {
//                System.out.println("Numbers " + i * 5 * -1);
//            }
//
//        }
//
//    }
//
//}
