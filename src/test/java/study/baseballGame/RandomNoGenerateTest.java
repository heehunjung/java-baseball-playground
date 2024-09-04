package study.baseballGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.baseballGame.utils.Generate;


import java.util.ArrayList;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static study.baseballGame.utils.Generate.insertNo;

public class RandomNoGenerateTest {

    private Random rand;

    @BeforeEach
    void setUp() {
        rand = new Random();
    }

    @DisplayName("숫자_입력")
    @Test
    void insertNoTest() {
        int no = 1;
        ArrayList<Integer> list = new ArrayList<>();
        insertNo(no,list);
        assertThat(list.size()).isNotEqualTo(0);
    }

    @DisplayName("램덤_숫자_생성")
    @Test
    void randomNoGenerateTest() {
        String randomNo = Generate.generateNumber(rand);
        System.out.println("randomNo = " + randomNo);
        String[] splitNo = randomNo.split("");
        assertThat(randomNo.length()).isEqualTo(3);
        assertThat(splitNo[0]).isNotEqualTo(splitNo[1]);
        assertThat(splitNo[1]).isNotEqualTo(splitNo[2]);
        assertThat(splitNo[0]).isNotEqualTo(splitNo[2]);
    }
}
