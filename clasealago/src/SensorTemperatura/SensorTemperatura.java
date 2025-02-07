package SensorTemperatura;

import java.util.Scanner;

public class SensorTemperatura {
	// Atributos
	private double temp1;
	private double temp2;
	private double temp3;
	private String ubicacion;
	

	// Constructor
	public SensorTemperatura(String ubicacion) {
		super();
		this.ubicacion = ubicacion;
	}

	// Método para registrar temperaturas
	public void registrarTemperaturas() {
		
	
		
		System.out.println("REGISTRO DE TEMPERATURAS");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese Ubicacion:  ");
		ubicacion=scanner.next();
		this.ubicacion=ubicacion;

		System.out.print("Ingrese la primera temperatura: ");
		temp1 = scanner.nextDouble();

		System.out.print("Ingrese la segunda temperatura: ");
		temp2 = scanner.nextDouble();

		System.out.print("Ingrese la tercera temperatura: ");
		temp3 = scanner.nextDouble();
	}

	// Método para calcular el promedio de las temperaturas
	public double calcularTemperaturaPromedio() {
		return (temp1 + temp2 + temp3) / 3;
	}

	// Método para calcular la temperatura máxima
	public double calcularTemperaturaMaxima() {
		return Math.max(temp1, Math.max(temp2, temp3));// MAS RAPIDO
	}

	public double getTemp1() {
		return temp1;
	}

	public void setTemp1(double temp1) {
		this.temp1 = temp1;
	}

	public double getTemp2() {
		return temp2;
	}

	public void setTemp2(double temp2) {
		this.temp2 = temp2;
	}

	public double getTemp3() {
		return temp3;
	}

	public void setTemp3(double temp3) {
		this.temp3 = temp3;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "sensordetemperatura [temp1=" + temp1 + ", temp2=" + temp2 + ", temp3=" + temp3 + ", ubicacion="
				+ ubicacion + "]";
	}
}
