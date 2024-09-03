package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static study.BaseballGame.*;

public class BaseballGameTest {
    @DisplayName("CheckExactly 테스트")
    @Test
    void CheckExactlyTest() {
        assertThat(CheckExactly("1","1")).isEqualTo(1);
        assertThat(CheckExactly("1","2")).isEqualTo(0);
    }

    @DisplayName("CheckSame 테스트")
    @Test
    void CheckSameTest() {
        assertThat(CheckSame("1","123")).isEqualTo(1);
        assertThat(CheckSame("5","155")).isEqualTo(2);
    }
    @DisplayName("CompareNumber 테스트")
    @Test
    void CompareNumberTest() {
        int[] result = CompareNumber("123", "321");
        assertThat(result).containsExactly(1, 2); // 배열의 내용을 직접 비교
    }
    @DisplayName("ResultView 테스트")
    @Test
    void ResultViewTest() {

    }
    @DisplayName("RandomNumber 테스트")
    @Test
    void RandomNumberTest() {
        Random random = new Random();
        String first = RandomNumber(random);
        String second = RandomNumber(random);
        assertThat(first).isNotEqualTo(second);
    }
}
