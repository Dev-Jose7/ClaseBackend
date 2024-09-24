package Libro;
import java.util.Date;

public class Libro {
    private String titulo;
    private Date date;
    private String genero;
    private String isbn;
    private String autor;

    private static int contadorISBN = 1000000;

    public Libro(String titulo, String genero, String autor){
        this.titulo = titulo;
        this.date = new Date();
        this.genero = genero;
        this.isbn = "SBN" + contadorISBN++;
        this.autor = autor;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public Date getDate(){
        return this.date;
    }

    public String getGenero(){
        return this.genero;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", date=" + date +
                ", genero='" + genero + '\'' +
                ", isbn=" + isbn +
                ", autor='" + autor + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Libro cuento = new Libro(" A Cold Fury Novel", "Aventura", "T.M. Goeglein");
        Libro cuento2 = new Libro("Cien años de soledad", "Narrativa", "Gabriel Garcia Marquez");

        System.out.println(cuento);
        System.out.println(cuento2);
    }
}
