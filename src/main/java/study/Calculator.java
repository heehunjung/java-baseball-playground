package study;

import java.util.Scanner;

public class Calculator {

    public static int calculator(String line) {
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
    public static int calculate(int a, int b, String op) {
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

}
