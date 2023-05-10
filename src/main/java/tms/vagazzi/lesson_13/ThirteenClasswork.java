package tms.vagazzi.lesson_13;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ThirteenClasswork {
    public static void main(String[] args) {

        //genericOperations();

        //listOperations();

        //setOperations();


        /*
        Микро-выводы по Map's.
        0) HashMap не сортирует значения по ключам, TreeMap - сортирует.
        1)
        2)
        3)
        4)

         */
        Map<Integer, String> firstMap = new HashMap<>();
        Map<Integer, String> secondMap = new TreeMap<>();

        firstMap.put(1, "Red");
        firstMap.put(2, "Orange");
        firstMap.put(3, "Yellow");
        firstMap.put(1, "next");

        System.out.println(firstMap.get(1)); // - принимает по ключам
        System.out.println(firstMap.get(4));

        secondMap.put(1, "Red");
        secondMap.put(2, "Orange");
        secondMap.put(3, "Yellow");

        System.out.println(firstMap.containsKey(3));
        System.out.println(firstMap.isEmpty());
        //System.out.println(firstMap.remove(2));
        System.out.println(firstMap.keySet());
        System.out.println(firstMap.values());
        System.out.println(firstMap);

        firstMap.forEach((k,v) -> System.out.println(k + " " + v));

        Map<String, List<String>> myMap = new HashMap<>();
        // PCs - lenovo, Asus;
        // phones - sasung, aifon

        List<String> PCs = new ArrayList<>();
        PCs.add("lenovo");
        PCs.add("Asus");

        List<String> phones = new ArrayList<>();
        phones.add("sasung");
        phones.add("aifon");

        myMap.put("PCs", PCs);
        myMap.put("Phones", phones);

        myMap.forEach((k,v) -> System.out.println(k + " " + v));


    }

    private static void setOperations() {

    /*
    Микро-выводы по Set'ам.
    0) Set'ы хранят в себе только уникальные значения
    1) HashSet в рандомном порядке закидывает данные;
    2) TreeSet сортирует предоставленные данные;
    3) Необходимо переопределять контракты для TreeSet и HashSet, в частности, для кастомных классов необходимо переопределять
    методы equals() и hashCode();
    4) Для TreeSet необходимо переопределять компаратор, в частности, для конкретного класса мы реализуем интерфейс
    Comparable и реализуем метод compareTo();


     */

        Set<Integer> templateFirstSet = new HashSet<>();
        Set<Integer> templateSecondSet = new TreeSet<>();

        templateFirstSet.add(4);
        templateFirstSet.add(2);
        templateFirstSet.add(1);

        templateSecondSet.add(4);
        templateSecondSet.add(2);
        templateSecondSet.add(1);

        templateFirstSet.forEach(System.out::println);
        System.out.println();
        templateSecondSet.forEach(System.out::println);

        Set<Person> myPerson = new TreeSet<>();
        myPerson.add(new Person("sashko", "gorlov"));
        myPerson.add(new Person("viktor", "gorlov"));
        myPerson.add(new Person("viktor", "tinker"));
        System.out.println(myPerson);
    }

    private static void listOperations() {
        List<String> template = new ArrayList<>();

        template.add("hey");
        template.add("hello");
        template.add("AHAHAHAHAHHAHA");
        template.add("AHAHAHAHAHH1323123123HA");
        template.add("AHAHAHAHA231HHAHA");

        template.stream()
                .filter((e) -> e.contains("h"))
                .forEach(System.out::println);

        System.out.println(template.contains("hey"));
        System.out.println("This collection is empty? " + template.isEmpty());
        System.out.println(template.get(1));
        System.out.println(template.set(1,"shshshshshshshshsh"));
        System.out.println(template.subList(0,2));
        Collections.sort(template);
        System.out.println(template);
        Collections.shuffle(template);
        System.out.println(template);
    }

    private static void genericOperations() {
        KeyStorage<Integer> firstKey = new KeyStorage<>(11);
        KeyStorage<String> secondKey = new KeyStorage<>("gachi");
        System.out.println(firstKey);
        System.out.println(secondKey);
    }
}
