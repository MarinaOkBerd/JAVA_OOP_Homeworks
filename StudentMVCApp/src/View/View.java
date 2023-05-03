package View;

import java.util.List;

import Controller.iGetView;
import Model.Student;

// Класс для вывода данных и студентах
public class View implements iGetView{
    //выводим на печать данные о студентах
    public void printAllStudent(List<Student> students){
        System.out.println("Вывод списка студентов.");
        for(Student person : students){
            System.out.println(person);
        }
        System.out.println("Конец списка.");
    }
}
