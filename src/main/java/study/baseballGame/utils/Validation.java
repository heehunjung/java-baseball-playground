package study.baseballGame.utils;

public class Validation {
    public static final int MIN_NO = 0;
    public static final int MAX_NO = 10;

    public static boolean RandomValidator(int no) {
        return MIN_NO< no && no < MAX_NO;
    }
}
