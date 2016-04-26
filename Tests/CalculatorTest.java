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
}
