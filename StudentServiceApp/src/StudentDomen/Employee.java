package StudentDomen;

public class Employee extends User{
    private int empID;

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

    @Override
    public String toString() {
        return "Employee []";
    }
}
