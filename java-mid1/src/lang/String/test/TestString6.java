package lang.String.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count = 0;
        int index = str.indexOf(key);
        while (index >= 0) { //못찾으면 -1 반환
            index = str.indexOf(key, index + 1); // index + 1 = 찾은 index 다음 위치에서부터 탐색
            count++;
        }

        System.out.println("count = " + count);
    }
}
