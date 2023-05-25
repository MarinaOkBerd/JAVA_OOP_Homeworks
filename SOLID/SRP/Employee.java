package SOLID.SRP;

import java.sql.Date;
//Класс для сотрудника
public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    // конструктор для сотрудника
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }
    // получаем информацию о сотруднике
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
        }
    // получаем окончательную зарплату
    public int getNetSalary(){
        return SalaryService.calculateNetSalary(baseSalary);
    }    
}    