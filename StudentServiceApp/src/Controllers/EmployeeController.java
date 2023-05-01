package Controllers;

import StudentDomen.Employee;
import StudentDomen.User;
import StudentService.EmployeeService;

public class EmployeeController implements iUserController<Employee>{
    private final EmployeeService empSevice = new EmployeeService();

    @Override
    public void create(String firstName, String lastName, int age) {
        empSevice.create(firstName, lastName, age);
    }
    
    static public <T extends Employee> void paySalary(T person){
        System.out.println(((User) person).getLastName()+" зп 10000р ");

    }

    static public <T extends Number> double mean(T[] num){
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i].doubleValue();
        }
        sum = sum / num.length;
        return sum;
    }
}
