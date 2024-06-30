package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int N = input.nextInt();

        System.out.println(N + "개의 정수를 입력하세요:");
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = input.nextInt();
        }
        int small = numbers[0];
        int large = numbers[0];
        for (int i = 0; i < N; i++) {
            if (small >= numbers[i]) {
                small = numbers[i];
            }
            if (large <= numbers[i]) {
                large = numbers[i];
            }
        }
        System.out.println("가장 작은 정수: " + small);
        System.out.println("가장 큰 정수: " + large);

    }
}


