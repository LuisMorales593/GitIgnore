package SensorTemperatura;

import java.util.Scanner;

public class SemTemConArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Solicitar la ubicaci�n del sensor
		System.out.print("Ingrese la ubicaci�n del sensor: ");
		String ubicacion = scanner.nextLine();

		// Solicitar el n�mero de mediciones
		System.out.print("Ingrese el n�mero de mediciones: ");
		int cantidadMediciones = scanner.nextInt();

		// Crear instancia del sensor
		SenTemConArrays sensor = new SenTemConArrays(ubicacion, cantidadMediciones);

		// Registrar temperaturas
		sensor.registrarTemperaturas();

		// Mostrar resultados
		System.out.println("\n--- Resultados ---");
		System.out.println("Ubicaci�n del sensor: " + sensor.getUbicacion());
		System.out.println("Temperatura promedio: "+ sensor.calcularTemperaturaPromedio());
		System.out.println("Temperatura m�xima: "+sensor.calcularTemperaturaMaxima());
	}

}
