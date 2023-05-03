package View;

import java.util.List;

import Model.Student;

// Класс для вывода данных и студентах
public class View {
    //выводим на печать данные о студентах
    public void printAllStudent(List<Student> students){
        for(Student person : students){
            System.out.println(person);
        }
    }
}
