package Clase3;

public class ejer1c {

	public static void main(String[] args) {
	
	
    sumarNumMayoresA(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 9); }
   
    
    public static void sumarNumMayoresA(int[] vector, int x) {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > x) {
                suma += vector[i];
            }
        }
        System.out.println("La suma de los numeros mayores a " + x + " es: " + suma);
    }
	
}
