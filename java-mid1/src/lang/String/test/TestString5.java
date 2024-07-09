package lang.String.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        //String filename = str.substring(str.indexOf("hello"),str.indexOf(".txt"));
        //String extName = str.substring(str.indexOf(".txt"));

        int extIndex = str.indexOf(ext);
        String filename = str.substring(0,extIndex);
        String extName = str.substring(extIndex);

        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
