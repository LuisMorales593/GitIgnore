package Entornos;

public class par {
	NUMERO PAR
	import org.junit.jupiter.api.Test;

	import static org.junit.jupiter.api.Assertions.assertTrue;
	import static org.junit.jupiter.api.Assertions.assertFalse;

	class NumeroTest {

	    @Test
	    void testEsPar() {
	        // Verificar que 4 es un número par
	        assertTrue(Numero.esPar(4), "4 debería ser un número par");

	        // Verificar que 7 NO es un número par
	        assertFalse(Numero.esPar(7), "7 no debería ser un número par");
	    }
	}
	import org.junit.jupiter.api.Test;
	import static org.junit.jupiter.api.Assertions.assertTrue;
	import static org.junit.jupiter.api.Assertions.assertFalse;

	class NumeroTest {

	    @Test
	    void testEsPar() {
	        // Caso: Número par
	        assertTrue(Numero.esPar(4), "4 debería ser un número par");

	        // Caso: Número impar
	        assertFalse(Numero.esPar(7), "7 no debería ser un número par");

	        // Caso: Número negativo par
	        assertTrue(Numero.esPar(-8), "-8 debería ser un número par");

	        // Caso: Número impar negativo
	        assertFalse(Numero.esPar(-5), "-5 no debería ser un número par");

	        // Caso: Cero (0 es par)
	        assertTrue(Numero.esPar(0), "0 debería ser un número par");
	    }
	}
	public class Numero {
	    public static boolean esPar(int numero) {
	        return numero % 2 == 0;
	    }
	}
	
	
	public void registrarTemperatura(double temperatura, String tipoTemperatura) {
		if (temperatura < -10 || temperatura > 50) {
			throw new IllegalArgumentException("La temperatura debe estar entre -10 y 50 grados.");
		}

		switch (tipoTemperatura) {
		case "temp1":
			this.temp1 = temperatura;
			break;
		case "temp2":
			this.temp2 = temperatura;
			break;
		case "temp3":
			this.temp3 = temperatura;
			break;
		default:
			throw new IllegalArgumentException("Tipo de temperatura no valido. Usa 'temp1', 'temp2' o 'temp3'");
		}

		
		

}
