package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        double average;

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int N = input.nextInt();

        System.out.println(N + "개의 정수를 입력하세요:");
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = input.nextInt();
            total += numbers[i];
        }

        average = (double) total / numbers.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);


    }
}


