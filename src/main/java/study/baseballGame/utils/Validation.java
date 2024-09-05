package study.baseballGame.utils;

import study.baseballGame.BallStatus;

import java.util.ArrayList;

public class Validation {
    public static final int MIN_NO = 0;
    public static final int MAX_NO = 10;

    public static boolean randomValidator(int no) {
        return MIN_NO < no && no < MAX_NO;
    }

    public static boolean resultValidation(ArrayList<BallStatus> results) {
        if (results.isEmpty())
            return false;
        if (results.size() < 3)
            return false;
        return results.stream().allMatch(result -> result == BallStatus.STRIKE);
    }
}
