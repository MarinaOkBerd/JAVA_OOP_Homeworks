package Model;

// Базовый класс для пользователя
public class User {
    // имя пользователя
    private String firstName;
    // фамилия пользователя
    private String lastName;
    // возраст пользователя
    private int age;
    /*
     * конструктор для класса пользователя
     * @param firstName это имя пользователя
     * @param lastName это фамилия пользователя
     * @param это возраст пользователя
     */
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // переопределение вывода пользователя
    @Override
    public String toString() {
        return "User: " +
                "firstName = " + firstName + 
                " , lastName = " + lastName +
                " , age = " + age;
    }
}

