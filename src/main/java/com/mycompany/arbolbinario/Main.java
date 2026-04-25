
package com.mycompany.arbolbinario;

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Crear el árbol
        arbol.raiz = new Nodo(10);
        arbol.raiz.izquierdo = new Nodo(5);
        arbol.raiz.derecho = new Nodo(15);

        // Mostrar datos
        arbol.mostrarRaizHijos();
    }
}