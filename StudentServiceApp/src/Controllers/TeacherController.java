package Controllers;

import StudentDomen.Student;

import StudentService.StudentService;
// Класс для взаимодействия с классом учителей с использованием инерфейса от User
public class TeacherController implements iUserController<Student>{
    
    private final StudentService dataService = new StudentService();
    
    @Override
    public void create(String firstName, String lastName, int age) {
        dataService.create(firstName, lastName, age);
    }
    
}