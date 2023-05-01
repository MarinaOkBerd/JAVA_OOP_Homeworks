package StudentService;

import StudentDomen.User;

public class AverageAge <T extends User> double {
    

    
}
static public <T extends Number> double mean(T[] num){
    double sum = 0.0;
    for (int i = 0; i < num.length; i++) {
        sum = sum + num[i].doubleValue();
    }
    sum = sum / num.length;
    return sum;
}