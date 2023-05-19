package Model;

import java.util.List;

import Controller.iGetModel;

// Класс для получения данных
public class Model implements iGetModel{
    //список студентов
    private List<Student> students;

    public Model(List<Student> students){
        this.students = students;
    }
    // получаем из модели данные (список студентов) 
    public List<Student> getAllStudent(){
        return students;
    }

    public int deleteStudentID(Long id){
        int i = -1;
        for(Student stud : students){
            if (stud.getStudentID() == id){
                i = students.indexOf(stud);
            }
        }
        students.remove(i);
        return i;
    }
        

}

