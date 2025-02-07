package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionDivisionCero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner Scanner1 = new Scanner(System.in);

		int numerador = 10;
		System.out.println("ingreso denominador:");
		// int denominador=Scanner1.nextInt();

		try {
			//int denominador = Scanner1.nextInt();
			int denominador=0;
			
			double fracion = (numerador / denominador);
			System.out.println("Fracion=" + numerador + "/" + denominador + "=" + (double) fracion);
		} catch (ArithmeticException e) {

			System.out.println("Se  Ha ingresado 0 como denominador pongo valor por defecto denominador 5");
			// denominador=5;
			double fraccion2 = numerador / 5;
			System.out.println("mi Fraccion= " + fraccion2 + "  mensaje error: " + e);

		} catch (InputMismatchException e) {
			System.out.println("se a ingresado una letra produciendo el siguiente error:" + e);

		}

		finally {
			System.out.println("Operación finalizada.");
			//Scanner1.close(); // Cerramos el scanner en el bloque finally
		}

	}

}
