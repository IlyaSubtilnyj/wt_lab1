package by.bsuir.labs.wt.java_warm_up.task14;

import java.util.Objects;
public class Book implements Cloneable{
    private final String title;
    private final String author;
    private final int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
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

    @Override
    public Book clone() {
        try {
            return (Book)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
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

}