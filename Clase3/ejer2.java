package Clase3;

public class ejer2 {
	
    public static void main(String[] args) {
        
        
        codificar( "hola que tal", 1);
        decodificar( "ipmbarvfaubm", 1);
        
        codificar( "hola que tal", 2);
        decodificar( "jqncbswgbvcn", 2);
        
    }
    
public static void codificar(String cadena, int desplazamiento) {
    char[] abecedario = "abcdefghijklmnñopqrstuvwxyz ".toCharArray();
    char[] cadenaChar = cadena.toCharArray();
    char[] cadenaCodificada = new char[cadenaChar.length];
    for (int i = 0; i < cadenaChar.length; i++) {
        for (int j = 0; j < abecedario.length; j++) {
            if (cadenaChar[i] == abecedario[j]) {
                if (j + desplazamiento < abecedario.length) {
                    cadenaCodificada[i] = abecedario[j + desplazamiento];
                } else {
                    cadenaCodificada[i] = abecedario[j + desplazamiento - abecedario.length];
                }
            }
        }
    }
    System.out.println("La cadena codificada es: " + String.valueOf(cadenaCodificada) + " Con desplazamiento: "+ desplazamiento);
}
public static void decodificar(String cadena, int desplazamiento) {
    char[] abecedario = "abcdefghijklmnñopqrstuvwxyz ".toCharArray();
    char[] cadenaChar = cadena.toCharArray();

    char[] cadenaDecodificada = new char[cadenaChar.length];

    for (int i = 0; i < cadenaChar.length; i++) {
        for (int j = 0; j < abecedario.length; j++) {
          
            if (cadenaChar[i] == abecedario[j]) {

                if ((j - desplazamiento ) >= 0) {
                    cadenaDecodificada[i] = abecedario[j - desplazamiento];
                } else {
                    System.out.println(abecedario[abecedario.length - 1  ]);
                    cadenaDecodificada[i] = abecedario[abecedario.length - 1  ];
                }
            }
        }
    }
    System.out.println("La cadena decodificada es: " + String.valueOf(cadenaDecodificada) + " Con desplazamiento: "+ desplazamiento);
}
}