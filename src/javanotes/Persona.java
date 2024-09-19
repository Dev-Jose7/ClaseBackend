package javanotes;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){ //Constructor
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){ //get
        return this.nombre;
    }

    public int getEdad(){ //get
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public static void main(String[] args) {
        Persona persona = new Persona("José", 23);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
