/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author Diegojim
 */
public class TAD_LDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO menú para el programa con la utilización del TAD
        Scanner entrada = new Scanner (System.in); 
        boolean continuar = true;
        do{
            System.out.println("+++++ MENÚ LDE ++++");
            System.out.println("1. Crear lista de claves enteras");
            System.out.println("2. Introducir claves en la lista");
            System.out.println("3. Contar nodos");
            System.out.println("4. Listado de claves");
            System.out.println("5. Listado de claves al revés");
            System.out.println("6. Duplicar Nodos Pares");
            System.out.println("7. Premiar claves");
            System.out.println("8. Invertir lista");
            System.out.println("0. Salir");
            System.out.print("Opcion:");
            String opcion = entrada.nextLine ();
            
            switch(opcion){
                
                case "1": break;
            
                case "2": break;
                
                case "3": break;
                
                case "4": break;
            
                case "5": break;
                
                case "6": break;
                
                case "7": break;
            
                case "8": break;
                
                case "0": continuar = false; break;
                
                default: continuar = true; break;
                               
                }
        }while(continuar); 
    }
    
    
}
      
    

