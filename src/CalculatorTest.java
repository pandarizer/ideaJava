import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by d.bukanov on 4/13/2017.
 */
public class CalculatorTest {
   /* @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("TESTS STARTED...");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("...TESTS FINISHED");
    }*/

    @org.junit.Test
    public void addition_2Plus5_7Returned() throws Exception {
        Calculator testCalc = new Calculator();
        double res = testCalc.Addition(2, 5);
        assertEquals(res, 7, 0.1);
    }

    @org.junit.Test
    public void mul_3Times7_21Returned() throws Exception {
        Calculator testCalc = new Calculator();
        double res = testCalc.Multiply(3, 7);
        assertEquals(res, 21, 0);
    }

    @org.junit.Test
    public void div_21Times3_7Returned() throws Exception {
        Calculator testCalc = new Calculator();
        double res = testCalc.Division(21, 3);
        assertEquals(res, 7, 0.1);

    }

    @org.junit.Test
    public void sub_5minus2_3Returned() throws Exception {
        Calculator testCalc = new Calculator();
        double res = testCalc.Substarction(5, 2);
        assertEquals(res, 3, 0.1);

    }

}