import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
import Model.Model;
import Model.ModelHashMap;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {
        //List<Student> students = new ArrayList<Student>();
        //Student s1 = new Student("Petr","Petrov", 21, 123456);
        //Student s2 = new Student("Oleg","Ozerov", 21, 121212);
        //Student s3 = new Student("Anton","Antonov", 23, 343434);
        //Student s4 = new Student("Sergei","Sergeev", 24, 666777);
        //Student s5 = new Student("Andrei","Andreev", 25, 999888);
        //students.add(s1);
        //students.add(s2);
        //students.add(s3);
        //students.add(s4);
        //students.add(s5);
        //FileRepo fileRepo = new FileRepo("StudentsData.txt");
        //for(Student pers : students){
        //    fileRepo.addStudent(pers);
        //}
        //fileRepo.saveAllStusentsToFile();
        //iGetModel model = new Model(students);
        //iGetModel modelFileRepo = new FileRepo("StudentsData.txt");
        
        //iGetView view = new View();
        //Controller controller = new Controller(view, model);
        //controller.run();
        //iGetView view2 = new ViewEng();
        //Controller controller2 = new Controller(view2, model);
        //controller2.run();
        //controller.updateView();
        iGetModel modelResult = chooseModel();
        iGetView viewResult = chooseLanguege();
        Controller controller = new Controller(viewResult, modelResult);
        controller.run();


    }

    public static iGetView chooseLanguege(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите язык: 1-русский, 2-английский");
        int language = scanner.nextInt();
        if (language == 1){
            return new View();
        }
        else if (language == 2){
            return new ViewEng();
        }
        return null;

    }

    public static iGetModel chooseModel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вариант модели: 1-List, 2-HashMap");
        int model = scanner.nextInt();
        if (model == 1){
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
            return new Model(students);
        }
        else if(model == 2){
            HashMap<Long, Student> students = new HashMap<Long, Student>();
            Student s1 = new Student("Petr","Petrov", 21, (long)123456);
            Student s2 = new Student("Oleg","Ozerov", 21, (long)121212);
            Student s3 = new Student("Anton","Antonov", 23, (long)343434);
            Student s4 = new Student("Sergei","Sergeev", 24, (long)666777);
            Student s5 = new Student("Andrei","Andreev", 25, (long)666777);
            students.put((long)123456, s1);
            students.put((long)121212, s2);
            students.put((long)343434, s3);
            students.put((long)666777, s4);
            students.put((long)666777, s5);
            return new ModelHashMap(students);

        }
        return null;
    }
    

}
