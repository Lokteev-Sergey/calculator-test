package test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void sum() throws InterruptedException {
        int result = calculator.sum(2, 2);
        if (result != 4) {   // if 2 + 2 != 4
            Assertions.fail();
        }
    }

    @Test
    void division() {
        Assertions.assertEquals(2, calculator.division(6, 3));
    }

    @Test
    public void testDivideWillThrowExceptionWhenDivideOnZero() throws ArithmeticException {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.division(6, 0);
        });
    }

    @Test
    void substruction() {
        Assertions.assertEquals(0, calculator.substruction(2, 2));
    }

    @Test
    void multiplication() {
        Assertions.assertEquals(6, calculator.multiplication(2, 3));
    }
}