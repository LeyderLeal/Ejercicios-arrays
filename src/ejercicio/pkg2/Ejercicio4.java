package ejercicio.pkg2;

import java.util.Random;

/**
 *
 * @author SENA
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] aleatorios = new int[10];
        Random aleatorio = new Random();
        
        for (int i = 0; i < 10; i++) {
            
            aleatorios[i] = aleatorio.nextInt(50) + 1;
            System.out.print(aleatorios[i] + "   ");
            
        }
    }

}
