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
public interface ListaDE {
    
    public abstract void insertar(Object x);
    
    public abstract void insertar(Object x, int i);
    
    public abstract void insertarEnFin(Object x);
    
    public abstract int indiceDe(Object x);
    
    public abstract Object recuperar(int i);
    
    public abstract boolean vaciarLista();
    
    public abstract boolean eliminar(Object x);
    
    public abstract boolean eliminar(int i);
    
    public abstract boolean esVacia();
    
    public abstract boolean contiene(Object x);
    
    public abstract boolean esIgual(Object x);
    
    public abstract int talla();
    
    public abstract Object[] toArray(Object[] a);
    
    public abstract String toString();
    
    
}
