package by.bsuir.labs.wt.java_warm_up.task3;

public class TangentOnSegmentCalculator {
    public static double[][] resolveInRange(double a, double b, double h) throws IllegalArgumentException {
        if (a >= b){
            throw new IllegalArgumentException("Left border must be grater than right one");
        }

        int tableSize = (int)((b - a)/h) + 1;
        double[][] resultTable = new double[tableSize][2];
        int i = 0;
        do {
            resultTable[i][0] = a;
            resultTable[i++][1] = Math.tan(a);
            a += h;
        } while (i < tableSize);

        return resultTable;
    }
}
