/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.prograuno.finales;

import java.util.ArrayList;

/**
 *
 * @author Daniel Noriega
 */
public class Ej1 {
    public static void main(String[] args) {
        ArrayList<String> ALUMNOS = new ArrayList<>();
        for(int i = 1; i <= 10; i++){ //lenar arraylsit por medio de bucle
            ALUMNOS.add("ALUMNO"+i);
        }
        
        //mostrar datos del arraylist por medio de bucle forEach
        for(String persona: ALUMNOS){
            System.out.println(persona);
        }
        
        ALUMNOS.add("Roberto");
        boolean existe = ALUMNOS.contains("Roberto");
        if(existe) System.out.println("El nombre esta dentro del ArrayList :)");
        else System.out.println("El nombre no existe dentro del ArrayList :(");
        
        if(existe) System.out.println("El indice donde se encuentra el nombre es el: " + ALUMNOS.indexOf("Roberto"));
        ALUMNOS.clear();
    }
}
