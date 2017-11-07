package ObjectLife;

public class Book {

    private String title;
    public Book(String title){
        this.title = "Book E";
    }
    @Override
    public String toString(){
        return title;
    }
}
