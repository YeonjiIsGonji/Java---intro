package lang.math.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LottoGenerator {
    public static void main(String[] args) {

        List<Integer> randomNum = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            while (true) {
                int num = random.nextInt(45) + 1;
                if (!randomNum.contains(num)) {
                    randomNum.add(num);
                    break;
                }
            }
        }
        System.out.println("로또 번호: ");
        for (Integer integer : randomNum) {
            System.out.print(integer + " ");
        }

    }
}
