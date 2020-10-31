package home.train;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

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


        printEmployeeNameByeAge(employees,"Employee over 30",employee -> employee.getAge()>30);

        printEmployeeNameByeAge(employees, "Employee under 25", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge()<26;
            }
        });
        IntPredicate greaterThan15=i->i>15;
        IntPredicate lessThan100=i->i<100;
//        Predicate<Integer> even=i->(i%2)==0; cant chain that with IntPredicate
        IntPredicate even=i->(i%2)==0;

        System.out.println("***? "+greaterThan15.and(lessThan100).test(50));
        System.out.println("***? "+greaterThan15.and(lessThan100).and(even).test(50));

        Boolean b=lessThan100.or(even).test(51);
        System.out.println(b);

        System.out.println("Test negate ===> "+lessThan100.negate().test(200));
    }

    private static void printEmployeeNameByeAge(List<Employee> employees, String ageText,
                                                Predicate<Employee> ageConditional){

        System.out.println(ageText);
        System.out.println("=====================");
        for(Employee  e:employees){
            if(ageConditional.test(e)){
                System.out.println(e.getName());
            }
        }
    }
}
