package SOLID.OCP;
// Класс для автобуса наследуемый от Vehicle
public class Bus extends Vehicle implements iSpeedCalculation{
    // конструктор для автобуса
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
    // получаем допустимую скорость движения
    @Override
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * 0.6;
    }
    
}
