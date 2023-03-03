/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasPersonales;

import java.util.Scanner;

/**
 *
 * @author Daniel Noriega
 */
public class Cliente extends Usuario{
    Scanner sc = new Scanner(System.in);
    
    private int dni;
    private String estado;
    private String direccion;
    
    public Cliente(){
        
    }
    
    public Cliente(String nombre1, String nombre2, String apellido1, String apellido2, 
            String usuario, String password, String email,
            int dni, String estado, String direccion){
        super(nombre1, nombre2, apellido1, apellido2, usuario, password, email);
        this.dni = dni;
        this.estado = estado;
        this.direccion = direccion;
    }

    public long getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void pedirDatosCliente(){
        System.out.println("Dame los datos del nuevo cliente");
        System.out.print("Primer nombre: ");
        setPrimerNombre(sc.nextLine());
        
        System.out.print("Segudo nombre: ");
        setSegundoNombre(sc.nextLine());
        
        System.out.print("Primer apellido: ");
        setPrimerApellido(sc.nextLine());
        
        System.out.print("Segundo apellido: ");
        setSegundoApellido(sc.nextLine());
        
        System.out.print("Direccion:");
        setDireccion(sc.nextLine());
        sc.nextLine();
        System.out.print("DNI: ");
        setDni(sc.nextInt());
        System.out.flush();
        sc.nextLine();
        System.out.print("Estado: ");
        setEstado(sc.nextLine());
        
        System.out.print("Email: ");
        setEmail(sc.nextLine());
        
        System.out.print("Usuario: ");
        setUsuario(sc.nextLine());
        
        System.out.print("Password: ");
        setPassword(sc.nextLine());
        System.out.flush();
        sc.nextLine();
        System.out.print("Dia de nacimiento: ");
        setDay(sc.nextInt());
        
        System.out.print("Mes de nacimiento: ");
        setMonth(sc.nextInt());
        
        System.out.print("Año de nacimiento: ");
        setYear(sc.nextInt()); 
        setNacimiento(getYear(), getMonth(), getDay());
    }
    
    @Override
    public void infoPersona(){
        System.out.println("Nombre completo: " + nombreCompleto());
        System.out.println("DNI: " + getDni());
        System.out.println("Usuario: " + getUsuario());
        System.out.println("Password: " + getPassword());
        System.out.println("Estado: " + getEstado());
        System.out.println("Fecha de nacimiento: " + getNacimiento());
        System.out.println("Direccion: " + getDireccion());
    }
    
}
