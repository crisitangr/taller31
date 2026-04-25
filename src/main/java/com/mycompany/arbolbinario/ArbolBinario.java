
package com.mycompany.arbolbinario;

public class ArbolBinario {
    Nodo raiz;

    // Constructor
    public ArbolBinario() {
        raiz = null;
    }

    // Método para mostrar raíz, izquierda y derecha
    public void mostrarRaizHijos() {
        if (raiz != null) {
            System.out.println("Raíz: " + raiz.dato);

            if (raiz.izquierdo != null) {
                System.out.println("Izquierda: " + raiz.izquierdo.dato);
            }

            if (raiz.derecho != null) {
                System.out.println("Derecha: " + raiz.derecho.dato);
            }
        }
    }
}
