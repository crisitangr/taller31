
package com.mycompany.arbolbinario;

public class Nodo {
    int dato;
    Nodo izquierdo;
    Nodo derecho;

    // Constructor
    public Nodo(int dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }
}
