package Patterns.ComplexCalculator;
//Класс для вывода сообщения с использование интерфейса Loggable
public class ConsoleLogger implements iLoggable{
    // выводим сообщение
    @Override
    public void log(String message) {
        System.out.println("LOG:" + message);
    }
}