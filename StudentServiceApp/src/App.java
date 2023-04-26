import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.Teacher;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        User user1 = new User("Ivan", "Ivanov", 20);
        Student s1 = new Student("Petr","Petrov", 21, 123456);
        Student s2 = new Student("Oleg","Ozerov", 21, 121212);
        Student s3 = new Student("Anton","Antonov", 23, 343434);
        Student s4 = new Student("Sergei","Sergeev", 24, 666777);
        Student s5 = new Student("Andrei","Andreev", 25, 999888);
        Teacher t1 = new Teacher("Fedor", "Fedorov", 40, 789456, "Doctor");

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        StudentGroup group = new StudentGroup(listStud);
        System.out.println("!!!!!!!!!!!!");
        Collections.sort(group.getStudents());

        for(Student student : group){
            System.out.println(student);
        }

        System.out.println(user1);
        System.out.println(s1);
        System.out.println(t1);
    }
}
