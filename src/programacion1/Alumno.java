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
public class Alumno extends Persona{
    private int carnet;
    private String correo;
    private String direccion;
    
    public Alumno(){
    
    }
    
    public Alumno(String nombre, String apellido, int edad, int carnet, String correo, String direccion){
        super();
        this.carnet = carnet;
        this.correo = correo;
        this.direccion = direccion;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /**
     *
     */
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre completo: " + getNombre() + " " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Carnet: " +  this.carnet);
        System.out.println("Correo: " + this.correo);
        System.out.println("Direccion: " + this.direccion);
    }
}
