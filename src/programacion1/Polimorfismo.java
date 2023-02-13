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
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        Animal animal = new Animal();
        
        perro.setNombre("Chato");
        perro.setRaza("Pug");
        perro.setEdad(5);
        perro.infoPerro();
        perro.accion();
        perro.comer();
        
        System.out.println("\n\n");
        gato.setNombre("Pelusa");
        gato.setRaza("Persa");
        gato.setEdad(3);
        gato.infoGato();
        gato.comer();
        gato.accion();
        
        System.out.println("\n\n");
        animal.accion();
        animal.comer();
    }
    
}
