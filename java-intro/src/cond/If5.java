package cond;

import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price = input.nextInt();
        int age = input.nextInt();
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }
        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        }
        price -= discount;
        System.out.println("총 할인 금액 : " + discount + "원");
        System.out.println("총 가격 : " + price + "원");
    }
}
