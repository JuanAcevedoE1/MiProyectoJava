package biblioteca;

public class Libro {
    private String titulo;
    private Autor autor;
    private String isbn;

    public Libro() {
    }

    public Libro(String titulo, Autor autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro:\n" +
                "  Título: " + titulo + "\n" +
                "  ISBN: " + isbn + "\n" +
                "  Autor:\n" + autor.toString() + "\n";
    }
}
