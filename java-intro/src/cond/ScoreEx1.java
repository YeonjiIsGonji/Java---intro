package cond;

import java.util.Scanner;

public class ScoreEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("score: ");
        int score = input.nextInt();
        System.out.println("score: " + score);

        if (score >= 90) {
            System.out.println("학점은 A입니다.");
        } else if (score >= 80) {
            System.out.println("학점은 B입니다.");
        } else if (score >= 70) {
            System.out.println("학점은 C입니다.");
        } else if (score >= 60) {
            System.out.println("학점은 D입니다.");
        } else {
            System.out.println("학점은 F입니다.");
        }
    }
}
