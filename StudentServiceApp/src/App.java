import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
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

        Student s101 = new Student("Chistina","Aguilera", 31, 555);
        Student s102 = new Student("Britney","Spears", 35, 666);
        Student s103 = new Student("Jennifer","Lopez", 38, 777);

        Student s210 = new Student("Brad","Pitt", 55, 8888);
        Student s220 = new Student("Leonardo","DiCaprio", 45, 3333);
        Student s230 = new Student("George","Clooney", 60, 2222);
        Student s240 = new Student("Jack","Nicholson", 85, 1111);


        Teacher t1 = new Teacher("Fedor", "Fedorov", 40, 789456, "Doctor");

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud.add(s101);
        listStud.add(s102);
        listStud.add(s103);
        List<Student> listStud3 = new ArrayList<Student>();
        listStud.add(s210);
        listStud.add(s220);
        listStud.add(s230);
        listStud.add(s240);

        StudentGroup group = new StudentGroup(listStud);
        StudentGroup group2 = new StudentGroup(listStud2);
        StudentGroup group3 = new StudentGroup(listStud3);

        List<StudentGroup> listSteam = new ArrayList<StudentGroup>();
        listSteam.add(group);
        listSteam.add(group2);
        listSteam.add(group3);
        Collections.sort(group.getStudents());
        Collections.sort(group2.getStudents());
        Collections.sort(group3.getStudents());

        List<StudentGroup> listGroup = new ArrayList<>();
        StudentSteam steam1 = new StudentSteam(listGroup, "All students");
        
        Collections.sort(group.getStudents());
        Collections.sort(group2.getStudents());
        Collections.sort(group3.getStudents());
        System.out.println("!!!!!!!!!!!!");
        Collections.sort(steam1.getGroups());
        for (StudentGroup group_ : steam1){
            Collections.sort(group_.getStudents());
        }
        
        for (StudentGroup group_ : steam1) {
            System.out.println("");
            
            for (Student stud : group_) {
                System.out.println(stud);
            }
        }
        
        //for(Student student : group){
        //    System.out.println(student);
        //}
    
       // System.out.println("***************");

       // for (StudentGroup group_ : steam1){
       //     for (Student stud : group_){
       //         System.out.println(stud);
       //     }
       //}
       // System.out.println("-------------------------");

       
        
        //System.out.println(user1);
        //System.out.println(s1);
        //System.out.println(t1);
    }
}

