package task12.comparators;

import task12.Book;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {

    private final Comparator<Book> comparator;

    public AuthorTitleComparator() {
        this.comparator = new task12.comparators.AuthorComparator().thenComparing(new TitleComparator());
    }

    @Override
    public int compare(Book book1, Book book2) {
        return comparator.compare(book1, book2);
    }
}
