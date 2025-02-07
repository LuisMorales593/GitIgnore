package SensorTemperatura;

import java.util.Scanner;

public class arrayRecorrido {
	public static int arreglo[] = { 6, 7, 8, 9, 10 };// aca me sirve si quiero cambiar de forma general

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bucle=0;
		Scanner leer = new Scanner(System.in);
		imprimirArray(arreglo);
		while (bucle==0) {
			System.out.println("Ingrese el numero de veces a recorrer:");
			int numeroVeces = leer.nextInt();
			for (int i = 0; i < numeroVeces; i++) {
				// recorrer derecha 2 espacios
				recorrerDerecha(arreglo);
				// imprimirArray(arreglo);
			}
			imprimirArray(arreglo);
			// recorrerIzquierda(arreglo);
			// imprimirArray(arreglo);
		}

	}

	public static int[] imprimirArray(int array[]) {

		for (int num : array) {
			System.out.println("[" + num + "]");
		}
		System.out.println();
		return array;
	}

	public static int[] recorrerDerecha(int[] array) {
		int ultimo = array[array.length - 1];
		for (int i = (array.length - 1); i > 0; i--) {
			array[i] = array[i - 1];

		}
		array[0] = ultimo;
		return array;

	}

	public static int[] recorrerIzquierda(int[] array) {

		int primero = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];

		}
		array[array.length - 1] = primero;
		return array;
	}

}
