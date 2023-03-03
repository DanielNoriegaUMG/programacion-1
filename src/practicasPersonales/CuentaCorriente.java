/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasPersonales;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Daniel Noriega
 */
public class CuentaCorriente extends Cuenta {

    Scanner sc = new Scanner(System.in);
    private double servicio;
    private double saldoActual;

    public CuentaCorriente() {
        this.servicio = 15.00;
    }

    public CuentaCorriente(double saldo) {
        super();
        this.servicio = 15.00;
    }

    public double getServicio() {
        return servicio;
    }

    public void setServicio(double servicio) {
        this.servicio = servicio;
    }

    public void setCobroServicio() {
        this.saldoActual = getSaldo() - this.servicio;
        setSaldo(saldoActual);
    }
    
    // Generar numero aleatorio para el dia
    public int randomDay(){
        int randomDay = (int) Math.floor(Math.random() * 31 + 1); //valor random del dia
        return randomDay;
    }
    
    // Generar numero aleatorio para el mes
    public int randomMonth(){
        int randomMonth = (int) Math.floor(Math.random() * 12 + 1); //valor random del mes
        return randomMonth;
    }

    // Gererar numero aleatorio para el año
    public int randomYear(){
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.getWeekYear(); // Obtener año actual
        //año entre 2024 hasta 2035
        int randomYear = (int) Math.floor(Math.random() * (2035 - calendario.getWeekYear()) + calendario.getWeekYear());
        return randomYear;
    }
    
    // Proceso para apertura de la cuenta
    public void apertura() {
        int randomNumCuenta = (int) Math.floor(Math.random() * (1000-500) + 1);
        setNumeroCuenta(randomNumCuenta);
        
        setfVencimiento(randomYear(), randomMonth(), randomDay());

        System.out.println("¿Deseas tener una tarjeta de debito?");
        isTarjetaDebito(sc.nextBoolean());
        if (isTarjetaDebito()) {
            int cod = (int) Math.floor(Math.random() * 100 + 1); //numero entero del 1 al 100
            setCodTarjetaDebito(cod);
        }

        System.out.println("¿Deseas tener una tarjeta de credito?");
        isTarjetaCredito(sc.nextBoolean());
        if (isTarjetaCredito()) {
            int cod = (int) Math.floor(Math.random() * 100 + 1); //numero entero del 1 al 100
            setCodTarjetaCredito(cod);
        }

        sc.nextLine();
        System.out.print("¿Desea realizar el deposito?");
        String opcion = sc.nextLine();
        if(opcion.equalsIgnoreCase("si")){
            System.out.print("Digite el monto del deposito: ");
            setDepositar(sc.nextDouble());
            saldoActual = getSaldo() + getDepositar();
            setSaldo(saldoActual);
        }
    }

    public void infoCuentaCorriente() {
        System.out.println("Numero de la cuenta: " + getNumeroCuenta());
        if (isTarjetaCredito()) {
            System.out.println("Numero tarjeta de credito: " + getCodTarjetaCredito());
            System.out.println("Fecha de venciemiento de la tarjeta: " + fVencimiento());
        }

        if (isTarjetaDebito()) {
            System.out.println("Numero de tarjeta de debito: " + getCodTarjetaDebito());
            System.out.println("Fecha de vencimiento de la tarjeta: " + fVencimiento());
        }

        if (getDepositar() > 0) {
            System.out.println("Para la apertura de la cuenta se deposito un total de: " + getDepositar());
            System.out.println("Costo de servicio de la cuenta: Q" + getServicio());
            setCobroServicio();
            System.out.println("Saldo total de la cuenta: " + getSaldo());
        } else {
            System.out.println("Aun no se deposito dinero en la cuenta...");
        }

    }
}
