import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    @Test
    public void runTest() {
        int result = NameCalc.calc(1, 2,
                '+');
        assertEquals(3, result);

    }
 @Test(expected = RuntimeException.class)
    public void runNegativeTest() {
        int result = NameCalc.calc(1, 2,
                '-');

    }

}

    