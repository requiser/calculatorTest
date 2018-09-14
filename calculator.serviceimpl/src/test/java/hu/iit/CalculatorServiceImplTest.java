package hu.iit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorServiceImplTest {

    CalculatorService calculatorService;

    @Before
    public void setUp(){
        calculatorService = new CalculatorServiceImpl();

    }

    @Test
    public void addition() {
        double actual = calculatorService.addition(0,1);
        double expected = 1;
        Assert.assertEquals(actual, expected, 0.0000001);
    }

    @Test
    public void substraction() {
        double actual = calculatorService.substraction(1,0);
        double expected = 1;
        Assert.assertEquals(actual, expected, 0.0000001);
    }

    @Test
    public void multiplication() {
        double actual = calculatorService.multiplication(0,1);
        double expected = 0;
        Assert.assertEquals(actual, expected, 0.0000001);
    }

    @Test
    public void division() {
        double actual = calculatorService.division(0,1);
        double expected = 0;
        Assert.assertEquals(actual, expected, 0.0000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divisionByZero(){
        double actual = calculatorService.division(1,0);
    }

}
