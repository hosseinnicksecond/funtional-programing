package home.train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Department {

    private String name;
    private List<Employee> employeeList;

    public Department(String name){
        this.name=name;
        this.employeeList=new ArrayList<>();
    }
    public void addEmployee(Employee e){
        this.employeeList.add(e);
    }
    public List<Employee> getEmployeeList(){
        return Collections.unmodifiableList(this.employeeList);
    }
}
