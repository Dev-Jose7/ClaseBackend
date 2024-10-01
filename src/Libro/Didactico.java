package Libro;

public class Didactico extends Libro{
    private String tema;
    public Didactico(String titulo, String anio, String genero, String autor, String tema){
        super(titulo, anio, genero, autor);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema){
        this.tema = tema;
    }
}
