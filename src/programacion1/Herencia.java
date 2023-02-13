/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author HP INTEL
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        
        String title = "Registro de alumnos";
        
        alumno.setNombre(JOptionPane.showInputDialog(null,"Escribe el nombre del alumno", title, 3));
        alumno.setApellido(JOptionPane.showInputDialog(null,"Escribe el apellido del alumno", title, 3));
        alumno.setEdad(parseInt(JOptionPane.showInputDialog(null, "Digite la edad del alumno", title, 3)));
        alumno.setCarnet(parseInt(JOptionPane.showInputDialog(null,"Digita el carnet del alumno",title,3)));
        alumno.setCorreo(JOptionPane.showInputDialog(null,"Escribe el correo del alumno", title, 3));
        alumno.setDireccion(JOptionPane.showInputDialog(null, "Escribe la direccion del alumno", title, 3));
        
        alumno.mostrarInfo();
        
    }
    
}
