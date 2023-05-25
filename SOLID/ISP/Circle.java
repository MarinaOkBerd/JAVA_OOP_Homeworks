package SOLID.ISP;
// Класс для круга с использованием интерфейса Shape
public class Circle implements Shape {
    private double radius;
    // конструктор для круга
    public Circle(double radius) {
        this.radius = radius;
    }
    // получаем площадь круга
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
