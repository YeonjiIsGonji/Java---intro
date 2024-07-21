package nested.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;
    public void process(int paramVar) {
        int localVr = 1;

        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVr = " + localVr);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
