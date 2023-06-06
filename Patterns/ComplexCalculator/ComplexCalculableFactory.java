package Patterns.ComplexCalculator;
// Класс Фабрика для класса Calculable с использование интерфейса CalculableFactory
public class ComplexCalculableFactory implements iCalculableFactory {
    // создаем объект 
    @Override
    public iCalculable create(ComplexNumber primaryArg) {
        return new ComplexCalculator(primaryArg);
    }
}