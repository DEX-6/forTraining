package ArrayVsString;

public class StringClass {
    public static void main(String[] args) {
        String x = "A";
        String y = x;
        x = "B";
        System.out.println("x = " + x + "; y = " + y);
        y = "C";
        System.out.println("x = " + x + "; y = " + y);

    }
}
