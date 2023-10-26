package by.bsuir.labs.wt.java_warm_up.task4;

import org.junit.Assert;
import org.junit.Test;

public class PrimesCheckerTests {

    @Test
    public void findPrimeNumberIndexes() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] expected = {2, 3, 5, 7, 11};
        PrimesChecker primesChecker = new PrimesChecker();
        int[] actual = primesChecker.findPrimeNumberIndexes(data);
        Assert.assertArrayEquals(expected, actual);
    }
}
