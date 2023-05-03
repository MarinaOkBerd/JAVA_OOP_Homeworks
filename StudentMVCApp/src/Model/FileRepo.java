package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

//Класс для взаимодействия с данными из файле
public class FileRepo implements iGetModel{
    // имя файла
    private String fileName;
    // список студентов
    private List<Student> students;

    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        // проверяем доступ к файлу
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.flush();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    // заполняем промежуточное хранилище,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
    public void addStudent(Student student){
        this.students.add(student);
    }
    //получем список студентов из файла
    public void readAllStudentsFromFile(){
        //проверяем возможность чтения файла
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line != null){
                String[] param = line.split(" ");
                Student person = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));
                students.add(person);
                line = reader.readLine();
            }
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    // сохраняем список студентов в файл
    public void saveAllStusentsToFile(){
        try(FileWriter fw = new FileWriter(fileName, true)){
            for(Student pers : students){
                fw.write(pers.getFirstName() + " " + pers.getLastName() + " " + 
                pers.getAge() +  " " + pers.getStudentID());
                fw.append("\n");
            }
            fw.flush();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    @Override
    public List<Student> getAllStudent() {
        readAllStudentsFromFile();
        return students;

    }
}
