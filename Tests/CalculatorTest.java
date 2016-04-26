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

    @Test
    public void MultiplyTenbyTenIsHundred(){
        Calculator ten = new Calculator(10.0);
        assertEquals(100.0, ten.multiply(10.0));
    }

    @Test
    public void Multiply1by1is1(){
        Calculator one = new Calculator(1.0);
        assertEquals(1.0, one.multiply(1.0));
    }

    @Test
    public void Subtract10from20is10(){
        Calculator twenty = new Calculator(20.0);
        assertEquals(10.0, twenty.subtract(10.0));
    }

    @Test
    public void Subtract100from0IsMinuesHundred(){
        Calculator zero = new Calculator(0.0);
        assertEquals(-100.0, zero.subtract(100.0));
    }
}
