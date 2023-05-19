package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

// Класс для вывода данных и студентах
public class ViewEng implements iGetView{
    //выводим на печать данные о студентах
    public void printAllStudent(List<Student> students){
        System.out.println("List of students.");
        for(Student person : students){
            System.out.println(person);
        }
        System.out.println("End of list students.");
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
