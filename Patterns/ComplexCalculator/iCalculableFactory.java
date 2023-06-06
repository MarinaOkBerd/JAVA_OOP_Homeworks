package Patterns.ComplexCalculator;
// Интерфейс для создания объекта Calculable
public interface iCalculableFactory {
    iCalculable create(ComplexNumber primaryArg);
}
