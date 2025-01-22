package collection.list.test.ex2;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Item> repository = new ArrayList<>();

    public void addItem(Item item) {
        repository.add(item);
    }

    public void displayItems() {
        int sum = 0;
        System.out.println("장바구니 상품 출력");
        for (Item item : repository) {
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : repository) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
