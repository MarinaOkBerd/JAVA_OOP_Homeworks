package StudentDomen;
/*
 * Класс для студентаб наследуется от User 
 * с использованием интерфейса Comparable
 */

public class Student extends User implements Comparable<Student>{
    //персональный номер студента
    private long studentID;
    /*
     * конструктор класса для студента
     * @param firstName это имя студента
     * @param lastName это фамилия студента
     * @param age это возраст студента
     * @param studentID это персональный номер студента
     */
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
    // переопределение вывода информации о студенте
    @Override
    public String toString() {
        return "Student: " + "firstName = " + super.getFirstName()
                +", lastName = " + super.getLastName()
                +", age = " + super.getAge() + ", studentID = " + studentID;
    }

    // сравниваем студентов по персональным номерам и возрасту
    @Override
    public int compareTo(Student o){
        
        //System.out.println(super.getFirstName() + " - " + o.getFirstName());
         if(super.getAge() == o.getAge()){
            if(this.studentID == o.studentID){
                return 0;
            }
            if(this.studentID < o.studentID){
                return -1;
            }
            return 1;
         } 
         if(super.getAge() < o.getAge()){
            return - 1;
         }   
         return 1;
    }

}
