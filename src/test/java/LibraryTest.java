import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {


    private Library library;
    private Book book;


    @Before
    public void before(){
        library = new Library(3);
        book = new Book("Psychologie consonantiste,", "Stefan Odobleja","psicology");
    }

    @Test
    public void numberOfBooksInTheLibrary(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void canAddBookIfFullCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.stockCount());
    }
}
