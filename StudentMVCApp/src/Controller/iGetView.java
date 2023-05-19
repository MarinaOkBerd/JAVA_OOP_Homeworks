package Controller;

import java.util.List;

import Model.Student;

// интерфейс печати списка студентов и считывания данных с консоли
public interface iGetView {
    void printAllStudent(List<Student> students);
    String prompt(String message);
    Long deleteStudent();
}
