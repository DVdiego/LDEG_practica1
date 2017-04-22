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
        
        if(i == talla()) insertarEnFin(x); //insertar al final
    }

    @Override
    public void insertarEnFin(Object x) {
        NodoLDE<E> nuevo = new NodoLDE<E>(x);
        NodoLDE<E> aux = primero;
        while(aux.siguiente!=null){
            aux = aux.siguiente;
        }
        aux.siguiente = nuevo;
        nuevo.anterior = aux;
}

    @Override
    public int indiceDe(Object x) {
        NodoLDE<E> aux = primero;
        int cont = 0;
        while(aux.dato!=x || aux.siguiente!=null){
            aux = aux.siguiente;
            cont++;
        }
        if(aux.dato == x) return cont;
        else return -1;
    }

    @Override
    public Object recuperar(int i) {
        NodoLDE<E> aux = primero;
        if(i>=0 && i<talla()){
            for (int j=0; j<i; j++){
                aux = aux.siguiente;
            }
            return aux.dato;
        } else return null;
    }

    @Override
    public boolean vaciarLista() {
        primero = null;
        return true;
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
        NodoLDE<E> aux = primero;
        NodoLDE<E> sig = aux.siguiente;
        NodoLDE<E> ant = aux.anterior;
        int cont = 0;
        if(i == 0){ //borrado al principio
            sig.anterior = null;
            primero = aux.siguiente;
            cont++;
        }
        if(i < talla()-1 && i>0){ // borrado en medio
            for(int j = 1;j<=i;j++){
                aux = aux.siguiente;
                ant = aux.anterior;
                sig = aux.siguiente;
            }
            ant.siguiente = aux.siguiente;
            sig.anterior = aux.anterior;
            cont++;
        }
        if(i == talla()-1){  //borrado al final 
            while(aux.siguiente!=null){
                aux = aux.siguiente;
                ant = aux.anterior;
            }
            ant.siguiente = null;
            cont++;
        }
        if(cont>0) return true;
        else return false;

    }

    @Override
    public boolean esVacia() {
        if(primero == null) return true;
        else return false;
    }

    @Override
    public boolean contiene(Object x) {
        NodoLDE<E> aux = primero;
        int cont = 0;
        while(aux.siguiente!=null||!x.equals(aux.dato)){
            aux = aux.siguiente;
        }
        if(x.equals(aux.dato)) return true;
        else return false;
    }

    @Override
    public boolean esIgual(Object x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int talla() {
        NodoLDE<E> aux = primero;
        int cont = 0;
        if(!esVacia()){
            cont++;
            while(aux.siguiente!=null){
                aux = aux.siguiente;
                cont++;
            }
        }
        return cont;
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
