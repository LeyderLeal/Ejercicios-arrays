package ejercicio.pkg2;

/**
 *
 * @author SENA
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] primos = new int[20];
        primos[0] = 2;
        int numero = 3;
        int i = 1;
        
        while (i < 20) {
            int contadorResiduo = 0;
            
            for (int j = 2; j < numero - 1; j++) {
                
                if (numero % j == 0) {
                    contadorResiduo++;
                    break;
                }
                
            }
            
            if (contadorResiduo == 0) {
                primos[i] = numero;
                i++;
            }
            
            numero++;
        }
        
        System.out.println("NUMEROS PRIMOS  ");
        
        for (int j = 0; j < 20; j++) {
            System.out.print(primos[j] + "   ");
        }
    }

}
