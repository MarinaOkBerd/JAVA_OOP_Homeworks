package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Employee;
import StudentDomen.UserComparator;

public class EmployeeService implements iUserService<Employee>{
    private int count;
    private List<Employee> employees;


    public EmployeeService(){
        this.employees = new ArrayList<Employee>();
    }

    public List<Employee> getAll(){
        return employees;
    }

    @Override
    public void create(String firstName, String lastName, int age){
        Employee per = new Employee(firstName, lastName, age, count);
        count ++;
        employees.add(per);
        
    }

    public List<Employee> getSortedByFIOStudentGroup(int numberGroup){
        List<Employee> emps = new ArrayList<>(employees);
        emps.sort(new UserComparator<>());
        return emps;
    }
}
