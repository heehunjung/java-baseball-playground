package study;

import java.util.Random;

public class BaseballGame {
    public static void InputView() {
        System.out.print("숫자를 입력해 주세요 : ");
    }

    public static void ResultView() {

    }

    public static int RandomNumber() {
        Random random = new Random();
        //이 프로그램에서 랜덤 객체 주입하는 부분을 다른 메소드로 분리하는게 나을라나?

        // 100부터 999 사이의 랜덤한 정수를 반환 (3자리 숫자)
        return random.nextInt(900) + 100;
    }
}
