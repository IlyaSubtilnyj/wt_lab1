package by.bsuir.labs.wt.java_warm_up.task7;

public class SpecialArraySorter {

    public static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] <= arr[i + 1]) {
                i++;
            } else {
                SpecialArraySorter.swap(arr, i, i + 1);
                if (i > 0) {
                    i--;
                }
            }
        }
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
