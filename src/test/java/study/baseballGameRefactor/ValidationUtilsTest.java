package study.baseballGameRefactor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static study.baseballGameRefactor.ValidationUtils.validNo;

public class ValidationUtilsTest {
    /*  1. Test할 때 경계 값 테스는 하는게 좋음
        2. Test코드도 최대한 짧게 유지        */
    @Test
    @DisplayName("야구_숫자_1_9_검증")
    void 야구_숫자_1_9_검증() {
        assertThat(validNo(9)).isTrue();
        assertThat(validNo(1)).isTrue();
        assertThat(validNo(10)).isFalse();
        assertThat(validNo(0)).isFalse();
    }

}
