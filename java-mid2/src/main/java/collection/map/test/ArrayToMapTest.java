package collection.map.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성 - 코드 작성
        Map<String, Integer> map = new HashMap<>();
        for (String[] arr : productArr) {
            map.put(arr[0], Integer.valueOf(arr[1]));
        }

        // Map의 모든 데이터 출력 - 코드 작성
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println("제품: " + key + ", 가격: " + map.get(key));
        }
    }
}
