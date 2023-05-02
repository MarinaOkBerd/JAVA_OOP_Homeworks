package StudentDomen;

import java.util.Comparator;
// Обобщенный класс для класса User и наследуемых от него классов

public class UserComparator<T extends User> implements Comparator<T> {
    // сравниваем по имени, затем - по фамилии
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getLastName().compareTo(o2.getLastName());
            return resultOfComparing;
        } else {
            return resultOfComparing;
        }
    }

}
