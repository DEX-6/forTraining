package ObjectLife;

import java.util.HashMap;

public final class ObjectLife extends Book {
    public ObjectLife(String title) {
        super(title);
    }

    public ObjectLife(){
        super("1");
        this.s = "2";
    }

    public static void main(String[] args) {
        HashMap<String, String> zzz = new HashMap<>();
        ZZZ z = new ZZZ(zzz);
//        String title = new String();
//        Book b = new Book("Book A");
//        Book c = new Book("Book B");
//        Book e = new Book(title);
//        System.out.println(e);
//        System.out.println(b);
//        System.out.println(c);
    }
}
