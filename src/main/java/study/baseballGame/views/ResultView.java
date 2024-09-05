package study.baseballGame.views;

import study.baseballGame.BallStatus;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ResultView {


    public static final String resultWord = "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
            "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void print() {
        System.out.println(resultWord);
    }

    public static void print(ArrayList<BallStatus> results) {
        AtomicInteger ballNum = new AtomicInteger();
        AtomicInteger strikeNum = new AtomicInteger();

        results.stream().forEach(result -> {
            if (result == BallStatus.STRIKE) {
                strikeNum.getAndIncrement();
            } else if (result == BallStatus.BALL) {
                ballNum.getAndIncrement();
            }
        });
        int ball = ballNum.get();
        int strike = strikeNum.get();
        if (ball==0 &&strike==0) {
            System.out.print("나띵");
            return;
        }
        if (ball!=0) {
            System.out.print(ball+"볼");
        }
        if (strike!=0) {
            System.out.print(strike+"스트라이크");
        }

    }

    public static int input(Scanner sc) {
        return sc.nextInt();
    }
}
