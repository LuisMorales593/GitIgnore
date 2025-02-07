package Jarra;

import java.util.Scanner;

public class numeronegativo {
	public static int dato = 1;
	public static int[] matriz;
	public static int suma = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int contador = 0;

		while (dato >= 0) {

			try {
				DatosMatriz();
				contador++;
				//suma = dato + suma;
				System.out.println("suma =" + suma);
				System.out.println("Numero de datos validos: " + contador);
				suma = dato + suma;
				//System.out.println("Media:" + (double) suma / contador);
			} catch (Exception e) {
				System.out.println("Entrada no válida. Por favor, ingresa un número.");
				
			}
			finally {
				//ingresoDato.close();
				System.out.println("PROMEDIO");
				
				double media = (double) suma / contador;
				if ( !Double.isNaN(media))
					System.out.println("Media:" + media );
			}

		}

	}

	public static void DatosMatriz() {
		Scanner ingresoDato = new Scanner(System.in);
		System.out.println("\nIngresar dato: ");
		dato = ingresoDato.nextInt();
		System.out.println("Dato ingresado :" + dato);

	}

}
