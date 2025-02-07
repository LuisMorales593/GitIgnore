package Entornos;

import java.util.Scanner;

public class SensorTemperatura {
	private double temp1;
	private double temp2;
	private double temp3;
	private String ubicacion;
	private String tipoTemperatura;
	private double temperatura;
	static int opcion = 0;

	// Constructor
	public SensorTemperatura(String ubicacion) {
		super();
		this.ubicacion = "Norte";
		this.temp1 = 0;
		this.temp2 = 0;
		this.temp3 = 0;
		this.ubicacion = ubicacion;
		this.tipoTemperatura = tipoTemperatura;
		this.temperatura = temperatura;

	}
	

	public SensorTemperatura(double temp1, double temp2, double temp3) {
		super();
		this.temp1 = temp1;
		this.temp2 = temp2;
		this.temp3 = temp3;
	}


	public void registrarTemperaturas(double nuevaTemperatura1,double nuevaTemperatura2,double nuevaTemperatura3) {

		
			this.temp1 = nuevaTemperatura1;
			
			this.temp2 = nuevaTemperatura2;
			
			this.temp3 = nuevaTemperatura3;	

	}

//Método para calcular el promedio de las temperaturas
	public double calcularTemperaturaPromedio() {
		return (temp1 + temp2 + temp3) / 3;
	}
	
	public void resetearTemperaturas() {
		
		this.temp1=0;
		this.temp2=0;
		this.temp3=0;
		
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

	public String getTipoTemperatura() {
		return tipoTemperatura;
	}

	public void setTipoTemperatura(String tipoTemperatura) {
		this.tipoTemperatura = tipoTemperatura;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
}
