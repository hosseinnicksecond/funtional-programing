package home.train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> someBingo = Arrays.asList(
                "N40", "N36", "B12", "B6", "G53", "G49", "g69",
                "G60", "G50", "I26", "I17", "I29", "O71"
        );

        someBingo
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);
        System.out.println("******==========********");


        Stream<Employee> employeeStream1 = Stream.of(new Employee("john Doe", 22),
                new Employee("mary public", 36), new Employee("john hill", 33),
                new Employee("mario lopez", 30), new Employee("sara jones", 27));

        Stream<Employee> employeeStream2 = Stream.of(new Employee("toni liz", 21),
                new Employee("mario lopez", 30), new Employee("lissa parrot", 40),
                new Employee("alex farm", 35), new Employee("sara jones", 27));

        System.out.println(Stream.concat(employeeStream1,employeeStream2)
                .distinct()
                .peek(System.out::println)
                .count());

    }
}
