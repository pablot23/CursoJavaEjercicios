package Clase4;

import java.util.Scanner;

public class ejer1b {
	
	public static void main(String[] args) {
	    
        int nro1 = 0;
        int nro2 = 0;
        int nro3 = 0;
        char orden = 'A';

        System.out.println("Clase4 Ejer1b");  
 
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        nro1 = scan.nextInt();
        System.out.println("Ingrese el segundo número");
        nro2 = scan.nextInt();
        System.out.println("Ingrese el tercer número");
        nro3 = scan.nextInt();
        System.out.println("Ingrese si quiere ver los números en orden ascendente (A) o descendente (ingrese D)");
        orden = scan.next().charAt(0);
        ordenar3nros(nro1, nro2, nro3, orden);
    }

     
    public static void ordenar3nros(int a, int b, int c, char orden) {
        int[] vector = new int[3];
        if (orden == 'A') {
            if (a < b && a < c) {
                vector[0] = a;
                if (b < c) {
                    vector[1] = b;
                    vector[2] = c;
                } else {
                    vector[1] = c;
                    vector[2] = b;
                }
            } else if (b < a && b < c) {
                vector[0] = b;
                if (a < c) {
                    vector[1] = a;
                    vector[2] = c;
                } else {
                    vector[1] = c;
                    vector[2] = a;
                }
            } else {
                vector[0] = c;
                if (a < b) {
                    vector[1] = a;
                    vector[2] = b;
                } else {
                    vector[1] = b;
                    vector[2] = a;
                }
            }
        } else {
            if (a > b && a > c) {
                vector[0] = a;
                if (b > c) {
                    vector[1] = b;
                    vector[2] = c;
                } else {
                    vector[1] = c;
                    vector[2] = b;
                }
            } else if (b > a && b > c) {
                vector[0] = b;
                if (a > c) {
                    vector[1] = a;
                    vector[2] = c;
                } else {
                    vector[1] = c;
                    vector[2] = a;
                }
            } else {
                vector[0] = c;
                if (a > b) {
                    vector[1] = a;
                    vector[2] = b;
                } else {
                    vector[1] = b;
                    vector[2] = a;
                }
               
            }
            
        }
        System.out.println("El orden " + orden + " es: " + vector[0] + " " + vector[1] + " " + vector[2] );
    }   

}

