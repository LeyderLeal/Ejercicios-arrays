package ejercicio.pkg2;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int Entero[]=new int[10];
        int Cuadrado[]=new int[10];
        int Ascendente[]=new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero entero: ");
            Entero[i]=teclado.nextInt();
        }
        
        System.out.println("El numero de enteros ingresados son: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(Entero[i]+"    ");
        }
        
        for (int i = 0; i < 10; i++) {
            Cuadrado[i]=Entero[i]*Entero[i];
        }
        
        System.out.println("");
        System.out.println("El cuadrado de cada numero es: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(Cuadrado[i]+"    ");
        }
        
        Arrays.sort(Entero);
        for (int i = 0; i < Entero.length; i++) {
            Ascendente[i]=Entero[i];
        }
        
        System.out.println("");
        System.out.println("Los numeros enteros que ingreso fueron: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(Ascendente[i]+"    ");
        }
    }
    
}
