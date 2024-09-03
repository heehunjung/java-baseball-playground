package study;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
    public static void InputView() {
        System.out.print("숫자를 입력해 주세요 : ");
    }

    public static void ResultView(int[] result) {
        if (result[0]==3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return;
        }
        if (result[1]!=0) {
            System.out.print(result[1]+"볼");
        }
        if (result[0]!=0) {
            System.out.print(result[0]+"스트라이크");
        }
    }

    public static int[] CompareNumber(String random, String userNumber) {
        String[] randoms = random.split("");
        String[] userNumbers = userNumber.split("");

        int sameNumber = 0;
        int exactlySameNumber = 0;
        for (int i = 0; i < randoms.length; i++) {
            exactlySameNumber += CheckExactly(randoms[i], userNumbers[i]);
            sameNumber += CheckSame(randoms[i],userNumber);
        }
        sameNumber -= exactlySameNumber;

        int[] result = new int[2];
        result[0] = exactlySameNumber;
        result[1] = sameNumber;

        return result;
    }

    public static int CheckExactly(String random, String userNumber) {
        if (Objects.equals(random, userNumber)){
            return 1;
        }
        return 0;
    }

    public static int CheckSame(String random, String userNumber) {
        String[] userNumbers = userNumber.split("");
        int sameNumber = 0;
        for (String number : userNumbers) {
            sameNumber += CheckExactly(random, number);
        }
        return sameNumber;
    }


    public static String RandomNumber(Random random) {
        // 100부터 999 사이의 랜덤한 정수를 반환 (3자리 숫자)
        return String.valueOf(random.nextInt(900) + 100);
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String randomNumber = RandomNumber(random);
        while(true) {
            InputView();
            String userChoice = sc.nextLine();

        }
    }
}
