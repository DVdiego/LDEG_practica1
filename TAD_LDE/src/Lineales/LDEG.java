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
public class LDEG<E> implements ListaDE<E> {
    
    protected NodoLDE<E> primero;
    
    public LDEG(){
        this.primero = null;
    }

    @Override
    public void insertar(E x) { // insertar al principio
        NodoLDE<E> nuevo = new NodoLDE<E>(x);
        if(primero != null){
            nuevo.siguiente = primero;
            primero.anterior = nuevo;
            primero = nuevo;
        } else primero = nuevo;
    }

    @Override
    public void insertar(E x, int i) {
        NodoLDE<E> nuevo = new NodoLDE<E>(x);
        NodoLDE<E> ant = null;
        NodoLDE<E> aux = primero;
        if(i == 0) insertar(x); // insertar al principio
        if(i < talla() && i>0){ // inserción en medio
            for(int j = 1;j<=i;j++){
                aux = aux.siguiente;
                ant = aux.anterior; 
            }
            ant.siguiente = nuevo;
            nuevo.anterior = ant;
            aux.anterior = nuevo;
            nuevo.siguiente = aux; 
        }
        if(i == talla()){ // inserción al final
            for(int j = 1;j<talla();j++){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
            nuevo.anterior = aux;
        }
    }

    @Override
    public void insertarEnFin(Object x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indiceDe(Object x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object recuperar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean vaciarLista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(Object x) {  //problablemente sea: eliminar(E x)
        NodoLDE<E> aux = primero;
        while(aux != null && !aux.dato.equals(x)) aux = aux.siguiente;
        NodoLDE<E> sig = aux.siguiente;
        NodoLDE<E> ant = aux.anterior;
        if(aux==null) return false;
        if (aux.anterior == null) primero = aux.siguiente;
        else ant.siguiente = aux.siguiente;
        if(aux.siguiente!=null) sig.anterior = aux.anterior;
        return true;
        
    }

    @Override
    public boolean eliminar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean esVacia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contiene(Object x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean esIgual(Object x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int talla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
