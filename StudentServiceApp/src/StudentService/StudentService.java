package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;

public class StudentService implements iUserService<Student>{
    private int count;
    private List<Student> students;
    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    public List<Student> getAll(){
        return students;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Student per = new Student(firstName, lastName, age, count);
        count ++;
        students.add(per);
        
    }

}
