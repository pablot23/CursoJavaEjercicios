package Clase4;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ejer2 {

	public static void main(String[] args) {
	       // leer un archivo.txt (datos)
	        String archivo = "D:\\Proyectos JAVA\\miproyecto\\src\\Clase4\\datos.txt";        
	                        
	        try {
	            String linea = Files.readAllLines(Paths.get(archivo)).get(0);
	            String [] cadena = linea.split(",");
	            int nro1 = Integer.parseInt(cadena[0]);
	            int nro2 = Integer.parseInt(cadena[1]);
	            char op = cadena[2].charAt(0);
	            if (op == 'S') {
	                int suma = nro1 + nro2;
	                System.out.println("La suma es: " + suma);
	                } else {
	                int mult = nro1 * nro2;
	                System.out.println("La multiplicacion es: " + mult);
	            } 
	        } catch (Exception e) {
	            System.out.println(" error con datos "); 
	            System.out.println(e);
	        }
	    }
	}

	
