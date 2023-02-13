/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1;

/**
 *
 * @author HP INTEL
 */
public class Perro extends Animal{
    
    public Perro(){
        
    }
    
    public Perro(String nombre, String raza, int edad){
        super();
    }
    
    @Override
    public void comer(){
        System.out.println("Perro come");
    }
    
    @Override
    public void accion(){
        System.out.println("Perro ladra");
    }
    
    public void infoPerro(){
        System.out.println("Datos del perro");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Raza: " + getRaza());
        System.out.println("Edad: " + getEdad() + " años");
    }
}
