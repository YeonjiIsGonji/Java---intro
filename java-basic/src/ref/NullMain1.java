package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data(); //주소 생성!!
        System.out.println("1. data = " + data);
        data = null; //주소 삭제!!
        System.out.println("1. data = " + data);
    }
}
