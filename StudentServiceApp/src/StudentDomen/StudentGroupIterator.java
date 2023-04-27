package StudentDomen;

import java.util.Iterator;
import java.util.List;
/*
 * Класс для итератора для групп студентов
 */
public class StudentGroupIterator implements Iterator<Student>{
    // позиция в списке студентов
    private int counter;
    // список студентов
    private final List<Student> students;
    /*
     * конструктор класса
     */
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }
    //проверяем наличие следующего элемента в списке студентов
    @Override
    public boolean hasNext(){
        return counter < students.size();
    }
    //получаем следующего студента из списка
    @Override
    public Student next(){
        if(!hasNext()){
            return null;
        }
        return students.get(counter ++);
    }
}
