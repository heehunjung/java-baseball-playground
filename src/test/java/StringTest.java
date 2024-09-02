import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.assertj.core.api.Assertions.assertThat;

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
}
