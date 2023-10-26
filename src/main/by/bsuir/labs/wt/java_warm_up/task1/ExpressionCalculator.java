package by.bsuir.labs.wt.java_warm_up.task1;

public final class ExpressionCalculator {
    public static double calculate(double x, double y) {
        double divider = 2 + Math.abs(x - 2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2)));
        double dividend = 1 + Math.pow(Math.sin(x + y), 2);
        return dividend / divider + x;
    }

}