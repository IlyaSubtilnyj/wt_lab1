package by.bsuir.labs.wt.java_warm_up.task7;

import org.junit.Assert;
import org.junit.Test;

public class SpecialArraySorterTests {

    @Test
    public void sort() {
        int[] arr = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        SpecialArraySorter.sort(arr);
        Assert.assertArrayEquals(expected, arr);
    }
}
