package StudentService;

import java.util.List;

import StudentDomen.User;
// Обобщенный класс для получения среднего возраста для наследуемых классов от User

public class AverageAge <T extends User>{
    public <T extends User> double getAverageAge(List<T> users){
        int sumAge = 0;
        for (T user : users) {
            sumAge += user.getAge();
        }
        return sumAge / users.size();
    }
}
