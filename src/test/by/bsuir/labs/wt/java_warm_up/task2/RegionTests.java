package by.bsuir.labs.wt.java_warm_up.task2;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class RegionTests {

    @Test
    public void containsTest1() {
        Region region = new Region();
        boolean actual = region.contains(BigDecimal.valueOf(4.0000001), BigDecimal.valueOf(5));
        Assert.assertFalse(actual);
    }

    @Test
    public void containsTest2() {
        Region region = new Region();
        boolean actual = region.contains(BigDecimal.valueOf(3.9), BigDecimal.valueOf(5));
        Assert.assertTrue(actual);
    }
}
