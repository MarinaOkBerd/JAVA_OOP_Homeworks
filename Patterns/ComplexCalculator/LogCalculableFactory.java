package Patterns.ComplexCalculator;
//Класс LogCalculableFactory для объектов Calculable с логгированием
// с использовнаием интерфейса iCalculableFactory
public class LogCalculableFactory implements iCalculableFactory{
    private iLoggable logger;

    public LogCalculableFactory(iLoggable logger){
        this.logger = logger;
    }
    //создаем новый объект с логгирование
    @Override
    public iCalculable create(ComplexNumber primaryArg) {
        return new LogCalculator(new ComplexCalculator(primaryArg), logger);
    }
}
