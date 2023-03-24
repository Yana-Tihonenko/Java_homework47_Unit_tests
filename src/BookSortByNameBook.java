import java.util.Comparator;

public class BookSortByNameBook implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getNameBook().compareTo(o2.getNameBook()) != 0) {
            return o1.getNameBook().compareTo(o2.getNameBook());
        }
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}

