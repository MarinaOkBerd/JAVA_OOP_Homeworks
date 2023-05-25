package SOLID.SRP;
//Класс для зарплаты
public class SalaryService {
    private int baseSalary;
    // конструктор зарплаты
    public SalaryService(int baseSalary){
        this.baseSalary = baseSalary;
    }
    // получаем окончательную зарплату
    public static int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}
