package AdivinaNumero;

public class SenTemTest {
	// M�todo main para probar la clase
		public static void main(String[] args) {
			// Crear un nuevo sensor
			sensordetemperatura sensor = new sensordetemperatura("Norte");

			// Registrar temperaturas
			sensor.registrarTemperaturas();

			// Calcular y mostrar los resultados
			System.out.printf("Temperatura promedio: %.2f\n", sensor.calcularTemperaturaPromedio());
			System.out.printf("Temperatura m�xima: %.2f\n", sensor.calcularTemperaturaMaxima());
		}

}
