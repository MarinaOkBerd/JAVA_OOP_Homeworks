import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmployeeController;
import StudentDomen.Employee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teacher;
import StudentDomen.User;
import StudentService.AverageAge;
import StudentService.EmployeeService;
import StudentService.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
        //User user1 = new User("Ivan", "Ivanov", 20);
        Student s1 = new Student("Petr","Petrov", 21, 123456);
        Student s2 = new Student("Oleg","Ozerov", 21, 121212);
        Student s3 = new Student("Anton","Antonov", 23, 343434);
        Student s4 = new Student("Sergei","Sergeev", 24, 666777);
        Student s5 = new Student("Andrei","Andreev", 25, 999888);
        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        AverageAge<Student> averageAgeStud = new AverageAge<>();
        System.out.println(averageAgeStud.getAverageAge(listStud));

        Employee person1 = new Employee("Anna", "Popova", 40, 9996666); 
        Employee person2 = new Employee("Alina", "Svetlova", 30, 1116666); 
        Employee person3 = new Employee("Alisa", "Smirnova", 35, 2226666); 
        Employee person4 = new Employee("Alena", "Kulikova", 28, 3336666);
        List<Employee> listEmp = new ArrayList<Employee>();
        listEmp.add(person1);
        listEmp.add(person2);
        listEmp.add(person3);
        listEmp.add(person4);

        AverageAge<Employee> averageAgeEmp = new AverageAge<>();
        System.out.println(averageAgeEmp.getAverageAge(listEmp));

        Teacher t1 = new Teacher("Fedor", "Fedorov", 40, 789456, "Doctor");
        Teacher t2 = new Teacher("Maksim", "Aleksandrov", 38, 123654, "Doctor");
        List<Teacher> listTeachers = new ArrayList<Teacher>();
        listTeachers.add(t1);
        listTeachers.add(t2);
        AverageAge<Teacher> averageAgeTeachers = new AverageAge<>();
        System.out.println(averageAgeTeachers.getAverageAge(listTeachers));

        
        //Student s101 = new Student("Chistina","Aguilera", 31, 555);
        //Student s102 = new Student("Britney","Spears", 35, 666);
        //Student s103 = new Student("Jennifer","Lopez", 38, 777);

        //Student s210 = new Student("Brad","Pitt", 55, 8888);
        //Student s220 = new Student("Leonardo","DiCaprio", 45, 3333);
        //Student s230 = new Student("George","Clooney", 60, 2222);
        //Student s240 = new Student("Jack","Nicholson", 85, 1111);


        //List<Student> listStud = new ArrayList<Student>();

        //listStud.add(s1);
        //listStud.add(s2);
        //listStud.add(s3);
        //listStud.add(s4);
        //listStud.add(s5);
        //List<Student> sortListStud = listStud.getSortedByFIOStudentGroup();
        //List<Student> listStud2 = new ArrayList<Student>();
        //listStud.add(s101);
        //listStud.add(s102);
        //listStud.add(s103);
        //List<Student> listStud3 = new ArrayList<Student>();
        //listStud.add(s210);
        //listStud.add(s220);
        //listStud.add(s230);
        //listStud.add(s240);

        //StudentGroup group = new StudentGroup(listStud);
        //StudentGroup group2 = new StudentGroup(listStud2);
        //StudentGroup group3 = new StudentGroup(listStud3);

        //List<StudentGroup> listSteam = new ArrayList<StudentGroup>();
        //listSteam.add(group);
        //listSteam.add(group2);
        //listSteam.add(group3);
        
        
        //StudentSteam steam1 = new StudentSteam(listSteam, "All students");
        
        //Collections.sort(steam1.getGroups());
        //Collections.sort(group.getStudents());
        //Collections.sort(group2.getStudents());
        //Collections.sort(group3.getStudents());
        
        
        //for (StudentGroup group_: steam1){
        //    System.out.println("Размер группы: " + group_.getStudents().size());
        //    for(Student person : group_)
        //    {
        //        System.out.println(person);
        //    }
        //}

       
        //EmployeeController contrEmp = new EmployeeController();
        //EmployeeController.paySalary(person1);
        //Integer studentHour[] = {120, 250, 100, 50};
        //System.out. println(EmployeeController.mean(studentHour));
        //Double empSalary[] = {1000.5, 35000.6, 8500.0};
        //System.out. println(EmployeeController.mean(empSalary));



        //System.out.println(steam1);
        
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

