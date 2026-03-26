package Arbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArbolGeneral<E> {
    private Nodo<E> raiz;

    public ArbolGeneral(){
        this.raiz = null;
    }

    public boolean insertar(Nodo<E> padre, Nodo<E> hijo){
        if(padre==null){
            System.out.println("Error");
            return false;
        }
        padre.agregarHijo(hijo);
        System.out.println(hijo.getDato()+"insertado dentro de"+padre.getDato());
        return true;
    }
    public boolean insertarRaiz(Nodo<E> raiz){
        if(this.raiz==null){
            this.raiz= raiz;
            System.out.println("Raiz insertada:"+ raiz.getDato());
            return true;
        }
        System.out.println("Error");
        return false;
    }

    public Nodo<E> buscar(E dato){
        return buscarRecursivo(raiz, dato);

    }

    private Nodo<E> buscarRecursivo(Nodo<E> nodo,E dato){
        if(nodo==null) return null;
        if(nodo.getDato().equals(dato)) return nodo;

        for(Nodo<E>hijo: nodo.getHijos()){
            Nodo<E> encontrado = buscarRecursivo(hijo, dato);
            if(encontrado != null){
                return encontrado;
            }

            }
        return null;
    }
    public void buscarYMostrar(E dato){
        Nodo<E> encontrado= buscar(dato);
        if(encontrado==null){
            System.out.println("No se encontró"+ dato);
        } else{
            System.out.println("Encontrado:"+ encontrado.getDato());

        }
    }


    //Recorrido DFS
    public List<E> recorridoDFS(){
        List<E> resultado = new ArrayList<>();
        if(raiz == null) return resultado;

        Stack<Nodo<E>> pila = new Stack<>();
        pila.push(raiz);

        while(!pila.isEmpty()){
            Nodo<E> actual = pila.pop();
            resultado.add(actual.getDato());

            List<Nodo<E>>hijos = actual.getHijos();
            for(int i = hijos.size()-1;i>=0; i--){
                pila.push(hijos.get(i));
            }
        }
        return resultado;
    }

    public Nodo<E> getRaiz(){
        return raiz;
    }

}
