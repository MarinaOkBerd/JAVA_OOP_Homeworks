public class User <T, V>{
    // имя пользователя
    private T firstName;
    // фамилия пользователя
    private T lastName;
    // возраст пользователя
    private V age;
    /*
     * конструктор для класса пользователя
     * @param firstName это имя пользователя
     * @param lastName это фамилия пользователя
     * @param это возраст пользователя
     */
    public User(T firstName, T lastName, V age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public T getFirstName() {
        return firstName;
    }

    public void setFirstName(T firstName) {
        this.firstName = firstName;
    }

    public T getLastName() {
        return lastName;
    }

    public void setLastName(T lastName) {
        this.lastName = lastName;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
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