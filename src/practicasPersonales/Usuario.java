/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasPersonales;

/**
 *
 * @author Daniel Noriega
 */
public class Usuario extends Persona{
    private String usuario;
    private String password;
    private String email;
    
    public Usuario(){
        
    }
    
    public Usuario(String nombre1, String nombre2, String apellido1, String apellido2, 
            String usuario, String password, String email){
        super(nombre1,nombre2,apellido1,apellido2);
        this.usuario = usuario;
        this.password = password;
        this.email = email;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void infoUsuario(){
        System.out.println("Nombre de usuario: " + getUsuario());
        System.out.println("Password de la cuenta: " + getPassword());
        System.out.println("Email asociado: " +  getEmail());
    }
}
