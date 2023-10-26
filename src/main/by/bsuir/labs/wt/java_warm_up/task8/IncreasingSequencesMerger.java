package by.bsuir.labs.wt.java_warm_up.task8;

import java.util.List;
import java.util.ArrayList;
public class IncreasingSequencesMerger {

    public static List<Integer> getInsertionPositions(int[] a, int[] b) {
        List<Integer> positions = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                i++;
            } else {
                positions.add(i + j);
                j++;
            }
        }
        if (j < b.length) {
            for (; j < b.length; j++) {
                positions.add(i + j);
            }
        }

        return positions;
    }
}
