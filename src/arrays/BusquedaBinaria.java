/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author Daniel Noriega
 */
public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] numeros = {20,43,56,76,87,12,32,89,88,100,22,24,99,34};
        int busqueda = 76;
        Arrays.sort(numeros);
        System.out.printf("%s%s%n%n", "Array ordenado: ", Arrays.toString(numeros));
        
        int pos = buscarNumero(numeros, busqueda);
        if(pos >= 0){
            System.out.println("El numero esta en la posicion: " + pos);
        }else{
            System.out.println("El numero no se encontro dentro del arreglo");
        }
    }
    
    public static int buscarNumero(int[] data, int buscar){
        int inferior = 0;
        int superior = data.length -1;
        int mitad = 0;
        int resultado = 0;
        boolean bandera = false;
        while(inferior <= superior){
            mitad = (inferior+superior)/2;
            if(data[mitad] == buscar){
                bandera = true;
                resultado = mitad;
                break;
            }else if(data[mitad] < buscar){
                inferior = mitad+1;
                mitad = (superior+inferior)/2;
            }else{
                superior =  mitad-1;
            }
        }

        if(bandera){
            return mitad;
        }else{
            return -1;
        }
    }
}
