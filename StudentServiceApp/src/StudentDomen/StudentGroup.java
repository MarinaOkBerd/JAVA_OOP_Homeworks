package StudentDomen;

import java.util.Iterator;
import java.util.List;

/*
 * Класс для групп студентов с использованием
 * интерфейсов Iterable, Comparable
 */
public class StudentGroup  implements Iterable<Student>, Comparable<StudentGroup>{
    //список студентов
    private List<Student> students;
    // конструктор класса для групп студентов
    //@ param students это список студентов
    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    //итератора по списку студентов
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }
    // сравниваем группы студентов
    @Override
    public int compareTo(StudentGroup o) {
        if (this.students.size() == o.students.size()){
            return 0;
        }
        if (this.students.size() < o.students.size()){
            return 01;
        }
        return 1;
    }
    //переопределяем вывод списка групп
    @Override
    public String toString() {
        String string = "";
        for (Student  student: students) {
            string = "Group: " +  "Student: " + "firstName = " + student.getFirstName()
            +", lastName = " + student.getLastName()
            +", age = " + student.getAge() + ", studentID = " + student.getStudentID();
            
        }
        return string;
    }
    
}
