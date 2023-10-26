package by.bsuir.labs.wt.java_warm_up.task2;

import java.math.BigDecimal;

public class Region {

    public boolean contains(BigDecimal x, BigDecimal y) {
        final BigDecimal halfSquareSideSize = BigDecimal.valueOf(4.0d);
        final BigDecimal offsetOfCoordinateSystem = BigDecimal.valueOf(1.0d);
        final BigDecimal absXRangeValue = BigDecimal.valueOf(6.0d);

        boolean result = x.abs().compareTo(absXRangeValue) < 0;

        if (result) {
            BigDecimal offsetAbsY = y.subtract(offsetOfCoordinateSystem).abs();
            BigDecimal absX = x.abs();
            if ((offsetAbsY.compareTo(halfSquareSideSize) > 0) || (absX.compareTo(halfSquareSideSize) > 0))
                result = false;
        }

        return result;
    }
}
