package tms.vagazzi.lesson_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionExample {
    public static void main(String[] args) {

        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("pineapple", 2200, "yellow"));
        fruitList.add(new Fruit("melon", 440, "orange"));
        fruitList.add(new Fruit("strawberry", 70, "red"));
        fruitList.add(new Fruit("melon", 4420, "orange"));
        fruitList.add(new Fruit("banana", 200, "yellow"));
        fruitList.add(new Fruit("orange", 120, "orange"));

        Supplier<Integer> myRandomSupplier = () -> new Random().nextInt(6);
        Function<Fruit, String> getNameFunction = fruit -> fruit.getName().substring(0,2);
        Function<Fruit, String> getSizeFunction = fruit -> fruit.getWeight() > 20 ? "Big" : "Small";

        Collections.sort(fruitList, (o1, o2) -> o1.getWeight() - o2.getWeight());

        System.out.println(getOneFruit(fruitList, myRandomSupplier));
        System.out.println(getOneFruit(fruitList, myRandomSupplier));
        System.out.println(getOneFruit(fruitList, () -> 0));
        System.out.println(getOneFruit(fruitList, () -> fruitList.size()-1));

        System.out.println(getOneFruit(fruitList, () -> {
            int position = new Random().nextInt(6);
            while (fruitList.get(position).getName().equals("Banana")){
                position = new Random().nextInt(5);
            }
            return position;
        }));



    }

    private static Fruit getOneFruit(List<Fruit> fruits, Supplier<Integer> pos){
        return fruits.get(pos.get());
    }
}
