import java.util.Objects;

public class Book implements Comparable<Book> {
    String nameBook;
    String author;
    int pageCount;

    public Book(String nameBook, String author, int pageCount) {
        this.nameBook = nameBook;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getNameBook() {
        return nameBook;
    }


    public String getAuthor() {
        return author;
    }


    public int getPageCount() {
        return pageCount;
    }


    @Override
    public int compareTo(Book other) {
        if (author.compareTo(other.author) > 0) {
            return 1;
        }
        if (author.compareTo(other.author) < 0) {
            return -1;
        }
        return nameBook.compareTo(other.nameBook);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author);
    }

    @Override
    public String toString() {
        return String.format("Name book: %s, author: %s, page count: %s", nameBook, author, pageCount);
    }
}

