package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class ModelHashMap implements iGetModel{
    //список студентов
    private HashMap<Long, Student> students;

    public ModelHashMap(HashMap<Long, Student> students){
        this.students = students;
    }
    // получаем из модели данные (список студентов) 
    public List<Student> getAllStudent(){
        List<Student> listStud = new ArrayList<Student>();
        for (var stud : students.entrySet())
            listStud.add(stud.getValue());
        return listStud;
    }

    
    @Override
    public int deleteStudentID(Long studentID) {
        if (students.containsKey(studentID)){
            students.remove(studentID);
            return 1;
        }
        return -1;
    }
} 
    

