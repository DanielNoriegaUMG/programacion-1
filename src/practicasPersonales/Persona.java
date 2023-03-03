/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasPersonales;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Daniel Noriega
 */
public class Persona extends Object{
    private static int id;
    private int next = 1;
    private int day;
    private int month;
    private int year;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private GregorianCalendar nacimiento;
    private Date date;

    //incrementador de ID para clientes
    public Persona(){
        id = next;
        next++;
    }

    public Persona(String nombre1, String nombre2, String apellido1, String apellido2){
        this.primerNombre = nombre1;
        this.segundoNombre = nombre2;
        this.primerApellido = apellido1;
        this.segundoApellido = apellido2;
    }
    
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    
    public String nombreCompleto(){
        return primerNombre + " " + segundoNombre + " " + primerApellido + " " + segundoApellido;
    }
    
    public Date getNacimiento(){
        this.date = nacimiento.getTime();
        return this.date;
    }
    
    public void setNacimiento(int year, int month, int day){
        this.nacimiento = new GregorianCalendar(year, month-1, day);
    }
    
    public void infoPersona(){
        System.out.println(nombreCompleto());
        System.out.println("Fecha de nacimiento: " + getNacimiento());
    }
    
}
