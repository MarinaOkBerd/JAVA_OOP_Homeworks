package Patterns.ComplexCalculator;

public interface iCalculable {

    iCalculable sum(ComplexNumber arg);
    iCalculable multi(ComplexNumber arg);
    iCalculable division(ComplexNumber arg);
    ComplexNumber getResult();
}