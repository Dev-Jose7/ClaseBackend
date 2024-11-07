package tiendaInterface;

public class Producto {
    private int id;            // Identificador único del producto
    private String nombre;      // Nombre del producto
    private double precio;      // Precio del producto
    private int cantidad;       // Cantidad en stock

    // Constructor para inicializar el producto con sus atributos
    public Producto(int id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Métodos "set" para modificar los atributos del producto
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    // Métodos "get" para obtener los atributos del producto
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
}
