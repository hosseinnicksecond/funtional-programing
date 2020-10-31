package home.train;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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

        Function<Employee,String> getLastName=(Employee e)->{
            return e.getName().substring(e.getName().indexOf(" ")+1);
        };

        Function<Employee, String> getFirstName=(Employee e)->{
            return e.getName().substring(0,e.getName().indexOf(" "));
        };

        Random r= new Random();
        for(Employee e:employees){
            if(r.nextBoolean()){
                getName(getLastName,e);
            }else getName(getFirstName,e);
        }

        Function<Employee ,String> toUpperCase=employee -> employee.getName().toUpperCase();
        Function<String , String> FirstName=name->name.substring(0,name.indexOf(" "));
        Function Chain=toUpperCase.andThen(FirstName);
        System.out.println(Chain.apply(employees.get(2)));


    }

    private static void getName(Function<Employee,String > getPart,Employee employee){
        System.out.println(getPart.apply(employee));
    }

}
