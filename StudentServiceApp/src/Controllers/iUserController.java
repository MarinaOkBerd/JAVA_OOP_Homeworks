package Controllers;

import StudentDomen.User;
// интерфейс взаимодействия с любым классом, наследуемым от User
public interface iUserController<T extends User> {
    void create(String firstName, String lastName, int age);
}
