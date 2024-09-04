package study.baseballGame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {
    @DisplayName("볼_스트라이크_검증")
    @Test
    void playTest() {
        Ball ball =  new Ball(4,1);
        ArrayList<Integer> given = new ArrayList<>(Arrays.asList(4, 1, 3));
        ArrayList<Integer> given1 = new ArrayList<>(Arrays.asList(2, 3, 4));
        ArrayList<Integer> given2 = new ArrayList<>(Arrays.asList(3, 9, 5));

        assertThat(ball.play(given)).isEqualTo(BallStatus.STRIKE);
        assertThat(ball.play(given1)).isEqualTo(BallStatus.BALL);
        assertThat(ball.play(given2)).isEqualTo(BallStatus.NOTHING);

    }
}
