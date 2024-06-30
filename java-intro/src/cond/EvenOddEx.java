package cond;

import java.util.Scanner;

public class EvenOddEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x:");
        int x = input.nextInt();
        String evenOdd = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + evenOdd);
    }
}
