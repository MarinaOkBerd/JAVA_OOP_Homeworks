package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;
// Класс для взаимодействия с группами
public class StudentGroupService {
    // список групп
    private List<StudentGroup> groups;
    // конструктор для групп
    public StudentGroupService() {
        this.groups = new ArrayList<>();
    }
    // получаем всех студентов
    public List<StudentGroup> getAll(){
        return this.groups;
    }

    public List<Student> getSortedByFIOStudentGroup(int numberGroup){
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
