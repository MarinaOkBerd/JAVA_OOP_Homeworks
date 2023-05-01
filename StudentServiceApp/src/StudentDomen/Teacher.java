package StudentDomen;

public class Teacher extends User{
    private int teacherId;
    private String academicDegree;

    public Teacher(String firstName, String lastName, int age, int teacherId, String academicDegree ) {
        super(firstName, lastName, age);
        this.teacherId = teacherId;
        this.academicDegree = academicDegree;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getLevel() {
        return academicDegree;
    }

    public void setLevel(String academicDegree) {
        this.academicDegree = academicDegree;
    }
    @Override
    public String toString() {
        return "Teacher: " + "firstName = " + super.getFirstName()
                +", lastName = " + super.getLastName() +", age = " + super.getAge()+
                ", teacherID = " + teacherId + ", academicDegree = " + academicDegree;
    }

}
