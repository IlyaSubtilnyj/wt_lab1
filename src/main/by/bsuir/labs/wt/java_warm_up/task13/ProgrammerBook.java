package by.bsuir.labs.wt.java_warm_up.task13;

import by.bsuir.labs.wt.java_warm_up.task12.Book;
import java.util.Objects;

public class ProgrammerBook extends Book {
    private final String language;
    private final int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = result * 43 + (Objects.nonNull(language) ? language.hashCode() : 0);
        result = result * 43 + level;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        ProgrammerBook other = (ProgrammerBook) obj;
        return Objects.equals(this.language, other.language)
                && Objects.equals(this.level, other.level);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n"
                + "title: " + getTitle() + "\n"
                + "author: " + getAuthor() + "\n"
                + "price: " + getPrice() + "\n"
                + "language: " + this.language + "\n"
                + "level: " + this.level + "\n"
                + "}";
    }
}
