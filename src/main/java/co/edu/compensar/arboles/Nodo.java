package co.edu.compensar.arboles;

public class Nodo {

    int dato;
    String nombre;
    Nodo nodoIzq, nodoDer;

    public Nodo(int dato, String nombre) {
        this.dato = dato;
        this.nombre = nombre;
        this.nodoIzq = null;
        this.nodoDer = null;
    }

    @Override
    public String toString() {
        return nombre + " su nombre es: " + dato;
    }

}
