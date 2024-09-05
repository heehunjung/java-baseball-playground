package study.baseballGame.views;

import java.util.ArrayList;
import java.util.Scanner;

public class InputView {

    public static final String inputWord = "숫자를 입력해 주세요 : ";
    public static final int BALL_NO = 3;

    public static void print() {
        System.out.print(inputWord);
    }

    public static ArrayList<Integer> input(Scanner sc) {
        ArrayList<Integer> list = new ArrayList<>();

        int number = sc.nextInt();
        String numberStr = Integer.toString(number);
        

        // 각 자리를 배열에 넣기
        for (int i = 0; i < BALL_NO; i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            list.add(digit);
        }

        return list; // 숫자의 각 자리가 담긴 리스트 반환
    }


}
