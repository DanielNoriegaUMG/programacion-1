/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1;

/**
 *
 * @author Daniel Noriega
 */
public class Gato extends Animal{
    
    public Gato(){
        
    }
    
    public Gato(String nombre, String raza, int edad){
        super();
    }
    
    @Override
    public void comer(){
        System.out.println("Gato come");
    }
    
    @Override
    public void accion(){
        System.out.println("Gato maulla");
    }
    
    public void infoGato(){
        System.out.println("Datos del gato");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Raza: " + getRaza());
        System.out.println("Edad: " + getEdad() + " años");
    }
}
