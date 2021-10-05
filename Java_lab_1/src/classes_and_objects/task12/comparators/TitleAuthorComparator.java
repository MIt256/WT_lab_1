package task12.comparators;

import task12.Book;

import java.util.Comparator;

public class TitleAuthorComparator implements Comparator<Book> {

    private final Comparator<Book> comparator;

    public TitleAuthorComparator() {
        this.comparator = new  task12.comparators.TitleComparator().thenComparing(new  AuthorComparator());
    }

    @Override
    public int compare(Book book1, Book book2) {
        return comparator.compare(book1, book2);
    }
}
