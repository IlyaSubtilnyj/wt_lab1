package by.bsuir.labs.wt.java_warm_up.task3;

import org.junit.Test;
import org.junit.Assert;

public class TangentOnSegmentCalculatorTests {

    @Test
    public void resolveInRange() throws IllegalArgumentException {
        double[][] actual = TangentOnSegmentCalculator.resolveInRange(0, 1.1, 0.5d);
        double[][] expected = {{0.0, 0.0}, {0.5, 0.5463024898437905}, {1.0, 1.5574077246549023}};
        Assert.assertArrayEquals(expected, actual);
    }
}
