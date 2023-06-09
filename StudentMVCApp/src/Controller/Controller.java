package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Model;
import Model.Student;
import View.View;

// Класс для хранения данных от Model
public class Controller {
    //копия списка студентов
    private List<Student> students;
    //ссылка для view
    private iGetView view;
    //ссылка для model
    private iGetModel model;
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }
    // получаем из model студентов в контроллер
    public void getAllStudent(){
        students = model.getAllStudent();
    }
    //проверяем наличие в базе данных
    public boolean testData(){
        if(students.size() > 0){
            return true;
        }
        else{
            return false;
        }
    }

    // получаем данные от model, проверяем данные и обновляем view
    public void updateView(){
        //MVP
        getAllStudent();
        if(testData()){
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов отсутствует.");
        }
        //MVC
        // обновляем данные в view
        //view.printAllStudent(model.getAllStudent());

    }
    // получаем команды от пользователя
    public void run(){
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration){
            String command = view.prompt("Введите команду ");
            com = Commands.valueOf(command.toUpperCase());
            switch(com){
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы");
                    break;

                case LIST:
                    getAllStudent();
                    updateView();
                    break;
                
                case DELETE:
                    Long studentID = view.deleteStudent();
                    model.deleteStudentID(studentID);
                    break;
                    
            }
        }
    }

}
