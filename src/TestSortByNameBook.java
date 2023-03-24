import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestSortByNameBook {

    @Test
    public void sort_only_nameBook() {
        Book book1 = new Book("Azbuka", "Ivanov", 120);
        Book book2 = new Book("History", "Ivanov", 120);
        Book book3 = new Book("Armageddon", "Ivanov", 120);
        ArrayList<Book> except = new ArrayList<>();
        except.add(book3);
        except.add(book1);
        except.add(book2);

        ArrayList<Book> result = new ArrayList<>();
        result.add(book1);
        result.add(book2);
        result.add(book3);
        result.sort(new BookSortByNameBook());
        assertEquals(except, result);
    }

    @Test
    public void sort_nameBook_and_author() {
        Book book1 = new Book("Azbuka", "Ivanov", 120);
        Book book2 = new Book("History", "Petrov", 120);
        Book book3 = new Book("Azbuka", "Sidorov", 120);
        ArrayList<Book> except = new ArrayList<>();
        except.add(book1);
        except.add(book3);
        except.add(book2);

        ArrayList<Book> result = new ArrayList<>();
        result.add(book1);
        result.add(book2);
        result.add(book3);
        result.sort(new BookSortByNameBook());
        assertEquals(except, result);
    }

}
