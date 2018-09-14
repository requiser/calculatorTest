package hu.iit;


public class CalculatorServiceImpl implements CalculatorService{


    public double addition(double number1,double number2){
        System.out.println(number1);
        System.out.println(number2);
        return number1 + number2;
    }

    public double substraction(double number1,double number2){
        return number1 - number2;
    }

    public double multiplication(double number1,double number2){
        return number1 * number2;
    }

    public double division(double number1,double number2)throws IllegalArgumentException{
        if(number2 == 0){
            throw new IllegalArgumentException("You cannot divide by zero.");
        }
        return number1 / number2;
    }


}
