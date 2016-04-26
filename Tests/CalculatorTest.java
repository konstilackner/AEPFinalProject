import org.junit.Test;

import static junit.framework.Assert.assertTrue;
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

    @Test
    public void DivideANumberByItsValueIsOne(){
        Calculator ten = new Calculator(10.0);
        assertEquals(1.0, ten.divide(ten.amount));
    }

    @Test
    public void DivideFourtyByFourIs10(){
        Calculator fourty = new Calculator(40.0);
        assertEquals(10.0, fourty.divide(4.0));
    }

    @Test
    public void SqrtOfFourIsTwo(){
        Calculator four = new Calculator(4.0);
        assertEquals(2.0, four.sqrt());
    }

    @Test
    public void SqrtOfNegativeOneIsNaN(){
        Calculator minusone = new Calculator(-1.0);
        assertTrue(Double.isNaN(minusone.sqrt()));
    }

    @Test
    public void SquareTwoIsFour(){
        Calculator two = new Calculator(2.0);
        assertEquals(4.0, two.square());
    }

    @Test
    public void Square10IsHundred(){
        Calculator ten = new Calculator(10.0);
        assertEquals(100.0, ten.square());
    }

    @Test
    public void Log1isZero(){
        Calculator one = new Calculator(1.0);
        assertEquals(0.0, one.log());
    }

    @Test
    public void Divide10ByTwoIs5(){
        Calculator ten = new Calculator(10.0);
        assertEquals(5.0, ten.divide(2));
    }

    @Test
    public void OneByOneIsOne(){
        Calculator one = new Calculator(1.0);
        assertEquals(1.0, one.multiply(1.0));
    }
}
