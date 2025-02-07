package Entornos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CajaFuerteTest {
	
	@Test
	public void SaldoInicialValido() {
		CajaFuerte miMonedero= new CajaFuerte(100);
		assertEquals(100, miMonedero.getSaldo(), "Saldo esperado 100");
	}
	

	
	
	
}
