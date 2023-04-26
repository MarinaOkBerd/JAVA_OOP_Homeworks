package StudentDomen;

import java.util.List;

public class StudentGroup {
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
    
}
