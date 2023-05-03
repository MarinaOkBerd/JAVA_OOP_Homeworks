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
}

