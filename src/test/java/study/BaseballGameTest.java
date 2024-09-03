package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static study.BaseballGame.RandomNumber;

public class BaseballGameTest {

    @DisplayName("InputView 테스트")
    @Test
    void inputViewTest() {

    }
    @DisplayName("ResultView 테스트")
    @Test
    void resultViewTest() {

    }
    @DisplayName("RandomNumber 테스트")
    @Test
    void randomNumberTest() {
        int first = RandomNumber();
        int second = RandomNumber();
        assertThat(first).isNotEqualTo(second);
    }
}
