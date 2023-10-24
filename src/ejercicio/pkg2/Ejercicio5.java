package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double medidas[][] = new double[5][2];
        int cantidadPers = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese su estutura: ");
            medidas[i][0] = Double.parseDouble(teclado.nextLine());
            System.out.println("Ingrese su peso: ");
            
            medidas[i][1] = Double.parseDouble(teclado.nextLine());
            
            if ((medidas[i][0] < 1.70) && (medidas[i][1] < 70)) {
                cantidadPers++;
            }
        }
        
        double sumaEstatura = 0;
        double sumaPeso = 0;
        
        for (int i = 0; i < medidas.length; i++) {
            
            sumaEstatura = sumaEstatura + medidas[i][0];
            sumaPeso = sumaPeso + medidas[i][1];
            
        }
        
        double promedioEst = sumaEstatura / medidas.length;
        double promedioPes = sumaPeso / medidas.length;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Las personas con medida menor a 1.70 y peso menor a 70 kilos son: " + cantidadPers);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("El promedio de la estatura es: " + promedioEst + " y el promedio del peso es: " + promedioPes);
    }

}
