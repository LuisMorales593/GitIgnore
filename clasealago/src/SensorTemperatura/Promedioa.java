
package SensorTemperatura;

import java.util.Scanner;
import java.util.Arrays;

public class Promedioa {
	public static int tamanio;
	public static int[] notas;

	public static void main(String[] args) {
		// Pedir al usuario el nÃºmero de estudiantes en la clase.
		// Usa un Scanner para leer este dato.
		ingresarDatos();

		mostrarDatos();
		promovidos();
		notaAB();
		media();

	}

	public static void ingresarDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("ingrese numero de notas:");
		tamanio = entrada.nextInt();

		// ingreso notas

		notas = new int[tamanio];

		System.out.println("Ingresa las notas");

		for (int i = 0; i < notas.length; i++) {

			int caValida = entrada.nextInt();
			if (caValida >= 0 && caValida <= 10) {

				notas[i] = caValida;

			} else {
				System.out.println("ingrese valor valido");
				i = i - 1;
			}

		}

	}

	public static void mostrarDatos() {

		System.out.println("Las notas ingresadas son: " + Arrays.toString(notas));

		for (int num : notas) {
			System.out.println("[" + num + "]");
		}
	}

	public static void notaAB() {
		int notaAlta = notas[0];
		int notaBaja = notas[0];
		for (int i = 0; i < tamanio; i++) {
			if (notaAlta < notas[i]) {
				notaAlta = notas[i];

			}

		}
		System.out.println("Nota mas alta es: " + notaAlta);
		for (int i = 0; i < tamanio; i++) {
			if (notaBaja > notas[i]) {
				notaBaja = notas[i];
			}

		}
		System.out.println("Nota mas Baja es: " + notaBaja);
	}

	public static void media() {

		int suma = 0;
		double promedio = 0.0;
		for (int i = 0; i < tamanio; i++) {
			suma += notas[i];

		}

		promedio = (double) suma / tamanio;// me aseguro que mi resultado sea double
		System.out.printf("PROMEDIO: %.2f", promedio);

		System.out.println("\nPROMEDIO: " + promedio);
	}

	public static void promovidos() {
		int aprobados = 0;
		int reprobados = 0;
		for (int i = 0; i < tamanio; i++) {
			if (notas[i] >= 5) {
				aprobados++;
			} else
				reprobados++;
		}
		System.out.println("Aprobados: " + aprobados);
		System.out.println("Repro: " + reprobados);

	}

}
