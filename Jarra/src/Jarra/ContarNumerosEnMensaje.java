package Jarra;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
//crear programa que cuente digitos numeros de un mensaje y viseversa
//ademas remplazar las letras  con @

public class ContarNumerosEnMensaje {
	
	public static int mensaje;

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		leerDato();
	}

	public static void leerDato() {
		try {
			Scanner consola1 = new Scanner(System.in);
			System.out.println("ingresa mensaje");
			mensaje = consola1.nextInt();
			System.out.println("el mensaje no tiene letras: " +mensaje);
		} catch (Exception e) {
			//validarDato(mensaje);
			validarDato(mensaje);
			
		}
	}

	// transformo a e string
	public static void validarDato(int mensaje2) {

		String nuevoNumero = Integer.toString(mensaje2);
		System.out.println("nuevo<<<<<<mensaje "+nuevoNumero );
		 

	}

}
