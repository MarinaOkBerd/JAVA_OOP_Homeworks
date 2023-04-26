import StudentDomen.Student;
import StudentDomen.Teacher;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        User user1 = new User("Ivan", "Ivanov", 20);
        Student s1 = new Student("Petr","Petrov", 21, 123456);
        Teacher t1 = new Teacher("Fedor", "Fedorov", 40, 789456, "Doctor");
        System.out.println(user1);
        System.out.println(s1);
        System.out.println(t1);
    }
}
