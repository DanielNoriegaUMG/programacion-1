/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.umg.prograuno.finales;

/**
 *
 * @author Daniel Noriega
 */
public class Finales {

    private NodoLista cabeza;  // Referencia al primer nodo de la lista enlazada

    public Finales() {
        this.cabeza = null;
    }

    public void insertarAlInicio(int dato) {
        NodoLista nuevoNodo = new NodoLista(dato);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
    }

    public void imprimirLista() {
        NodoLista actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Finales lista = new Finales();

        // Insertar elementos en la lista
        lista.insertarAlInicio(3);
        lista.insertarAlInicio(7);
        lista.insertarAlInicio(1);

        lista.imprimirLista();
    }
}
