package co.edu.compensar.arboles;

import javax.swing.JOptionPane;

public class Arboles {
    
    Nodo raiz;
    String cadena;
    
    public Arboles() {
        raiz = null;
        cadena = "";
    }
    
    public void agregarNodo(int d, String nom) {
        Nodo nuevo = new Nodo(d, nom);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo auxiliar = raiz;
            Nodo padre;
            while (true) {
                padre = auxiliar;
                if (d < auxiliar.dato) {
                    auxiliar = auxiliar.nodoIzq;
                    if (auxiliar == null) {
                        padre.nodoIzq = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.nodoDer;
                    if (auxiliar == null) {
                        padre.nodoDer = nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    public boolean estaVacio() {
        return raiz == null;
    }
    
    public void inOrden(Nodo r) {
        if (r != null) {
            inOrden(r.nodoIzq);
            //this.cadena = this.cadena + r.dato + " " + r.nombre + "\n";
            JOptionPane.showMessageDialog(null, r.dato + r.nombre);
            inOrden(r.nodoDer);
            
            //JOptionPane.showMessageDialog(null, this.cadena);
        }
    }
    
}
