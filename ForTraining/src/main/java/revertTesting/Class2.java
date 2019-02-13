package revertTesting;

public class Class2 {
    public static void main(String[] args) {
        String s = "{123}";
        String subS = s.substring(1, s.length()-1);
        System.out.println(subS);
        System.out.println(s.lastIndexOf(s));
    }
}
