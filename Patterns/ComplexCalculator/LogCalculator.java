package Patterns.ComplexCalculator;
// Класс для логгирования объекта класса Calculator
//с использованием интерфейсов Calculable, Loggable
public class LogCalculator implements iCalculable{
    //объект класса
    private iCalculable decorated;
    //объект логгера
    private iLoggable logger;
    // конструктор класса
    public LogCalculator(iCalculable decorated, iLoggable logger){
        this.decorated = decorated;
        this.logger = logger;
    }
    // переопределяем сложение
    @Override
    public iCalculable sum(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора" + firstArg + "Начало вызова метода sum с параметром" + arg);
        iCalculable result = decorated.sum(arg);
        logger.log(String.format("Вызов метода sum произошел"));
        return result;
    }
    //переопределяем умножение
    @Override
    public iCalculable multi(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора" + firstArg + "Начало вызова метода multi с параметром" + arg);
        iCalculable result = decorated.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }
    //переопределяем деление
    @Override
    public iCalculable division(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора" + firstArg + "Начало вызова метода division с параметром" + arg);
        iCalculable result = decorated.division(arg);
        logger.log(String.format("Вызова метода division произошел"));
        return result;
    }
    //переопределяем вывод результата
    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = decorated.getResult();
        logger.log("Получение результата " + result);
        return result;
    }
    
}