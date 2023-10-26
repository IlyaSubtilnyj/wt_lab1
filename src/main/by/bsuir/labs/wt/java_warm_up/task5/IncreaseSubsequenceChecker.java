package by.bsuir.labs.wt.java_warm_up.task5;

import java.util.Arrays;

public class IncreaseSubsequenceChecker {

    public static int getCountOfElementToRemove(int[] sequence) {
        int[] dp = new int[sequence.length];
        int len = 0;

        for (int j : sequence) {
            int idx = Arrays.binarySearch(dp, 0, len, j);
            if (idx < 0) {
                idx = -(idx + 1);
            }
            dp[idx] = j;
            if (idx == len) {
                len++;
            }
        }

        return sequence.length - len;
    }
}
