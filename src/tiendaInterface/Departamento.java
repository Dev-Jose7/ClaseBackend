package tiendaInterface;

import java.util.ArrayList;

public class Departamento {
    private int id;
    private String nombre;
    private Producto producto;
    private static int contadorId;

    static ArrayList<Producto> productoData = new ArrayList<>();

    public Departamento(String nombre){
        this.id = ++contadorId;
        this.nombre = nombre;
    }

    public int getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Producto getProducto(){
        return this.producto;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setProducto(Producto producto){
        this.producto = producto;
    }

    public void addProducto(Producto producto){
        Departamento.productoData.add(producto);
    }

    public void eliminarProducto(int id){
        for (int i = 0; i < Departamento.productoData.size(); i++) {
            if(Departamento.productoData.get(i).getId() == id){
                Departamento.productoData.remove(i);
            }
        }
    }
}
