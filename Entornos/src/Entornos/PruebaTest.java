package Entornos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class PruebaTest {

	public void iniciaAtributos() {

		SensorTemperatura Sensor1 = new SensorTemperatura("Norte");
		Sensor1.getTemp1();
		Sensor1.getTemp2();
		Sensor1.getTemp3();
		assertEquals(0,Sensor1.getTemp1(), "Correcto");
		assertEquals(0,Sensor1.getTemp1(), "Correcto");
		assertEquals(0,Sensor1.getTemp1(), "Correcto");
		
		
	}

	public void PruebaTemperaturaPromedio() {
		SensorTemperatura Sensor1 = new SensorTemperatura(2,3,4);
		
		double resultado= Sensor1.calcularTemperaturaPromedio();
		
		assertEquals(3,resultado, "el promedio a piori debe ser 3");

	}

	public void ActualizarTemperaturas() {
		SensorTemperatura Sensor1 = new SensorTemperatura("Norte");
		Sensor1.registrarTemperaturas(2, 3, 4);
		
    }
	

	
	public void registrarTempFueraRango() {

	}
	
}
