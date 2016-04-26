import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Konstantin on 25.04.16.
 */
public class CalculatorTest {

    @Test
    public void AddZeroToZeroEqualsZero(){
        Calculator zero = new Calculator(0.0);
        assertEquals(0.0, zero.add(0.0));
    }

    @Test
    public void AddFiveToTenIsFifteen(){
        Calculator five = new Calculator(5.0);
        assertEquals(15.0, five.add(10.0));
    }

    @Test
    public void MultiplyFivebyTwoIsTen(){
        Calculator five = new Calculator(5.0);
        assertEquals(10.0, five.multiply(2.0));
    }
}
