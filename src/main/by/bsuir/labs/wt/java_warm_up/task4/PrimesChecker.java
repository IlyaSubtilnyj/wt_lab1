package by.bsuir.labs.wt.java_warm_up.task4;

import java.util.stream.IntStream;

public class PrimesChecker {

    public int[] findPrimeNumberIndexes(int[] arr) {
        return IntStream.of(arr)
                .filter(PrimesChecker::isPrime)
                .toArray();
    }

    private static boolean isPrime(int num) {
        if (num <= 1 || (num > 2 && num % 2 == 0)) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
