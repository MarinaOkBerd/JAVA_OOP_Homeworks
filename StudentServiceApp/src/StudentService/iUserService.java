package StudentService;

import java.util.List;
// интерфейс для всех сервисов, используется для всех классов, наследуемых от User
public interface iUserService<T> {

    List<T> getAll();
    //создаем любого наследуемого от User
    void create(String firstName, String lastName, int age);
    
}
