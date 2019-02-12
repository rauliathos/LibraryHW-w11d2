import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private Integer capacity;

    public Library(Integer capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public int stockCount(){
        return stock.size();
    }

    public void addBook(Book book) {
        if (stockCount() < this.capacity) {
            this.stock.add(book);
        }
    }

}