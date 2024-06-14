package oop;

public class ValueDateMain {
    public static void main(String[] args) {
        oop.ValueData valueData = new oop.ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자=" + valueData.value);
    }

    static void add(oop.ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value=" + valueData.value);

    }
}
