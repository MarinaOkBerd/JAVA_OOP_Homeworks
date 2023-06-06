package Patterns.ComplexCalculator;

import java.util.Scanner;

public class ViewCalculator {

    private iCalculableFactory calculableFactory;

    public ViewCalculator(iCalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            ComplexNumber primaryArg = promptComplexNumber("Введите первый аргумент: ");
            iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    calculator = calculator.division(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.println("Результат:" + result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    private ComplexNumber promptComplexNumber(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действительную часть комплексного числа");
        double real = Float.parseFloat(scanner.nextLine());
        System.out.println("Введите мнимую часть комлексного числа");
        double imaginary = Float.parseFloat(scanner.nextLine());
        return new ComplexNumber(real, imaginary);
    }
}
