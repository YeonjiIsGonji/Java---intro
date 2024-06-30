package scanner;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요:");
        String foodName = menu.nextLine();

        System.out.print("음식의 가격을 입력해주세요:");
        int foodPrice = menu.nextInt();

        System.out.print("음식의 수량을 입력해주세요:");
        int foodQuantity = menu.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName + " " + foodQuantity +"개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");
    }
}
