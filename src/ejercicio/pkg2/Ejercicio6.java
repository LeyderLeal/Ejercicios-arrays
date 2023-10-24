/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class Ejercicio6 {

    private static final Scanner teclado = new Scanner(System.in);
    private static int Numero[] = new int[10];

    private static void Menu() {
        String opcion = " ";
        do {
            System.out.println("\t\tMENU DE OPCIONES");
            System.out.println("\ta. Agregar numeros al arreglo");
            System.out.println("\tb. Consultar si un numero existe en el arreglo");
            System.out.println("\tc. Mostrar la suma de los numeros pares del arreglo");
            System.out.println("\td. Mostrar el promedio de todos los numeros");
            System.out.println("\te. Mostrar la suma de numeros posiciones impares");
            System.out.println("\tf. mostrar numero mayor y menor del arreglo");
            System.out.println("\tg. Salir ");
            System.out.println("\tIngrese Opcion: ");
            opcion = teclado.nextLine();
            
            switch (opcion) {
                case "a": {
                    agregarNumero();
                }
                break;
                case "b": {
                    buscarNumero();
                }
                break;
                case "c": {
                    Pares();
                }
                break;
                case "d": {
                    Promedio();
                }
                break;
                case "e": {
                    Impares();
                }
                break;
                case "f": {
                    MayorYMenor();
                }
                break;
                case "g": {
                    System.out.println("Saliendo...");
                }
                break;
            }
            
        } while (!"g".equals(opcion));
        
    }

    private static void agregarNumero() {
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Ingrese un numero: ");
          int e=teclado.nextInt();
        Integer posicion = null;
        
        for (int j = 0; j < i; j++) {
            if (e == Numero[j]) {
                posicion = j;
                break;
                
            }
            
        }
        
        if (posicion == null) {
            Numero[i] = e;
        } else {
            System.out.println("El elemento " + e + " ya se encuentra en la posicion " + posicion + " del arreglo");
            i--;
        }
        
        }
        
    }
        
    private static void buscarNumero() {
        System.out.println("Ingrese el numero que desea buscar: ");
        int numero1=teclado.nextInt();
        int contador=0;
        
        for (int i = 0; i < Numero.length; i++) {
            
            if (Numero[i]==numero1) {
                contador++;
            }
            
        }
        
            if (contador>0) {
                System.out.println("el numero se encontro");
            }if(contador==0){
                System.out.println("El numero no se encontro");
            }
            
    }
    
    private static void Pares(){
        int suma=0;
        for (int i = 0; i < 10; i++) {
            if (Numero[i]%2==0) {
                suma=suma+Numero[i];
            }
        }
        System.out.println("La suma de los numeros pares es: "+suma);
    }
    
    private static void Promedio(){
        double suma=0;
        
        for (int i = 0; i < 10; i++) {
            suma=suma+Numero[i];
        }
        
        double promedio=suma/10;
        System.out.println("El promedio de todos los numeros es: "+promedio);
    }
    
    private static void Impares(){
        int suma=0;
        
        for (int i = 0; i < 10; i++) {
            if (Numero[i]%2!=0) {
                suma=suma+Numero[i];
            }
        }
        
        System.out.println("La suma de los numeros impares es: "+suma);
    }
    
    private static void MayorYMenor(){
        int Mayor = Numero[1];
        
        for (int i = 0; i < 10; i++) {
            if (Numero[i] > Mayor) {
                Mayor = Numero[i];
            }
        }
        
        System.out.println("El numero mayor es: "+Mayor);
        int Menor = Numero[1];
        
        for (int i = 0; i < 10; i++) {
            if (Numero[i] < Menor) {
                Menor = Numero[i];
            }
        }
        
        System.out.println("El numero menor es: "+Menor);
    }
    
public static void main(String[] args) {
        Menu();
    }
}