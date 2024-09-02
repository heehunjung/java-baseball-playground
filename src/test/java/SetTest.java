import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현
    @DisplayName("사이즈 테스트")
    @Test
    void sizeTest() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @DisplayName("Contain 메소드 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void containsTest(int num) {
        assertTrue(numbers.contains(num));
    }
    // 이 경우 contains의 결과가 true인 경우에만 테스트 가능함!

    @DisplayName("contain 메소드 테스트 보완")
    @ParameterizedTest
    @CsvSource( value={"1:true","2:true","10:true"},delimiter=':')
    void advancedContainsTest(int num,boolean expected) {
        assertEquals(expected, numbers.contains(num));
    }
}