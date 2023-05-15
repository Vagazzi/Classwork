package tms.vagazzi.lesson_14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
 * Микро-выводы.
 * 0) Predicate - функциональный интерфейс с методом test().
 * Возвращает true или false.
 * 1) Consumer - функциональный интерфейс с методом accept().
 * Ничего не возвращает.
 * 2) Supplier - функциональный интерфейс с методом get().
 * Ничего не принимает, но что-то возвращает.
 * 3) Function - функциональный интерфейс с методом apply()
 *
 *
 *
 *
 * */
public class FruitMain {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("banana", 200, "yellow"));
        fruits.add(new Fruit("orange", 120, "orange"));
        fruits.add(new Fruit("pineapple", 2200, "yellow"));
        fruits.add(new Fruit("melon", 440, "orange"));
        fruits.add(new Fruit("strawberry", 70, "red"));
        fruits.add(new Fruit("melon", 4420, "orange"));

        fruits.stream()
                .filter(fruit -> fruit.getColour()
                        .equals("yellow"))
                .forEach(System.out::println);

        fruits.stream()
                .filter(fruit -> fruit.getWeight() > 100)
                .forEach(System.out::println);

        Predicate<Fruit> predicate = fruit -> fruit.getColour().equals("yellow");
        Consumer<Fruit> myStringConsumer = s -> System.out.println(s.toString());
        printRequestedFruits(fruits, myStringConsumer);
        System.out.println("<divider>");
        printRequestedFruits(fruits, s -> {
            if (s.getName().equals("melon")) {
                System.out.println("\t" + s);
            }
        });
        System.out.println("</divider>");
        System.out.println(filterFruits(fruits, predicate));
    }

    private static void printRequestedFruits(List<Fruit> fruits, Consumer<Fruit> fruitConsumer) {
        for (Fruit fruit : fruits) {
            fruitConsumer.accept(fruit);
        }
    }

    private static List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> predicate) {
        List<Fruit> res = new ArrayList<>();

        for (Fruit fruit : fruits) {
            if (predicate.test(fruit)) {
                res.add(fruit);
            }
        }

        return res;
    }
}
