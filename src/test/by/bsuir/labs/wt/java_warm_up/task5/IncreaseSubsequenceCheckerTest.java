package by.bsuir.labs.wt.java_warm_up.task5;

import org.junit.Assert;
import org.junit.Test;

public class IncreaseSubsequenceCheckerTest {

    @Test
    public void getCountOfElementToRemove() {
        int[] sequence = {5, 2, 8, 6, 3, 6, 9, 7};
        int expected = 4;
        int actual = IncreaseSubsequenceChecker.getCountOfElementToRemove(sequence);
        Assert.assertEquals(expected, actual);
    }
}
