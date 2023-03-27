package arrays;

/**
 *
 * @author Daniel Noriega
 */
public class ordenamiento {
    public static void main(String[] args) {
        int[] numeros = {34, 56, 4 , 77, 51, 93, 10, 30, 5, 52};
        int temporal;
        
        System.out.print("Desordenado: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        //Ordenamiento de arreglo
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if(numeros[j] > numeros[j+1]){
                    temporal = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temporal;
                }
            }
        }
        
        System.out.print("\n\nOrdenado: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
