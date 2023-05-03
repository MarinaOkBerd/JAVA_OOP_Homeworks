package Controller;

import java.util.List;

import Model.Student;

// интерфейс печати списка студентов
public interface iGetView {
    void printAllStudent(List<Student> students);
}
