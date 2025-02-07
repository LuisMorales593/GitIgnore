package SensorTemperatura;

import java.util.Scanner;

public class SenTemConArrays {
	// Atributos
	private double[] temperaturas; // Array para almacenar temperaturas
	private String ubicacion; // Ubicacion del sensor
	private int cantidadMediciones; // Numero de mediciones

	// Constructor
	public SenTemConArrays(String ubicacion, int cantidadMediciones) {
		super();
		this.cantidadMediciones=cantidadMediciones;
		this.ubicacion = ubicacion;
		if (cantidadMediciones > 0) {
            this.temperaturas = new double[cantidadMediciones];
        } else {
        	System.out.println("La cantidad de mediciones debe ser mayor a 0.");
        }
		
	}

	// Método para registrar temperaturas
	public void registrarTemperaturas() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Registrando temperaturas");

		for (int i = 0; i < cantidadMediciones; i++) {
			System.out.print("Ingrese la temperatura " + (i + 1) + ": ");
			temperaturas[i] = scanner.nextDouble();
		}

	}
	 // Método para calcular la temperatura promedio
    public double calcularTemperaturaPromedio() {
        double suma = 0;
        for (double temp : temperaturas) {
            suma += temp;
        }
        return suma / temperaturas.length;
    }
    // Método para calcular la temperatura máxima
    public double calcularTemperaturaMaxima() {
        double maxima = temperaturas[0];
        for (double temp : temperaturas) {
            if (temp > maxima) {
                maxima = temp;
            }
        }
        return maxima;
    }

	public double[] getTemperaturas() {
		return temperaturas;
	}

	public void setTemperaturas(double[] temperaturas) {
		this.temperaturas = temperaturas;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCantidadMediciones() {
		return cantidadMediciones;
	}

	public void setCantidadMediciones(int cantidadMediciones) {
		this.cantidadMediciones = cantidadMediciones;
	}
    
    
}




