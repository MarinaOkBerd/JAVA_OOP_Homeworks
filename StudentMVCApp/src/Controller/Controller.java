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
    private View view;
    //ссылка для model
    private Model model;
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }
    // обновляем данные в view
    public void updateView(){
        view.printAllStudent(model.getAllStudent());
    }

}
