package by.bsuir.labs.wt.java_warm_up.task16;

import by.bsuir.labs.wt.java_warm_up.task12.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BookComparatorsTests {
    private final BookTitleComparator titleComparator = new BookTitleComparator();
    private final BookTitleAuthorComparator titleAuthorComparator = new BookTitleAuthorComparator();
    private final BookAuthorTitleComparator authorTitleComparator = new BookAuthorTitleComparator();
    private final BookAuthorTitlePriceComparator authorTitlePriceComparator = new BookAuthorTitlePriceComparator();
    private List<Book> books;
    Book book1 = new Book("A book", "Author 2", 3);
    Book book2 = new Book("B book", "Author 3", 10);
    Book book3 = new Book("C book", "Author 1", 9);

    @Test
    public void titleComparatorTest() {

        books = new ArrayList<>();
        books.add(book3);
        books.add(book2);
        books.add(book1);

        books.sort(titleComparator);

        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        expected.add(book3);

        Assert.assertEquals(expected, books);
    }

    @Test
    public void titleAuthorComparatorTest() {

        books = new ArrayList<>();
        books.add(book2);
        books.add(book3);
        books.add(book1);

        books.sort(titleAuthorComparator);

        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        expected.add(book3);

        Assert.assertEquals(expected, books);
    }

    @Test
    public void authorTitleComparatorTest() {

        books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        books.sort(authorTitleComparator);

        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        expected.add(book1);
        expected.add(book2);


        Assert.assertEquals(expected, books);
    }

    @Test
    public void authorTitlePriceComparatorTest() {

        books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        books.sort(authorTitlePriceComparator);

        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        expected.add(book1);
        expected.add(book2);

        Assert.assertEquals(expected, books);
    }

}
