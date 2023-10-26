package by.bsuir.labs.wt.java_warm_up.task14;

import org.junit.Assert;
import org.junit.Test;

public class BookTests {

    @Test
    public void cloneTest() {
        Book book = new Book("title","author",5);
        Book clone = book.clone();

        Assert.assertEquals(book.getAuthor(),clone.getAuthor());
        Assert.assertEquals(book.getTitle(), clone.getTitle());
        Assert.assertEquals(book.getPrice(), clone.getPrice());
    }
}
