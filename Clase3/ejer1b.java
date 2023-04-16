package Clase3;

public class ejer1b {
	
	public static void main(String[] args) {
		
		
        ordenar3num(22, 1, 10, "ascendente");
        ordenar3num(45, 90, 15, "decreciente");
      }
		
        public static void ordenar3num(int a, int b, int c, String ordenar) {

		    int[] vector = new int[3];
		     if (ordenar.equals("ascendente")) { 
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
		    System.out.println("Orden " + ordenar + " : " + vector[0] + " " + vector[1] + " " + vector[2] );
		}
}
