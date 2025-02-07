package SensorTemperatura;

import java.util.Scanner;

public class SemTemConArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Solicitar la ubicación del sensor
		System.out.print("Ingrese la ubicación del sensor: ");
		String ubicacion = scanner.nextLine();

		// Solicitar el número de mediciones
		System.out.print("Ingrese el número de mediciones: ");
		int cantidadMediciones = scanner.nextInt();

		// Crear instancia del sensor
		SenTemConArrays sensor = new SenTemConArrays(ubicacion, cantidadMediciones);

		// Registrar temperaturas
		sensor.registrarTemperaturas();

		// Mostrar resultados
		System.out.println("\n--- Resultados ---");
		System.out.println("Ubicación del sensor: " + sensor.getUbicacion());
		System.out.println("Temperatura promedio: "+ sensor.calcularTemperaturaPromedio());
		System.out.println("Temperatura máxima: "+sensor.calcularTemperaturaMaxima());
	}

}
