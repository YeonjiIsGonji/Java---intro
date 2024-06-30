package cond;

import java.util.Scanner;

public class DistanceEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("distance:");
        int distance = input.nextInt();
        if (distance <= 1) {
            System.out.println("도보를 이용하세요.");
        } else if (distance <= 10) {
            System.out.println("자전거를 이용하세요.");
        } else if (distance <= 100) {
            System.out.println("자동차를 이용하세요.");
        } else {
            System.out.println("비행기를 이용하세요.");
        }
    }
}
