package pruebaSIOSI;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class pruebaSIOSI {

private sensorTemperatura sensor;
	
	@BeforeEach
	public void inicializacion() {
	
	sensor = new sensorTemperatura("Invernadero Norte");
	
	}
	
	@Test
	public void testInicializacionAtributos() {
		
		assertEquals("Invernadero Norte", sensor.getUbicacion(), "La ubicaciÃ³n deberÃ­a ser Invernadero Norte");
		
		double promedioEsperado = (0.0 + 0.0 + 0.0) / 3;
		assertEquals(promedioEsperado, sensor.obtenerTemperaturaPromedio(),"El promedio deberÃ­a ser 0.0 porque todas las temp son 0.0");
		
		assertEquals(0.0, sensor.obtenerTemperaturaMaxima(),"La temp mÃ¡xima deberÃ­a ser 0.0 porque todas las temp son 0.0");
		
	}
	
	
	@Test
	public void testRegistrarTresTemperaturasValidas() {
		
		sensor.registrarTemperatura(20.5, "temp1");
		assertEquals(20.5, sensor.obtenerTemperaturaMaxima(),"La temp mÃ¡xima deberÃ­a ser 20.5");
		
		sensor.registrarTemperatura(25.3, "temp2");
		assertEquals(25.3, sensor.obtenerTemperaturaMaxima(),"La temp mÃ¡xima deberÃ­a ser 25.3");
		
		sensor.registrarTemperatura(18.7, "temp3");
		assertEquals(25.3, sensor.obtenerTemperaturaMaxima(),"La temp mÃ¡xima deberÃ­a ser 25.3");
		
		double promedioEsperado = (20.5 + 25.3 + 18.7) / 3;
		assertEquals(promedioEsperado, sensor.obtenerTemperaturaPromedio(),0.01, "La temp promedio deberÃ­a ser 21.5");
	
	}
	
	@Test
	public void testRegistrarTemperaturaEnTipoNoValido() {
		
		try {
		sensor.registrarTemperatura(30.0, "temp4");
		fail("Se esperaba recibir una excepciÃ³n de tipo IllegalArgumentException");
		}catch(IllegalArgumentException error){
			assertEquals("Tipo de temperatura no valido. Usa 'temp1', 'temp2' o 'temp3'", error.getMessage(), 
								"Se deben utilizar los valores de temp1, temp2 y temp3");
		}
	}
	
	@Test
	public void testRegistrarTemperaturaFueraDeRango() {
		
		try {
			sensor.registrarTemperatura(87.0, "temp1");
			fail("Se esperaba recibir una excepciÃ³n de tipo IllegalArgumentException");
			}catch(IllegalArgumentException error){
				assertEquals("La temperatura debe estar entre -10 y 50 grados.", error.getMessage(), 
									"El valor de temperatura debe estar en el rango entre -10 y 50 grados");
			}
	}
	
	@Test
	public void testCalcularPromedioConTemperaturasCero() {
		
		sensor.registrarTemperatura(0.0, "temp1");
		assertEquals(0.0, sensor.obtenerTemperaturaPromedio(), 
				"El promedio deberÃ­a ser 0.0 porque todas las temperaturas son 0.0");
		
		sensor.registrarTemperatura(25.0, "temp2");
		assertEquals(8.33, sensor.obtenerTemperaturaPromedio(),0.01, 
				"El promedio deberÃ­a ser 8.33 porque las temperaturas son 0.0, 25.0 y 0.0");
	}
	
	@Test
	public void testResetearTemperaturas() {
		
		sensor.registrarTemperatura(25.0, "temp1");

		sensor.resetearTemperaturas();
		//temp1 = 0.0
		//temp2 = 0.0
		//temp3 = 0.0
		assertEquals(0.0, sensor.obtenerTemperaturaPromedio(), 
				"El promedio deberÃ­a ser 0.0 porque todas las temperaturas son 0.0");
	}

}


