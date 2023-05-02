package StudentDomen;
// Класс для сотрудников, наследуется от User
public class Employee extends User{
    // персональный номер сотрудника
    private int empID;
    /*
     * конструктор класса для сотрудника
     * @param firstName это имя сотрудника
     * @param lastName это фамилия сотрудника
     * @param age это возраст сотрудника
     * @param empId это персональный номер сотрудника
     */

    public Employee(String firstName, String lastName, int age, int empID) {
        super(firstName, lastName, age);
        this.empID = empID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    // переопределение вывода информации об учителе
    @Override
    public String toString() {
        return "Employee []";
    }
}
