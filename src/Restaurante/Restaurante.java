package Restaurante;

import Arbol.ArbolGeneral;
import Arbol.Nodo;

public class Restaurante {
    public static void main(String[] args){

        System.out.println("   MENÚ DIGITAL - RESTAURANTE SABOR LATINO   ");


        ArbolGeneral<Plato> arbol = new ArbolGeneral<>();

        Plato restaurante = new Plato("Restaurante Sabor Latino");


        // Categorías principales
        Plato entradas = new Plato("Entradas");
        Plato platosFuertes = new Plato("Platos Fuertes");
        Plato postres = new Plato("Postres");
        Plato bebidas = new Plato("Bebidas");

        // Subcategorías de Platos Fuertes
        Plato carnes = new Plato("Carnes");
        Plato pescados = new Plato("Pescados");

        // Subcategorías de Bebidas
        Plato gaseosas = new Plato("Gaseosas");
        Plato jugos = new Plato("Jugos Naturales");
        Plato cervezas = new Plato("Cervezas");

        // Platos de Entradas
        Plato ceviche = new Plato("Ceviche", 18.90);
        Plato papas = new Plato("Papas Fritas", 12.50);
        Plato empanadas = new Plato("Empanadas", 9.90);

        // Platos de Carnes
        Plato lomo = new Plato("Lomo Salteado", 28.90);
        Plato parrillada = new Plato("Parrillada", 35.90);
        Plato ropa = new Plato("Ropa Vieja", 32.50);

        // Platos de Pescados
        Plato trucha = new Plato("Trucha a la Plancha", 24.90);
        Plato sudado = new Plato("Sudado de Pescado", 26.90);

        // Postres
        Plato tresLeches = new Plato("Tres Leches", 12.90);
        Plato flan = new Plato("Flan", 10.90);
        Plato helado = new Plato("Helado Artesanal", 8.90);

        // Gaseosas
        Plato cocaCola = new Plato("Coca Cola", 4.50);
        Plato pepsi = new Plato("Pepsi", 4.50);
        Plato sprite = new Plato("Sprite", 4.50);

        // Jugos
        Plato jugoMaracuya = new Plato("Jugo de Maracuyá", 6.90);
        Plato jugoMango = new Plato("Jugo de Mango", 5.90);
        Plato limonada = new Plato("Limonada Frozen", 7.90);

        // Cervezas
        Plato cristal = new Plato("Cristal", 12.90);
        Plato princesa = new Plato("Princesa", 10.90);

        System.out.println("Menú creado exitosamente");

        // Insertar raíz
        Nodo<Plato> nodoRestaurante = new Nodo<>(restaurante);
        arbol.insertarRaiz(nodoRestaurante);

        // Obtener raíz
        Nodo<Plato> raiz = arbol.getRaiz();


        // Insertar categorías principales
        arbol.insertar(raiz, new Nodo<>(entradas));
        arbol.insertar(raiz, new Nodo<>(platosFuertes));
        arbol.insertar(raiz, new Nodo<>(postres));
        arbol.insertar(raiz, new Nodo<>(bebidas));


        // Insertar subcategorías de Platos Fuertes
        Nodo<Plato> nodoPlatosFuertes = arbol.buscar(platosFuertes);
        arbol.insertar(nodoPlatosFuertes, new Nodo<>(carnes));
        arbol.insertar(nodoPlatosFuertes, new Nodo<>(pescados));

        // Insertar subcategorías de Bebidas
        Nodo<Plato> nodoBebidas = arbol.buscar(bebidas);
        arbol.insertar(nodoBebidas, new Nodo<>(gaseosas));
        arbol.insertar(nodoBebidas, new Nodo<>(jugos));
        arbol.insertar(nodoBebidas, new Nodo<>(cervezas));


        // Insertar platos de Entradas
        Nodo<Plato> nodoEntradas = arbol.buscar(entradas);
        arbol.insertar(nodoEntradas, new Nodo<>(ceviche));
        arbol.insertar(nodoEntradas, new Nodo<>(papas));
        arbol.insertar(nodoEntradas, new Nodo<>(empanadas));

        // Insertar platos de Carnes
        Nodo<Plato> nodoCarnes = arbol.buscar(carnes);
        arbol.insertar(nodoCarnes, new Nodo<>(lomo));
        arbol.insertar(nodoCarnes, new Nodo<>(parrillada));
        arbol.insertar(nodoCarnes, new Nodo<>(ropa));

        // Insertar platos de Pescados
        Nodo<Plato> nodoPescados = arbol.buscar(pescados);
        arbol.insertar(nodoPescados, new Nodo<>(trucha));
        arbol.insertar(nodoPescados, new Nodo<>(sudado));

        // Insertar Postres
        Nodo<Plato> nodoPostres = arbol.buscar(postres);
        arbol.insertar(nodoPostres, new Nodo<>(tresLeches));
        arbol.insertar(nodoPostres, new Nodo<>(flan));
        arbol.insertar(nodoPostres, new Nodo<>(helado));

        // Insertar Gaseosas
        Nodo<Plato> nodoGaseosas = arbol.buscar(gaseosas);
        arbol.insertar(nodoGaseosas, new Nodo<>(cocaCola));
        arbol.insertar(nodoGaseosas, new Nodo<>(pepsi));
        arbol.insertar(nodoGaseosas, new Nodo<>(sprite));

        // Insertar Jugos
        Nodo<Plato> nodoJugos = arbol.buscar(jugos);
        arbol.insertar(nodoJugos, new Nodo<>(jugoMaracuya));
        arbol.insertar(nodoJugos, new Nodo<>(jugoMango));
        arbol.insertar(nodoJugos, new Nodo<>(limonada));


        // Insertar Cervezas
        Nodo<Plato> nodoCervezas = arbol.buscar(cervezas);
        arbol.insertar(nodoCervezas, new Nodo<>(cristal));
        arbol.insertar(nodoCervezas, new Nodo<>(princesa));

        System.out.println(" Menú construido exitosamente");

        System.out.println("DFS:"+ arbol.recorridoDFS());

        System.out.println(" BÚSQUEDA DE PLATOS");


        System.out.println(" Buscando 'Lomo Salteado':");
        arbol.buscarYMostrar(lomo);

        System.out.println("Buscando 'Ceviche':");
        arbol.buscarYMostrar(ceviche);

        System.out.println(" Buscando plato inexistente:");
        arbol.buscarYMostrar(new Plato("Plato Inexistente"));



        System.out.println(" INSERCIÓN DE NUEVO PLATO");


        Plato nuevoPlato = new Plato("Ají de Gallina", 24.90);
        Nodo<Plato> nodoNuevoPlato = new Nodo<>(nuevoPlato);

        Nodo<Plato> padreCarnes = arbol.buscar(carnes);
        arbol.insertar(padreCarnes, nodoNuevoPlato);

        // Insertar otro plato en Jugos
        Plato nuevoJugo = new Plato("Jugo de Papaya", 5.90);
                Nodo<Plato> nodoNuevoJugo = new Nodo<>(nuevoJugo);

        Nodo<Plato> padreJugos = arbol.buscar(jugos);
        arbol.insertar(padreJugos, nodoNuevoJugo);






    }
}
