
/*
 * Класс для студентаб наследуется от User 
 * с использованием интерфейса Comparable
 */

public class Student<T, V, S extends Comparable<S>> extends User<T, V> implements Comparable<Student<T, V, S>>{
    //персональный номер студента
    private S studentID;
    /*
     * конструктор класса для студента
     * @param firstName это имя студента
     * @param lastName это фамилия студента
     * @param age это возраст студента
     * @param studentID это персональный номер студента
     */
    public Student(T firstName, T lastName, V age, S studentID) {
        super(firstName, lastName, age);
        this.studentID = studentID;
    }


    public S getStudentID() {
        return studentID;
    }

    public void setStudentID(S studentID) {
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
    public int compareTo(Student<T, V, S> o){
        
        
         return this.studentID.compareTo(o.studentID);
    }

}
