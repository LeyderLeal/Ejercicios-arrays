package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Nombre[] = new String[10];
        int Icfes[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            
            boolean maxP = false;
            
            do {
                System.out.println("Ingrese su nombre: ");
                String nombre = teclado.next();
                System.out.println("Ingrese su puntaje en ICFES: ");
                int puntaje = teclado.nextInt();
                System.out.println("------------------------------------------------------");
                
                if (puntaje <= 300) {
                    Icfes[i] = puntaje;
                    Nombre[i] = nombre;
                    maxP = true;
                } else {
                    System.out.println("Puntaje superior al permitido");
                    System.out.println("---------------------------------------------------");
                    teclado.nextLine();
                }
                
            } while (!maxP);
            
        }
        
        String puntajeMaximo = Nombre[1];
        int maximoPuntaje = Icfes[1];
        for (int i = 0; i < 10; i++) {
            if (Icfes[i] > maximoPuntaje) {
                maximoPuntaje = Icfes[i];
                puntajeMaximo = Nombre[i];
            }
        }
        System.out.println("");
        System.out.println("El estudiante con mayor puntaje es: " + puntajeMaximo);
        System.out.println("El puntaje fue: " + maximoPuntaje);
        System.out.println("----------------------------------------------------");
        System.out.println("");
        String puntajeMenor = Nombre[1];
        int menorPuntaje = Icfes[1];
        for (int i = 0; i < 10; i++) {
            if (Icfes[i] < menorPuntaje) {
                menorPuntaje = Icfes[i];
                puntajeMenor = Nombre[i];
            }
        }
        System.out.println("El estudiante con menor puntaje es: " + puntajeMenor);
        System.out.println("El puntaje fue: " + menorPuntaje);
        System.out.println("----------------------------------------------------");
        System.out.println("");
        double suma = 0;
        for (int i = 0; i < Icfes.length; i++) {
            suma = suma + Icfes[i];
        }
        double promedio = suma / Icfes.length;
        System.out.println("El promedio del puntaje ICFES es: " + promedio);
    }
}
