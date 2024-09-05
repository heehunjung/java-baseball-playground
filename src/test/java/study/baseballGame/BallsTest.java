package study.baseballGame;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    @DisplayName("공_여러개_볼_스트라이크_테스트")
    @Test
    void playTest() {
        ArrayList<Integer> userInput = new ArrayList<>(Arrays.asList(4, 1, 3)); // 랜덤 값
        ArrayList<Integer> randomInput = new ArrayList<>(Arrays.asList(2, 5, 3)); // 랜덤 값
        ArrayList<Integer> randomInput2 = new ArrayList<>(Arrays.asList(4, 1, 3)); // 랜덤 값
        Balls balls = new Balls(userInput);
        assertThat(balls.play(randomInput)).isEqualTo(Arrays.asList(BallStatus.STRIKE));
        assertThat(balls.play(randomInput2)).isEqualTo(Arrays.asList(BallStatus.STRIKE,BallStatus.STRIKE,BallStatus.STRIKE));

    }
}
