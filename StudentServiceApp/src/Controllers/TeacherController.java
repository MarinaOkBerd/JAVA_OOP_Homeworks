package Controllers;

import StudentDomen.Student;

import StudentService.StudentService;

public class TeacherController implements iUserController<Student>{

    private final StudentService dataService = new StudentService();
    
    @Override
    public void create(String firstName, String lastName, int age) {
        dataService.create(firstName, lastName, age);
    }
    
}