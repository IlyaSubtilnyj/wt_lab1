package by.bsuir.labs.wt.java_warm_up.task6;

import org.junit.Assert;
import org.junit.Test;

public class MatrixCreatorTests {

    @Test
    public void create() {
        int[] arr = {1,2,3};
        int[][] actual = MatrixCreator.create(arr);
        int[][] expected = new int[][]{ new int[]{1,2,3}, new int[]{2,3,1}, new int[]{3,1,2}};
        Assert.assertArrayEquals(expected,actual);
    }
}
