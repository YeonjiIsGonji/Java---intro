package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        int intvalue = integer1;
        System.out.println("intvalue = " + intvalue);

        Integer integer2 = intvalue;
        System.out.println("integer2 = " + integer2);


    }
}
