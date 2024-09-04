package study.baseballGame.utils;

import java.util.ArrayList;
import java.util.Random;

public class Generate {

    public static String generateNumber(Random r) {
        ArrayList<Integer> list = new ArrayList<>();
        while (list.size() < 3) {
            int no = r.nextInt(10);
            insertNo(no,list);
        }
        // 리스트 값을 하나의 문자열로 변환
        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num);  // 각 숫자를 문자열로 추가
        }

        return sb.toString();  // "123" 형식으로 반환
    }

    public static void insertNo(int no, ArrayList<Integer> list){
        if(list.isEmpty()){
            list.add(no);
            return;
        }
        if(!list.contains(no)){
            list.add(no);
        }
    }
}
