package task12.comparators;

import java.util.Comparator;
import task12.Book;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }

}
