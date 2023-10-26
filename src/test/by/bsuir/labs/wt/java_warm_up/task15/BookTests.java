package by.bsuir.labs.wt.java_warm_up.task15;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookTests {

    @Test
    public void compareToTest(){
        Book book1 = new Book("Title 1", "Author 1", 3, "ISBN 978-1-1-124123-0");
        Book book2 = new Book("Title 2", "Author 2", 10, "ISBN 978-1-3-124355-1");
        Book book3 = new Book("Title 3", "Author 3", 9, "ISBN 978-1-2-934599-2");

        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book3);
        expected.add(book2);

        List<Book> actual = new ArrayList<>();
        actual.add(book1);
        actual.add(book2);
        actual.add(book3);

        Collections.sort(actual);

        Assert.assertEquals(expected, actual);
    }
}
