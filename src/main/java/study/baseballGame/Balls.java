package study.baseballGame;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Balls {

    private final ArrayList<Ball> balls;

    public Balls(ArrayList<Integer> ballNumbers) {
        balls = mapToBalls(ballNumbers);
    }

    private ArrayList<Ball> mapToBalls(ArrayList<Integer> ballNumbers) {
        final ArrayList<Ball> balls;
        balls = ballNumbers.stream()
                .map(input -> new Ball(input, ballNumbers.indexOf(input)+1))
                .collect(Collectors.toCollection(ArrayList::new));
        return balls;
    }

    public ArrayList<BallStatus> play(ArrayList<Integer> randomInput) {
        return this.balls.stream()
                .map(ball -> ball.play(randomInput))
                .filter(status -> status != BallStatus.NOTHING)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
