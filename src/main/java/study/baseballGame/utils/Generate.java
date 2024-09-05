package study.baseballGame.utils;

import study.baseballGame.BallStatus;

import java.util.ArrayList;
import java.util.Random;

public class Generate {

    public static final int MAX_SIZE = 3;

    public static ArrayList<Integer> generateNumber(Random r) {
        ArrayList<Integer> list = new ArrayList<>();
        while (list.size() < MAX_SIZE) {
            int no = r.nextInt(10);
            insertNo(no,list);
        }
        return list;
    }

    public static void insertNo(int no, ArrayList<Integer> list){
        if(list.isEmpty()){
            list.add(no);
            return;
        }
        if(!list.contains(no) && Validation.randomValidator(no)){
            list.add(no);
        }
    }

}
