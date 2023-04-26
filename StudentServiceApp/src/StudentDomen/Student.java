package StudentDomen;

public class Student extends User{
    private long studentID;

    public Student(String firstName, String lastName, int age, long studentID) {
        super(firstName, lastName, age);
        this.studentID = studentID;
    }


    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student: " + "firstName = " + super.getFirstName()
                +", lastName = " + super.getLastName()
                +", age = " + super.getAge() + ", studentID = " + studentID;
    }

}
