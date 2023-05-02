package StudentDomen;
// Класс для учителей, наследуется от User
public class Teacher extends User{
    //персональный номер учителя
    private int teacherId;
    //ученая степень учителя 
    private String academicDegree;
    /*
     * конструктор класса для учителя
     * @param firstName это имя учителя
     * @param lastName это фамилия учителя
     * @param age это возраст учителя
     * @param teacherId это персональный номер учителя
     * @param academicDegree это ученая степень учителя
     */

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
    // переопределение вывода информации об учителе
    @Override
    public String toString() {
        return "Teacher: " + "firstName = " + super.getFirstName()
                +", lastName = " + super.getLastName() +", age = " + super.getAge()+
                ", teacherID = " + teacherId + ", academicDegree = " + academicDegree;
    }

}
