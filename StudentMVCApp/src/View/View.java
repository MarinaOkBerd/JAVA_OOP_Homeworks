package View;

import java.util.List;
import java.util.Scanner;

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
    // получаем данные с консоли
    public String prompt(String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    @Override
    public Long deleteStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
    }
}
