package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        Map<String, Integer> map = new HashMap<>();

        String[] split = text.split(" ");
//        for (String s : split) {
//            if (!map.containsKey(s)) {
//                map.put(s, 1);
//            } else {
//                Integer remove = map.remove(s);
//                remove++;
//                map.put(s, remove);
//            }
//        }

        for (String s : split) {
            Integer count = map.get(s);
            if (count == null) {
                count = 0;
            }
            count++;

            map.put(s, count);
        }
        System.out.println(map);
    }
}
