package co.edu.compensar.arboles;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opcion = 0, elemento;
        String nombre = "";
        Arboles arbolBinario = new Arboles();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar nodo \n 2. Recorrer el Arbol \n 3. Salir"));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del nodo"));
                        nombre = JOptionPane.showInputDialog("Ingrese nombre del Nodo");
                        arbolBinario.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        if (!arbolBinario.estaVacio()) {
                            arbolBinario.inOrden(arbolBinario.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
                        }
                    case 3:
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } while (opcion != 3);
    }
}
