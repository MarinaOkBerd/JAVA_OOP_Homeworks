package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
// Класс взаимодействия для студентов с использованием интерфейса User
public class StudentService implements iUserService<Student>{
    //номер студента 
    private int count;
    // список студентов
    private List<Student> students;
    // конструктор для списка студентов
    public StudentService() {
        this.students = new ArrayList<Student>();
    }
    // получаем всех студентов
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
