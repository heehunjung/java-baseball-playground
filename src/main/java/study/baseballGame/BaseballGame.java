package study.baseballGame;

import study.baseballGame.utils.Generate;
import study.baseballGame.utils.Validation;
import study.baseballGame.views.InputView;
import study.baseballGame.views.ResultView;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //랜덤 넘버 생성
        ArrayList<Integer> randomNumbers = Generate.generateNumber(rand);
        System.out.println("randomNumbers = " + randomNumbers);
        while (true) {
            InputView.print();
            ArrayList<Integer> userInput = InputView.input(sc);
            Balls userBall = new Balls(userInput);
            if (!Validation.resultValidation(userBall.play(randomNumbers))){
                ResultView.print(userBall.play(randomNumbers));
                System.out.println();
                continue;
            }
            ResultView.print();
            if (ResultView.input(sc) == 2)
                break;
            randomNumbers = Generate.generateNumber(rand);
            System.out.println("randomNumbers = " + randomNumbers);

        }
    }
}
