package by.bsuir.labs.wt.java_warm_up.task9;

import by.bsuir.labs.wt.java_warm_up.task9.model.BasketBall;
import by.bsuir.labs.wt.java_warm_up.task9.model.Bucket;
import by.bsuir.labs.wt.java_warm_up.task9.utils.BucketUtils;

public class Main {
    public static void main(String[] args) {

        Bucket bucket = new Bucket();
        bucket
                .add(new BasketBall(1.2, BasketBall.Color.BLUE))
                .add(new BasketBall(1.45, BasketBall.Color.RED))
                .add(new BasketBall(2.1, BasketBall.Color.GREEN))
                .add(new BasketBall(0.3, BasketBall.Color.BLUE))
                .add(new BasketBall(0.21, BasketBall.Color.BLUE));

        BucketUtils basketUtils = new BucketUtils(bucket);

        int blueCount = basketUtils.getBallsByColor(BasketBall.Color.BLUE).size();
        double totalWeight = basketUtils
                .getAll().stream()
                .map(BasketBall::getWeight)
                .reduce(Double::sum)
                .orElse(0.0);

        System.out.println("Blue balls in a basket: " + blueCount);
        System.out.println("Total basket weight:  " + totalWeight);
    }
}
