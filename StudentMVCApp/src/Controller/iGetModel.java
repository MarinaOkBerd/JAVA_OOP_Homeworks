package Controller;

import java.util.List;

import Model.Student;
// получаем список студентов
public interface iGetModel {
    public List<Student> getAllStudent();

    public int deleteStudentID(Long studentID);
    
    
}
