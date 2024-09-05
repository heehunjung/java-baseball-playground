package study.baseballGame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.baseballGame.utils.Validation;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ResultValidationTest {

    @DisplayName("볼-스트라이크 판정")
    @Test
    void resultValidationTest() {
        ArrayList<BallStatus> result = new ArrayList<>(Arrays.asList(BallStatus.STRIKE,BallStatus.STRIKE,BallStatus.STRIKE));
        ArrayList<BallStatus> result1 = new ArrayList<>();
        ArrayList<BallStatus> result2 = new ArrayList<>(Arrays.asList(BallStatus.STRIKE));

        assertThat(Validation.resultValidation(result)).isTrue();
        assertThat(Validation.resultValidation(result1)).isFalse();
        assertThat(Validation.resultValidation(result2)).isFalse();
    }
}
