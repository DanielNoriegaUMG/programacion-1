/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicasPersonales;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Daniel Noriega
 */
public class Cuenta extends Object{
    protected int numeroCuenta;
    protected GregorianCalendar fVencimiento;
    private Date date;
    private int day;
    private int month;
    private int year;
    private double saldo;
    private double depositar;
    private double retirar;
    private boolean tarjetaDebito;
    private boolean tarjetaCredito;
    private int codTarjetaDebito;
    private int codTarjetaCredito;
    
    public Cuenta(){
        this.depositar = 0.00;
        this.retirar = 0.00;
        this.saldo = 0.00;
    }
    
    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Date fVencimiento() {
       this.date = fVencimiento.getTime();
       return this.date;
    }

    public void setfVencimiento(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.fVencimiento = new GregorianCalendar(this.year, this.month-1, this.day);
    } 

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getRetirar() {
        return retirar;
    }

    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }

    public boolean isTarjetaDebito() {
        return tarjetaDebito;
    }

    public void isTarjetaDebito(boolean tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public boolean isTarjetaCredito() {
        return tarjetaCredito;
    }

    public void isTarjetaCredito(boolean tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
     public int getCodTarjetaDebito() {
        return codTarjetaDebito;
    }

    public void setCodTarjetaDebito(int codTarjetaDebito) {
        this.codTarjetaDebito = codTarjetaDebito;
    }

    public int getCodTarjetaCredito() {
        return codTarjetaCredito;
    }

    public void setCodTarjetaCredito(int codTarjetaCredito) {
        this.codTarjetaCredito = codTarjetaCredito;
    }
    
}
