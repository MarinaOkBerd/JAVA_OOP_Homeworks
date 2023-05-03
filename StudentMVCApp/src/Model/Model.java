package Model;

import java.util.List;

// Класс для получения данных
public class Model {
    //список студентов
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }
    // получаем из модели данные (список студентов) 
    public List<Student> getAllStudent(){
        return students;
    }
}

