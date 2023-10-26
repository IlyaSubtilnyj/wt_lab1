package by.bsuir.labs.wt.java_warm_up.task15;

import java.util.Objects;
public class Book implements Comparable<Book> {
    private final String title;
    private final String author;
    private final int price;
    private static int edition;
    private final String isbn;

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public int hashCode() {
        int result = Objects.nonNull(title) ? title.hashCode() : 0;
        result = result * 43 + (Objects.nonNull(author) ? author.hashCode() : 0);
        result = result * 43 + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        return Objects.equals(this.title, other.title)
                && Objects.equals(this.author, other.author)
                && Objects.equals(this.price, other.price);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n"
                + "title: " + title + "\n"
                + "author: " + author + "\n"
                + "price: " + price + "\n"
                + "}";
    }

    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }
}