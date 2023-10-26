package by.bsuir.labs.wt.java_warm_up.task16;

import by.bsuir.labs.wt.java_warm_up.task12.Book;

import java.util.Comparator;

public class BookAuthorTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getTitle)
                .compare(book1,book2);
    }
}
