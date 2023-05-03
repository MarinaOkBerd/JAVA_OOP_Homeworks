import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
import Model.Model;
import Model.Student;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Petr","Petrov", 21, 123456);
        Student s2 = new Student("Oleg","Ozerov", 21, 121212);
        Student s3 = new Student("Anton","Antonov", 23, 343434);
        Student s4 = new Student("Sergei","Sergeev", 24, 666777);
        Student s5 = new Student("Andrei","Andreev", 25, 999888);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        FileRepo fileRepo = new FileRepo("StudentsData.txt");
        //for(Student pers : students){
        //    fileRepo.addStudent(pers);
        //}
        fileRepo.saveAllStusentsToFile();
        iGetModel model = new Model(students);
        iGetModel modelFileRepo = new FileRepo("StudentsData.txt");
        
        iGetView view = new View();
        Controller controller = new Controller(view, model);
        controller.updateView();


        
    }
}
