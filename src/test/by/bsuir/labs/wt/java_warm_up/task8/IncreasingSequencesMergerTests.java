package by.bsuir.labs.wt.java_warm_up.task8;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class IncreasingSequencesMergerTests {

    @Test
    public void getInsertionPositions() {
        int[] a = {1, 2, 4, 7, 9};
        int[] b = {3, 3, 5, 5, 8};
        List<Integer> expected = Arrays.asList(2, 3, 5, 6, 8);
        List<Integer> actual = IncreasingSequencesMerger.getInsertionPositions(a,b);
        Assert.assertEquals(expected,actual);
    }
}
