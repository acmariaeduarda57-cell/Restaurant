package Arbol;

import java.util.ArrayList;
import java.util.List;

public class Nodo<E> {
    private E dato;
    private List<Nodo<E>> hijos;
    private Nodo<E> padre;

    public Nodo(E dato){
        this.dato = dato;
        this.hijos = new ArrayList<>();
        this.padre = null;
    }

    public E getDato() {

        return dato;
    }

    public void setDato(E dato) {

        this.dato = dato;
    }

    public List<Nodo<E>> getHijos() {
        return hijos;
    }
    public Nodo<E> getPadre(){
        return padre;
    }

    public void setPadre(Nodo<E> padre){
        this.padre = padre;
    }

    public void setHijos(List<Nodo<E>> hijos) {
        this.hijos = hijos;
    }
    public void agregarHijo(E datoHijo){
        hijos.add( new Nodo<>(datoHijo));

    }
    public void agregarHijo(Nodo<E> hijo){
        hijos.add(hijo);
        hijo.setPadre(this);

    }
    public boolean esHoja(){
        return hijos.isEmpty();
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", hijos=" + hijos +
                ", padre=" + padre +
                '}';
    }
}
