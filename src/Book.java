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

    public void printInfo() {
        System.out.println("Книга: " + getName() + ", Автор: " + getAutor().getFirstName() + " " + getAutor().getLastName() + ", год издания: " + getDatePublication());
    }

}
