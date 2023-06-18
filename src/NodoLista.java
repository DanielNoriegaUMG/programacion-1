/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.prograuno.finales;

/**
 *
 * @author Daniel Noriega
 */
public class NodoLista {

    private int dato;  // El dato almacenado en el nodo
    private NodoLista siguiente;  // Referencia al siguiente nodo en la lista enlazada

    public NodoLista(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
}
