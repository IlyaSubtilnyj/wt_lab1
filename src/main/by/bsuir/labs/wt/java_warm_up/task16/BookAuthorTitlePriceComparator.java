package by.bsuir.labs.wt.java_warm_up.task16;

import by.bsuir.labs.wt.java_warm_up.task12.Book;

import java.util.Comparator;

public class BookAuthorTitlePriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getTitle)
                .thenComparing(Book::getPrice)
                .compare(o1,o2);
    }
}
