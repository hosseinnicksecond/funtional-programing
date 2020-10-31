package home.train;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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

        Random r= new Random();
        Supplier<Integer> randomSupplier=()->r.nextInt(100);
        for(int i=0;i<10;i++){
            System.out.println(randomSupplier.get());
        }

    }

}
