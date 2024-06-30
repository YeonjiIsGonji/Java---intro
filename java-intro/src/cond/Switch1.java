package cond;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        int coupon;

        if (grade == 1) {
            coupon = 1000;
            System.out.println("1등급 쿠폰 발급: " + coupon + "원");
        } else if (grade == 2 ) {
            coupon = 2000;
            System.out.println("2등급 쿠폰 발급: " + coupon + "원");
        } else if (grade == 3) {
            coupon = 3000;
            System.out.println("3등급 쿠폰 발급: " + coupon + "원");
        } else {
            coupon = 500;
            System.out.println("쿠폰 발급: " + coupon + "원");
        }
    }
}
