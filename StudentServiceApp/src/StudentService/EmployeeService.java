package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Employee;
import StudentDomen.UserComparator;
// Класс для взаимодействия с сотрудниками
public class EmployeeService implements iUserService<Employee>{
    // порядковые номер сотрудника
    private int count;
    //список сотрудников
    private List<Employee> employees;
    //конструктор для списка сотрудников
    public EmployeeService(){
        this.employees = new ArrayList<Employee>();
    }
    // получаем всех сотрудников
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
