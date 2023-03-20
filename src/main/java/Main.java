//package com.gpcoder.collectors;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private Integer age;
    private String companyName;
    private Integer salary;

    public Employee(String name, Integer age, String companyName, Integer salary) {
        this.name = name;
        this.age = age;
        this.companyName = companyName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Integer getSalary() {
        return salary;
    }
}

public class Main {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList( //
                new Employee("Emp1", 22, "A", 50), //
                new Employee("Emp2", 23, "A", 60), //
                new Employee("Emp3", 22, "B", 40), //
                new Employee("Emp4", 21, "B", 70) //
        );
        // Find employees with the maximum age of each company
        Comparator<Employee> ageComparator = Comparator.comparing(Employee::getAge);


        Map<String, Optional<Employee>> map = list.stream().collect(
                Collectors.groupingBy(Employee::getCompanyName,
                        Collectors.reducing(BinaryOperator.maxBy(ageComparator))));

        map.forEach((k, v) -> System.out.println(
                "Company: " + k +
                        ", Age: " + ((Optional<Employee>) v).get().getAge() +
                        ", Name: " + ((Optional<Employee>) v).get().getName()));

        // Summary salary

//        Integer bonus = 30;
//        Integer totalSalaryExpense = list.stream()
//                .map(emp -> emp.getSalary())
//                .reduce(bonus, (a, b) -> a + b);
//        System.out.println("Total salary expense: " + totalSalaryExpense);
        FloatFunction<Float> a = (x) -> (float) x;
        float b = a.apply(12);
        System.out.println(b);

//        joinString<String, String, Integer> nameer = (firstname, lastname) -> Integer.parseInt(firstname) + Integer.parseInt(lastname);
//        int y = nameer.apply("200", "200");
//        System.out.println(y);

        lengthString<String, Integer> string = (text) -> text.length();

        int leng = string.apply("tuandeotrai");
        System.out.println(leng);


        Function<String, String> func = text -> text.toUpperCase();
        List<String> listLanguage = Arrays.asList("Java", "C#", "Python");
        List<String> newList = map(func, listLanguage);
        newList.forEach(System.out::println);


    }

    @FunctionalInterface
    public interface FloatFunction<R> {
        R apply(float value);
    }

    @FunctionalInterface
    public interface joinString<T, U, R> {
        R apply(T t, U u);

        default <V> java.util.function.BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after) {
            Objects.requireNonNull(after);
            return (T t, U u) -> after.apply(apply(t, u));
        }
    }

    @FunctionalInterface
    public interface lengthString<T, R> {
        R apply(T t);
    }

    public static <T, R> List<R> map(Function<T, R> mapper, List<T> list) {
        List<R> rs = new ArrayList<R>();
        for (T t: list) {
            R r = mapper.apply(t);
            rs.add(r);
        }
        return rs;
    }
}