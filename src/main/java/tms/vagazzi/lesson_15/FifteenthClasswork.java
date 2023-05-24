package tms.vagazzi.lesson_15;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FifteenthClasswork {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 5, 3, 2, 1);
        Map<Integer, Long> res = values.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        List<User> users = Arrays.asList(new User(20, "leatherman"),
                new User(14, "vitalya"),
                new User(30, "ada"));

        Map<Integer, List<User>> usersByAge = users.stream()
                .collect(Collectors.groupingBy(User::getAge));

        System.out.println(usersByAge);

        System.out.println(res);

        List<Employee> employees = Arrays.asList(new Employee("dev", 300),
                new Employee("BA", 1400),
                new Employee("CLEANING MANAGER", 100),
                new Employee("dev", 1700),
                new Employee("BA", 700));

        var avg = employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        System.out.println(avg);

        var employeesCategory = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory));

        var salariesByCategory = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory,
                        Collectors.averagingDouble(Employee::getSalary)));

        var minSalariesByCategory = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory,
                        Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));

        System.out.println(salariesByCategory);
        System.out.println(minSalariesByCategory);


    }
}
