package study.baseballGame;

import java.util.ArrayList;

public class Ball {
    private final int number;
    private final int location;

    public Ball(int number, int location) {
        this.number = number;
        this.location = location;
    }
    //given 좀 이상한디..
    public BallStatus play(ArrayList<Integer> given) {
        if (given.get(this.location-1) ==  this.number)
            return BallStatus.STRIKE;
        if (given.contains(this.number))
            return BallStatus.BALL;
        return BallStatus.NOTHING;
    }
}
