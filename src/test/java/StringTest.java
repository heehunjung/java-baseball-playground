import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class StringTest {

    @Test
    void splitTest1(){
        String actual = "1,2";
        String[] splited = actual.split(",");
        assertThat(splited).contains("1");
    }

    @Test
    void splitTest2(){
        String actual = "1,2";
        String[] splited = actual.split(",");
        assertThat(splited).containsExactly("1","2");
    }

    @Test
    void substringTest1(){
        String actual = "(1,2)";
        String substring = actual.substring(1,4);
        assertThat(substring).isEqualTo("1,2");
    }

    // assertThatThrownBy 2가지 방법
    // Containing
    // Matching
    @DisplayName("OutOfBoundsException")
    @Test
    void charAtTest() {
//        assertThatThrownBy(()->{
//            String actual = "abc";
//            String charAt = actual.charAt(5) + "";
//        }).isInstanceOf(IndexOutOfBoundsException.class)
//                .hasMessageContaining("String index out of range");
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    String actual = "abc";
                    String charAt = actual.charAt(5) + "";
                }).withMessageMatching("String index out of range: 5");
    }
}
