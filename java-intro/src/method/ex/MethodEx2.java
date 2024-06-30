package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        message(3);
        message(5);
        message(7);
    }
    public static void message(int N) {
        for (int i = 0; i < N; i++) {
            System.out.println("Hello, world!");
        }
    }
}
