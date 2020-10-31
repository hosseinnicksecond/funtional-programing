package home.train;

import java.util.ArrayList;
import java.util.List;

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

        employees.forEach(employee -> System.out.println(employee.getName()));

        employees.forEach(employee -> {
            if(employee.getAge()>30){
                System.out.println(employee.getName());
                System.out.println(employee.getAge());
            }
        });
    }
}
