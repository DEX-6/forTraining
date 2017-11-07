package ArrayVsString;

public class ArrayClass {
    public static void main(String[] args) {
        String [] x = {"A"};
        String [] y = x;
        x[0] = "B";
        System.out.println("x = " + x[0] + "; y = " + y[0]);
        y[0] = "C";
        System.out.println("x = " + x[0] + "; y = " + y[0]);
        x = new String[]{"D"};
        System.out.println("x = " + x[0] + "; y = " + y[0]);

    }
}
