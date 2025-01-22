package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {
        if (cartMap.containsKey(product)) {
            cartMap.put(product, cartMap.get(product) + quantity);
        } else {
            cartMap.put(product, quantity);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cartMap.keySet()) {
            System.out.println(product.toString() + " 수량: " + cartMap.get(product));
        }
    }

    public void minus(Product product, int minusQuantity) {
        Integer quantity = cartMap.getOrDefault(product, 0);
        if (quantity - minusQuantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, quantity - minusQuantity);
        }
    }
}
