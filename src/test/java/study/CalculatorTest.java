package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static study.Calculator.calculate;
import static study.Calculator.calculator;

public class CalculatorTest {

    @DisplayName("계산기 전체 기능 테스트")
    @Test
    void calculatorTest() {
        assertThat(calculator("3 + 2 / 5 * 10")).isEqualTo(10);  // 클래스 이름 없이 호출
    }

    @DisplayName("개별 계산 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1:2:+:3", "1:2:-:-1", "1:2:*:2"}, delimiter = ':')
    void calculateTest(int a, int b, String input, int result) {
        assertThat(calculate(a, b, input)).isEqualTo(result);
    }
}
