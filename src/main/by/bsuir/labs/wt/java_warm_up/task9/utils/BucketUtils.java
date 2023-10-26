package by.bsuir.labs.wt.java_warm_up.task9.utils;

import by.bsuir.labs.wt.java_warm_up.task9.model.BasketBall;
import by.bsuir.labs.wt.java_warm_up.task9.model.Bucket;

import java.util.Set;
import java.util.stream.Collectors;

public class BucketUtils {
    private final Bucket bucket;

    public BucketUtils(Bucket bucket) {
        this.bucket = bucket;
    }

    public Set<BasketBall> getBallsByColor(BasketBall.Color color) {
        return bucket
                .getBalls().stream()
                .filter(ball -> color.equals(ball.getColor()))
                .collect(Collectors.toSet());
    }

    public Set<BasketBall> getAll() {
        return bucket.getBalls();
    }
}
