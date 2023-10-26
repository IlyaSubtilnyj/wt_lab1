package by.bsuir.labs.wt.java_warm_up.task9.model;

import java.util.HashSet;
import java.util.Set;

public class Bucket {

    private final Set<BasketBall> balls = new HashSet<>();

    public Bucket add(BasketBall ball) {
        balls.add(ball);
        return this;
    }

    public Bucket remove(BasketBall ball) {
        balls.remove(ball);
        return this;
    }

    public Set<BasketBall> getBalls() {
        return balls;
    }

}
