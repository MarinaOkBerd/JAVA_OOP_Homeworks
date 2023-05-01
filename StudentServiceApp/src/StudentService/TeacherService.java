package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;

public class TeacherService implements iUserService<Teacher>{
    private int count;
    private String academicDegree;
    
    private List<Teacher> teachers;
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    public List<Teacher> getAll(){
        return teachers;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Teacher perTeacher = new Teacher(firstName, lastName, age, count, academicDegree);
        count ++;
        teachers.add(perTeacher);
        
    }

    
}