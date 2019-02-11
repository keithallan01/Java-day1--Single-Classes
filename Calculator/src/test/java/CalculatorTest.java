import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Test
    public void canAdd(){
        calculator = new Calculator(2,3);
        assertEquals(5, calculator.add());
    }

    @Test
    public void canSubtract(){
        calculator = new Calculator(5,3);
        assertEquals(2, calculator.subtract());

    }

    @Test
    public void canMultiply(){
        calculator = new Calculator(5,3);
        assertEquals(15, calculator.multiply());
    }

    @Test
    public void canDivide(){
        calculator = new Calculator(15, 5);
        assertEquals(3, calculator.divide());
    }

}
