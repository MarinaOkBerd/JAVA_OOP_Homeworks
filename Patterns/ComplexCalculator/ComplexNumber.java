package Patterns.ComplexCalculator;
// Класс для комплексного числа
public class ComplexNumber {
    //действительная часть числа
    public double real;
    //мнимая часть числа
    public double imaginary;
    //конструктор для комплексного исла
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    // переопределяем вывод 
    @Override
    public String toString(){
        if (this.imaginary == 0){
            return this.imaginary + "";
        }else if (imaginary < 0){
            return this.real + "" + this.imaginary + "i";
        }else {
            return this.real + "+" + this.imaginary + "i";
        }
    }
}
