package Model;

import java.util.HashMap;

import Controller.iGetModel;

public class ModelHashMap implements iGetModel{
    //список студентов
    private HashMap<Long, Student> students;

    public ModelHashMap(HashMap<Long, Student> students){
        this.students = students;
    }
    // получаем из модели данные (список студентов) 
    public List<Student> getAllStudent(){
        return students;
    }
} 
    

