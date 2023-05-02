package Controllers;

import StudentDomen.Student;
import StudentService.StudentGroupService;
import StudentService.StudentService;
// Класс для взаимодействия с классом Student с использованием инерфейса от User
public class StudentController implements iUserController<Student>{
    //данные 
    private final StudentService dataService = new StudentService();
    private final StudentGroupService groupService = new StudentGroupService();

    @Override
    public void create(String firstName, String lastName, int age) {
        dataService.create(firstName, lastName, age);
    }
    
}
