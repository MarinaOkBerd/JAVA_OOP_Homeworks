import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Student<String, Integer, Long> s1 = new Student<String, Integer, Long>("Anna", "Petrova", 25, (long)787878);
        System.out.println(s1);
        Student<String, Integer, Long> s2 = new Student<String, Integer, Long>("Anna", "Petrova", 25, (long)787878);
        Student<String, Integer, Long> s3 = new Student<String, Integer, Long>("Anna", "Petrova", 25, (long)787878);
        List<Student<String, Integer, Long>> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);

        StudentGroup<String, Integer, Long> group = new StudentGroup<String, Integer, Long>(listStud);
        for(Student<String, Integer, Long> stud : group){
            System.out.println(stud);
        }
        Collections.sort(group.getStudents());

    }
}
