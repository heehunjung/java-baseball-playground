package study.baseballGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.baseballGame.utils.Validation;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomValidationTest {
    @DisplayName("랜덤_넘버_테스트")
    @Test
    void 랜덤_넘버_테스트(){
        assertThat(Validation.RandomValidator(9)).isTrue();
        assertThat(Validation.RandomValidator(1)).isTrue();
    }
}
