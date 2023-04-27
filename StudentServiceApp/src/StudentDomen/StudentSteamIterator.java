package StudentDomen;

import java.util.Iterator;
import java.util.List;
// Класс для итератора по списку групп в потоке
public class StudentSteamIterator implements Iterator<StudentGroup>{
    // позиция в списке групп
    private int counter;
    // список групп 
    private final List<StudentGroup> groups;
    // конструктор класса
    public StudentSteamIterator(List<StudentGroup> groups) {
        this.groups = groups;
        this.counter = 0;
    }
    //проверяем наличие следующего элемента в списке групп
    @Override
    public boolean hasNext(){
        return counter < groups.size();
    }
    //получаем следующую группу из списка
    @Override
    public StudentGroup next(){
        if(!hasNext()){
            return null;
        }
        return groups.get(counter ++);
    }
    
}
