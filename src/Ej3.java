/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.prograuno.finales;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Daniel Noriega
 */
public class Ej3 {

    public static void main(String[] args) {
        pedirNumero();
    }

    public static ArrayList<Integer> pedirNumero() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        String respuesta = null;
        do {
            try {
                System.out.print("Dame un numero entero: ");
                int numero = sc.nextInt();
                numeros.add(numero);
                System.out.println("¿Deseas ingresar otro numero?");
                System.out.print("\n(si/no): ");
                sc.nextLine();
                respuesta = sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("El dato que ingresaste no es un numero");
                System.out.println("Intentalo de nuevo...");
            }
        } while (respuesta.equalsIgnoreCase("si"));

        int suma = numeros.stream().mapToInt(Integer::valueOf).sum();

        if (!respuesta.equalsIgnoreCase("si")) {
            System.out.println("La suma de los numeros es: " + suma);
        }
        return numeros;
    }

}
