package by.bsuir.labs.wt.java_warm_up.task16;

import by.bsuir.labs.wt.java_warm_up.task12.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
