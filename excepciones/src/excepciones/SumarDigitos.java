package excepciones;
import java.util.Arrays;
import java.util.Scanner;
public class SumarDigitos {
	
	public static int numero;
	public static void main(String[] args) {
		
		try {
			Scanner panel = new Scanner(System.in);
			System.out.println("Ingresa numero:  ");
			numero = panel.nextInt();
			System.out.println(numero);
			panel.nextLine();
			
			System.out.println("Ingresa Codigo:  ");
			String codigo=panel.nextLine();
			System.out.println(codigo);
			int suma=0;
			
			 // Recorrer cada carácter del mensaje
	        for (int i = 0; i < codigo.length(); i++) {
	            char caracter = codigo.charAt(i);
	            
	            // Verificar si el carácter es un dígito
	            if (Character.isDigit(caracter)) {
	                // Convertir el dígito a un número y sumarlo
	                suma += Character.getNumericValue(caracter);
	            }
	        }
	        System.out.println("La suma de los dígitos en el mensaje es: " + suma);
	
			contarDigitos();
		} catch (Exception e) {
			System.out.println("EXCEPCION ON LINE");
		}
		
		
		
	}
	public static void contarDigitos() {
		
		 String nuevoNumero=Integer.toString(numero);
		 int numeroDigitos=nuevoNumero.length();
		 System.out.println("Hay "+numeroDigitos+" Digitos");
		 
		 int suma = 0;
		 
		 char[] arrayNuevo=nuevoNumero.toCharArray();
		 
		 System.out.println(Arrays.toString(arrayNuevo));

	        for (int i = 0; i < nuevoNumero.length(); i++) {
	            suma += Character.getNumericValue(nuevoNumero.charAt(i)); // Convierte el char a int y lo suma
	        }

	        System.out.println("La suma de los dígitos es: " + suma);
		
	}

}
