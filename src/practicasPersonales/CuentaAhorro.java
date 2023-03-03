/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasPersonales;

import java.util.Scanner;
import java.util.GregorianCalendar;

/**
 *
 * @author Daniel Noriega
 */
public class CuentaAhorro extends Cuenta{
    Scanner sc = new Scanner(System.in);
    
    private double servicios;
    private boolean chequera;
    private int serieChequera;
    private double saldoActual;
    
    public CuentaAhorro(){
        this.chequera = false;
        this.servicios = 30.00;
    }

    public double getServicios() {
        return servicios;
    }

    public void setServicios(double servicios) {
        this.servicios = servicios;
    }

    public boolean isChequera() {
        return chequera;
    }

    public void isChequera(boolean chequera) {
        this.chequera = chequera;
    }
    
    public int getSerieChequera(){
        return this.serieChequera;
    }
    
    public void setSerieChequera(int numChequera){
        this.serieChequera = numChequera;
    }
    
    public void setCobroServicio(){
        this.saldoActual = getSaldo() - this.servicios;
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
        int randomNumCuenta = (int) Math.floor(Math.random() * (99999 - 10000) + 1);
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

        
/*      System.out.println("¿Deseas tener chequera para la cuenta?");
        isChequera(sc.nextBoolean());
        if(isChequera()){
            int numChequera = (int)Math.floor(Math.random()*(9999 - 1000)+9999);
            setSerieChequera(numChequera);
        }
*/       
        sc.nextLine();
        System.out.println("¿Desea realizar el deposito?");
        System.out.print("(si/no): ");
        String opcion = sc.nextLine();
        if(opcion.equalsIgnoreCase("si")){
            System.out.print("Digite el monto del deposito: ");
            setDepositar(sc.nextDouble());
            saldoActual = getSaldo() + getDepositar();
            setSaldo(saldoActual);
        }
    }
    
    public void infoCuentaAhorro(){
        System.out.println("Numero de la cuenta: " + getNumeroCuenta());
        if(isTarjetaCredito()){
            System.out.println("Numero tarjeta de credito: " + getCodTarjetaCredito());
            //System.out.println("Fecha de venciemiento de la tarjeta: " + getfVencimiento());
        }
        
        if(isTarjetaDebito()){
            System.out.println("Numero de tarjeta de debito: " + getCodTarjetaDebito());
            //System.out.println("Fecha de vencimiento de la tarjeta: " + getfVencimiento());
        }
        
        if(getDepositar() > 0){
            System.out.println("Para la apertura de la cuenta se deposito un total de: " + getDepositar());
            System.out.println("Costo de servicio de la cuenta: Q" + getServicios());
            setCobroServicio();
            System.out.println("Saldo total de la cuenta: " + getSaldo());
        }else{
            System.out.println("Aun no se deposito dinero en la cuenta...");
        }
        
    }
    
}
