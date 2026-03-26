package Restaurante;


import java.util.ArrayList;

public class Plato {
    private String nombre;
    private double precio;

    public Plato(String nombre){
        this.nombre = nombre;
        this.precio = 0.0;
    }

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;

    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean esCategoria(){
        return precio ==0;
    }
    public boolean esPlato(){
        return precio>0;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
