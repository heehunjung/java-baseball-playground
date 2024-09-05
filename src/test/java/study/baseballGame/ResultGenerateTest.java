package study.baseballGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ResultGenerateTest {

    @DisplayName("최종_결과_생성_테스트")
    @Test
    void resultGenerateTest() {
        ArrayList<BallStatus> tempResult = new ArrayList<>(Arrays.asList(BallStatus.BALL, BallStatus.STRIKE, BallStatus.STRIKE));
        PlayResult playResult = new PlayResult();
        playResult.generateResult(tempResult);
        assertThat(playResult.getBall()).isEqualTo(1);
        assertThat(playResult.getStrike()).isEqualTo(2);

    }
}
