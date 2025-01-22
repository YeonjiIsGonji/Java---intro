package collection.link;

public class MyLinkedListV3Main {

    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println("string = " + string);

        MyLinkedListV3<Integer> inList = new MyLinkedListV3<>();
        inList.add(1);
        inList.add(2);
        inList.add(3);
        Integer integer = inList.get(0);
        System.out.println("integer = " + integer);
    }
}
