package tms.vagazzi.lesson_14;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class MapExample {
    public static void main(String[] args) {
        Map<String, List<String>> products = new HashMap<>();

        String category = "fruits";

        products.put(category, new ArrayList<>());

        List<String> categoryProducts = products.get(category);

        if (categoryProducts == null){
            System.out.println("нет такой категории");
        } else {
            categoryProducts.add("Apple");
            categoryProducts.add("Apple");
            categoryProducts.add("Apple");
            categoryProducts.add("Apple");
            categoryProducts.add("Apple");
        }

        System.out.println(products);


    }
}
