package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> number = new HashSet<>(Arrays.asList(inputArr));
        for (Integer integer : number) {
            System.out.println(integer);
        }
    }
}
