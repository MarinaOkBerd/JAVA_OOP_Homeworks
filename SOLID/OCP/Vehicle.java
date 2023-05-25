package SOLID.OCP;

//Класс для транспортного средства
public class Vehicle {
    int maxSpeed;
    String type;

    // конструктор для транспортного средства
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    // получаем максимальную скорость ТС
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    // получаем тип ТС
    public String getType() {
        return this.type;
    }
}