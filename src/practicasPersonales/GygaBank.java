/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasPersonales;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Noriega
 */
public class GygaBank{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        CuentaCorriente cc = new CuentaCorriente();
        CuentaAhorro ca = new CuentaAhorro();
        int opcion;
        
        cliente.pedirDatosCliente(); //datos del cliente
        
        System.out.println("¿Que tipo de cuenta deseas abrir?");
        System.out.println("1. Cuenta Corriente");
        System.out.println("2. Cuenta de Ahorro");
        System.out.print("Digite opcion: ");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                cc.apertura();
                System.out.println("\n\nDATOS DE LA CUENTA");
                cc.infoCuentaCorriente();
                cliente.infoPersona();
                break;
            case 2:
                ca.apertura();
                System.out.println("\n\nDATOS DE LA CUENTA");
                ca.infoCuentaAhorro();
                cliente.infoPersona();
                break;
            default:
                throw new AssertionError("Error de opcion");
        }

    }
}
