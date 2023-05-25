package SOLID.ISP;
//Класс для куба с использованием интерфейсов Shape, Shape3D
public class Cube implements Shape, Shape3D{
    private int edge;
    // конструктор для куба
    public Cube(int edge){
        this.edge = edge;
    }
    //получаем объем куба
    @Override
    public double volume(){
        return edge * edge * edge;
    }
    //получаем площадь куба
    @Override
    public double area(){
        return 6 * edge * edge;
    }
}
