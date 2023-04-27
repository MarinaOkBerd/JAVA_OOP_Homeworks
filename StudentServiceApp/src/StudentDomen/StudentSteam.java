package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup>{
    private List<StudentGroup> groups;
    private String nameSteam;


    public String getNameSteam() {
        return nameSteam;
    }

    public void setNameSteam(String nameSteam) {
        this.nameSteam = nameSteam;
    }

    public StudentSteam(List<StudentGroup> groups, String nameSteam) {
        this.groups = groups;
        this.nameSteam = nameSteam;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentSteamIterator(groups);
    }
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
