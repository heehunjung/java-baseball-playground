package study.baseballGame;

import java.util.ArrayList;

public class PlayResult {

    private int strike = 0;
    private int ball = 0;
    private int nothing = 0;

    private final static int GAME_OVER = 3;

    // 결과 생성 메서드
    public void generateResult(ArrayList<BallStatus> tempResults) {
        tempResults.forEach(
                this::checkBallStatus // 스트림의 각 요소에 대해 checkBallStatus를 호출
        );
    }

    public boolean isGameOver() {
        return this.strike == GAME_OVER;
    }

    private void checkBallStatus(BallStatus ballStatus) {
        if (ballStatus == BallStatus.STRIKE) {
            this.strike++;
        }
        if (ballStatus == BallStatus.BALL) {
            this.ball++;
        }
        if (ballStatus == BallStatus.NOTHING) {
            this.nothing++;
        }
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public int getNothing() {
        return nothing;
    }

}
