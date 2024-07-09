package lang.String.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] array = email.split("@");
        String ID = array[0];
        String Domain = array[1];
        System.out.println("ID: " + ID);
        System.out.println("Domain: " + Domain);
    }
}
