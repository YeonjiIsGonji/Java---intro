package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1; //1
        System.out.println("a = " + a);
        a = a + 1; //2
        System.out.println("a = " + a);

        ++a; //3
        System.out.println("a = " + a);
        ++a; //4
        System.out.println("a = " + a);
    }
}
