import example.demo.model.Student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static List<Person> getPerson() {
        return List.of(
                new Person("tuan", 20 ,Gender.MALE),
                new Person("hello", 21 ,Gender.MALE),
                new Person("halland", 22 ,Gender.FEMALE),
                new Person("james", 23 ,Gender.FEMALE),
                new Person("messi", 24 ,Gender.MALE),
                new Person("ronaldo", 126 ,Gender.FEMALE)
        );
    }
    public static void main(String[] args) {
        List<Person> studentAddress = new ArrayList<>();
        List<Person> persons = getPerson();
//        for (Student student :students) {
//            if (student.getAddress().equals("bac ninh")) {
//                studentAddress.add(student);
//            }
//        }
//        studentAddress.forEach(System.out::println);
        // filter
//        students.stream().filter(student -> student.getAddress().equals("bac ninh"))
//                .collect(Collectors.toList()).forEach(x -> System.out.println(x));

        //sort
//        students.stream().sorted((o1, o2) -> o1.getAddress().compareTo(o2.getAddress())).forEach(x-> System.out.println(x));

        // sort reversed
//        students.stream().sorted(Comparator.comparing(Student::getAddress).reversed()).forEach(x -> System.out.println(x));
        // allMatch
//        boolean math = students.stream().allMatch(x -> x.getAge() > 8);
        //anyMath
//        boolean math = students.stream().anyMatch(x -> x.getAge() > 8);
        //noneMath
//        boolean math = students.stream().noneMatch(x -> x.getAddress().equals("lalala")); // -> true
//        System.out.println(math);

        //max
//        persons.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

//        group by
        Map<Gender, List<Person>> groupByGender = persons.stream().collect(Collectors.groupingBy(Person::getGender));
        System.out.println(groupByGender);
        groupByGender.forEach((gender, people) -> {
            System.out.println(gender);
            people.forEach(System.out::println);
            System.out.println();
        });

//        chain
//        Optional<String> oldestFemaleAge = persons.stream()
//                .filter(person -> person.getGender().equals(Gender.FEMALE))
//                .max(Comparator.comparing(Person::getAge))
//                .map(Person::getName);
//        oldestFemaleAge.ifPresent(System.out::println)
//
//
//        generate stream
//        Stream<String> streamGenerated =
//                Stream.generate(() -> "element").limit(10);
//        streamGenerated.forEach(x-> System.out.println(x));

        // stream to map
        List<String> list = Arrays.asList("Java", "C++", "C#", "PHP");
//        Map<String, Integer> result = list.stream().collect(Collectors.toMap(Function.identity(), String::length));
//        result.forEach((s, integer) -> {
//            System.out.println(s);
//            System.out.println(integer);
//        });

        // IntSummaryStatistics{count=4, sum=12, min=2, average=3.000000, max=4}
//        IntSummaryStatistics rs = list.stream().collect(Collectors.summarizingInt(String::length));
//        System.out.println(rs);
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "tuan");
        hashMap.put(2, "tuan");
        hashMap.put(3, "tuan");
        hashMap.put(4, "tuan");
        hashMap.put(5, "tuan");
        hashMap.forEach((integer, s) -> {
            System.out.println(s);
            System.out.println(integer);
        });
    }

}
