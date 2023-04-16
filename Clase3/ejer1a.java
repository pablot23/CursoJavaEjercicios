package Clase3;

public class ejer1a {

	public static void main(String[] args) {
		
		int cantletras = cuantasvecesaparece("abecedario", 'a');
			
			System.out.println(cantletras);
	}

	public static int cuantasvecesaparece (String palabra, char letra){
	int cantletras=0;
	for(int i = 0; i < palabra.length(); i++) {
		if(palabra.charAt(i)==letra) {
			cantletras++;
		}
}
return cantletras;
	}
}
		
	/*	int cantdadLetras = cantidadDeApariciones("banana", 'b');
		System.out.println("cantidadLetras");
		
	}
	public static int cantidadDeApariciones (String palabra, char letra) {
		int cantidadDeLetras = 0;
			for (int i = 0; i < palabra.length(); i++) {
				if(palabra.charAt(i)==letra) {
					cantidadDeLetras++;
				}
			}
	return cantidadDeLetras;
		
	}
}
*/