package SOLID.OCP;
// Класс для автомобиля наследуемый от Vehicle
public class Car extends Vehicle implements iSpeedCalculation{
    // конструктор для автомобиля
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
    // получаем допустимую скорость движения
    @Override
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * 0.8;
    }
    
}
