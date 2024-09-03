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

    //한 메소드를 여러 값으로 테스트하고 싶을 때 ParameterizedTest
    @DisplayName("Contain 메소드 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void containsTest(int num) {
        assertTrue(numbers.contains(num));
    }

    
    //ParameterTest의 경우에도 false,true 모두 테스트
    @DisplayName("contain 메소드 테스트 보완")
    @ParameterizedTest
    @CsvSource( value={"1:true","2:true","10:false"},delimiter=':')
    void advancedContainsTest(int num,boolean expected) {
        assertEquals(expected, numbers.contains(num));
    }

    @Test
    void practice() {
        assertThat(1)
                .isIn(numbers);
    }
}