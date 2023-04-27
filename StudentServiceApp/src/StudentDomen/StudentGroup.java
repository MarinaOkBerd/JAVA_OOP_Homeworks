package StudentDomen;

import java.util.Iterator;
import java.util.List;


public class StudentGroup  implements Iterable<Student>, Comparable<StudentGroup>{
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public StudentGroup(List<Student> students) {
        this.students = students;
    }
    //переопределяем итератор
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

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
