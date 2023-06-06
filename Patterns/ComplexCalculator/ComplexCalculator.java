package Patterns.ComplexCalculator;
//Класс для Calculator с использованием интерфейса Calculable
public final class ComplexCalculator implements iCalculable {
    private ComplexNumber primaryArg;
    
    //конструктор для Calculator
    public ComplexCalculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }
    //переопределяем сложение
    @Override
    public iCalculable sum(ComplexNumber arg) {
        primaryArg.real +=  arg.real;
        primaryArg.imaginary += arg.imaginary;
        return this;
    }
    //переопределяем умножение
    @Override
    public iCalculable multi(ComplexNumber arg) {
        ComplexNumber result = new ComplexNumber(0, 0);
        result.real = primaryArg.real * arg.real - primaryArg.imaginary * arg.imaginary;
        result.imaginary = primaryArg.real * arg.imaginary + primaryArg.imaginary * arg.real;
        primaryArg.real = result.real;
        primaryArg.imaginary = result.imaginary;
        return this;
    }
    //переопределяем деление
    @Override
    public iCalculable division(ComplexNumber arg){
        ComplexNumber result = new ComplexNumber(0, 0);
        result.real = (primaryArg.real * arg.real + primaryArg.imaginary * arg.imaginary)
        / (arg.real * arg.real + arg.imaginary * arg.imaginary);
        result.imaginary = (primaryArg.imaginary * arg.real - primaryArg.real * arg.imaginary)
        / (arg.real * arg.real + arg.imaginary * arg.imaginary);
        primaryArg.real = Math.round(result.real * 100.0) / 100.0;
        primaryArg.imaginary = Math.round(result.imaginary * 100.0) / 100.0;
        return this;
    }

    //переопределяем результат
    @Override
    public ComplexNumber getResult(){
        return primaryArg;
    }
    
}