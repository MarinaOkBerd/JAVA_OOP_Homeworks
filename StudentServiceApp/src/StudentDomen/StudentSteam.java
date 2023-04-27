package StudentDomen;

import java.util.Iterator;
import java.util.List;
/*
 * Класс для потока студентов с использованием
 * интерфейса Iterable
 */

public class StudentSteam implements Iterable<StudentGroup>{
    // список групп студентов
    private List<StudentGroup> groups;
    // название потока
    private String nameSteam;
    /*
     * конструктор класса для потока
     * @ param groups это список групп
     * @ param nameSteam это название потока
     */
    public StudentSteam(List<StudentGroup> groups, String nameSteam) {
        this.groups = groups;
        this.nameSteam = nameSteam;
    }

    public String getNameSteam() {
        return nameSteam;
    }

    public void setNameSteam(String nameSteam) {
        this.nameSteam = nameSteam;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }
    // итератор по списку групп в потоке

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentSteamIterator(groups);
    }
    // переопределяем вывод потока
    @Override
    public String toString() {
        String string = "";
        for (StudentGroup group : groups) {
            for (Student student : group) {
                string = "Steam: " + nameSteam  +  "Student: " + "firstName = " + student.getFirstName()
                +", lastName = " + student.getLastName()
                +", age = " + student.getAge() + ", studentID = " + student.getStudentID();
            }
        }
        return string;
        
    }

    

    




    
}
