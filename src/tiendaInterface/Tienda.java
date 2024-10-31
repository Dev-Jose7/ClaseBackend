package tiendaInterface;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private Departamento departamento;
    static ArrayList<Departamento> departamentoData = new ArrayList<>();

    public Tienda(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void addDepartamento(Departamento departamento){
        Tienda.departamentoData.add(departamento);
    }
}
