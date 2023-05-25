import java.util.Iterator;
import java.util.List;

/*
 * Класс для групп студентов с использованием
 * интерфейсов Iterable, Comparable
 */
public class StudentGroup<T, V, S extends Comparable<S>>  implements Iterable<Student<T, V, S>>, Comparable<StudentGroup>{
    //список студентов
    private List<Student<T, V, S>> students;
    // конструктор класса для групп студентов
    //@ param students это список студентов
    public StudentGroup(List<Student<T, V, S>> students) {
        this.students = students;
    }

    public List<Student<T, V, S>> getStudents() {
        return students;
    }

    public void setStudents(List<Student<T, V, S>> students) {
        this.students = students;
    }
    
    //итератора по списку студентов
    //@Override
    //public Iterator<Student<T, V, S>> iterator() {
    //    return new StudentGroupIterator(students);
    //}
    // сравниваем группы студентов
    @Override
    public int compareTo(StudentGroup<T, V, S> o) {
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
        for (Student  student : students) {
            string = "Group: " +  "Student: " + "firstName = " + student.getFirstName()
            +", lastName = " + student.getLastName()
            +", age = " + student.getAge() + ", studentID = " + student.getStudentID();
            
        }
        return string;
    }

    @Override
    public int compareTo(StudentGroup o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    @Override
    public Iterator<Student<T, V, S>> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
    
}