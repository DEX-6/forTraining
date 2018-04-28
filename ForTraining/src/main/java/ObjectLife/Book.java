package ObjectLife;

public class Book {

    private String title;
    public Book(String title){
        this.title = "Book E";
    }
    String s = "1";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        return s != null ? s.equals(book.s) : book.s == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (s != null ? s.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return title;
    }
}
