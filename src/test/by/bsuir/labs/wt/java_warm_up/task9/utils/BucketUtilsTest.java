package by.bsuir.labs.wt.java_warm_up.task9.utils;

import by.bsuir.labs.wt.java_warm_up.task9.model.BasketBall;
import by.bsuir.labs.wt.java_warm_up.task9.model.Bucket;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Collections;
import java.util.Set;

public class BucketUtilsTest {

    @Test
    public void getBallsByColor() {
        Bucket basket = new Bucket();
        basket
                .add(new BasketBall(2.2, BasketBall.Color.BLUE))
                .add(new BasketBall(2.21, BasketBall.Color.RED))
                .add(new BasketBall(0.5, BasketBall.Color.BLUE))
                .add(new BasketBall(2.21, BasketBall.Color.BLUE));
        BucketUtils basketUtils = new BucketUtils(basket);

        TestCase.assertEquals(Set.of(
                new BasketBall(2.2, BasketBall.Color.BLUE),
                new BasketBall(0.5, BasketBall.Color.BLUE),
                new BasketBall(2.21, BasketBall.Color.BLUE)
        ), basketUtils.getBallsByColor(BasketBall.Color.BLUE));
        TestCase.assertEquals(Set.of(
                new BasketBall(2.21, BasketBall.Color.RED)
        ), basketUtils.getBallsByColor(BasketBall.Color.RED));
        TestCase.assertEquals(Collections.EMPTY_SET, basketUtils.getBallsByColor(BasketBall.Color.GREEN));
    }

    @Test
    public void getAll() {
        Bucket basket = new Bucket();
        basket
                .add(new BasketBall(2.2, BasketBall.Color.BLUE))
                .add(new BasketBall(2.21, BasketBall.Color.RED))
                .add(new BasketBall(0.5, BasketBall.Color.BLUE))
                .add(new BasketBall(2.21, BasketBall.Color.BLUE));
        BucketUtils basketUtils = new BucketUtils(basket);

        TestCase.assertEquals(Set.of(
                new BasketBall(2.2, BasketBall.Color.BLUE),
                new BasketBall(2.21, BasketBall.Color.RED),
                new BasketBall(0.5, BasketBall.Color.BLUE),
                new BasketBall(2.21, BasketBall.Color.BLUE)
        ), basketUtils.getAll());
    }
}
