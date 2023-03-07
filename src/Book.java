import java.util.Objects;

public class Book {
    private final String name;
    private final Autor autor;
    private int datePublication;

    public Book(String name, Autor autor, int datePublication) {
        this.name = name;
        this.autor = autor;
        this.datePublication = datePublication;
    }

    public void setDatePublication(int datePublication) {
        this.datePublication = datePublication;
    }

    public String getName() {
        return this.name;
    }

    public int getDatePublication() {
        return this.datePublication;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Книга: " + getName() + ", Автор: " + getAutor().getFirstName() + " " + getAutor().getLastName() + ", год издания: " + getDatePublication();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return datePublication == book.datePublication && Objects.equals(name, book.name) && Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, autor, datePublication);
    }
}
