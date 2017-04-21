/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lineales;

/**
 *
 * @author Diegojim
 */
public class NodoLDE <E> {
    
    protected NodoLDE<E> siguiente;
    protected NodoLDE<E> anterior;
    protected E dato;
    
    NodoLDE(E dato){
        this(dato, null, null);
    }
    
    NodoLDE(E dato, NodoLDE<E> sig, NodoLDE<E> ant){
        this.dato = dato;
        this.siguiente = sig;
        this.anterior = ant;
    }
    
    
}
