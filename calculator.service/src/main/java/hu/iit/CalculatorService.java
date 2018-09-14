package hu.iit;

public interface CalculatorService {


    public double addition(double number1,double number2);

    public double substraction(double number1,double number2);

    public double multiplication(double number1,double number2);

    public double division(double number1,double number2)throws IllegalArgumentException;


}
