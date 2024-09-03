import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

//    Scanner sc = new Scanner(System.in);
//    String value = sc.nextLine();
//    String[]  values = value.split(" ");


    private int calculator(String line) {
        String[] inputs = line.split(" ");
        int result = Integer.parseInt(inputs[0]);
        int operand = 0;
        String operator = null;
        for (int i = 1; i < inputs.length; i++) {
            if ( i % 2 != 0) {
                operator = inputs[i];
                continue;
            }
            operand = Integer.parseInt(inputs[i]);
            result = calculate(result, operand, operator);
        }
        return result;
    }

    private int calculate(int a,int b,String op) {
        if (op.equals("+")) {
            return a + b;
        }
        if (op.equals("-")) {
            return a - b;
        }
        if (op.equals("*")) {
            return a * b;
        }
        if (op.equals("/")) {
            return a/b;
        }
        return -9999;
    }
    @DisplayName("계산기 테스트")
    @Test
    void calculatorTest() {
        assertThat(calculator("3 + 2 / 5 * 10")).isEqualTo(10);
    }

    @DisplayName("계산 테스트")
    @ParameterizedTest
    @CsvSource( value={"1:2:+:3","1:2:-:-1","1:2:*:2"},delimiter=':')
    void calculateTest(int a, int b, String input,int result) {
        assertThat(calculate(a,b,input)).isEqualTo(result);
    }
}
