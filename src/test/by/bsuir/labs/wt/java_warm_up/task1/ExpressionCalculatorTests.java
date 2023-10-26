package by.bsuir.labs.wt.java_warm_up.task1;

import org.junit.Assert;
import org.junit.Test;


public class ExpressionCalculatorTests {

    private static final double DELTA = 0.001d;

    @Test
    public void calculateTest1() {
        double actual = ExpressionCalculator.calculate(10000, 130134);
        double expected = 10000.000101367874;
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void calculateTest2() {
        double actual = ExpressionCalculator.calculate(-1324.13414, 134134.134);
        double expected = -1324.1329756269083;
        Assert.assertEquals(expected, actual, DELTA);
    }

}
