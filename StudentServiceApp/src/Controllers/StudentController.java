package Controllers;

import StudentDomen.Student;
import StudentService.StudentGroupService;
import StudentService.StudentService;

public class StudentController implements iUserController<Student>{

    private final StudentService dataService = new StudentService();
    private final StudentGroupService groupService = new StudentGroupService();

    @Override
    public void create(String firstName, String lastName, int age) {
        dataService.create(firstName, lastName, age);
    }
    
}
