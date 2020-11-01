package home.train;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class Main {

    public static void main(String[] args) {
        Employee hossein = new Employee("hossein fozol", 36);
        Employee hessam = new Employee("hessam khob", 30);
        Employee farhad = new Employee("farhad kachal", 21);
        Employee nooosh = new Employee("noosh topol", 24);
        Employee javad = new Employee("javad aziz", 32);
        Employee gazal = new Employee("gazal abji", 30);

        List<Employee> employees = new ArrayList<>();
        employees.add(hessam);
        employees.add(hossein);
        employees.add(nooosh);
        employees.add(farhad);
        employees.add(javad);
        employees.add(gazal);


        Function<Employee ,String> upperCase=(Employee e)->{
            return e.getName().toUpperCase();
        };

        Function<String,String> getFirstPart=(String name)->{
            return name.substring(0,name.indexOf(" "));
        };

        upperCase.andThen(getFirstPart).apply(employees.get(1));

        BiFunction<String ,Employee,String> concatAge=(String name,Employee employee)->{
            return name.concat(" "+employee.getAge());
        };
        concatAge.andThen(getFirstPart).apply(employees.get(0).getName(),employees.get(0));


        Consumer<String> c1=s -> s.toUpperCase();
        Consumer<String> c2= System.out::println;

        c1.andThen(c2).accept("jojo");



    }

}
