package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MensajeConLetra {
	public static String[] arreglo1= {"alfa","gama","Landa"};
	
	
	public static void main(String[] args) {
		
		while (true) {
			try {
				verificarArray();

			} catch (InputMismatchException e) {
				System.out.println("Error Ingrese un numero:    " + e.getMessage());
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error de dimension: " + e.getMessage());
			} 
			finally {
				System.out.println("FIN DE LA EJECUCION");
			}
		}
		
	}
	
		

	public static void verificarArray() throws InputMismatchException, ArrayIndexOutOfBoundsException {
		
		//provocar un error de  array al mirrar el localizado
		System.out.println("Ingreso de tamanio:");
		Scanner ingreso1= new Scanner(System.in);
		int lugar;
		try {
			lugar = ingreso1.nextInt();
		} catch (InputMismatchException e) {
			throw new  InputMismatchException("Dato no es valido ");
		}
		System.out.println("tamanio ingresado"+lugar);
		System.out.println(arreglo1[lugar-1]);
		
		
		//System.out.println(arreglo[tamanio]);
		
	}

}
