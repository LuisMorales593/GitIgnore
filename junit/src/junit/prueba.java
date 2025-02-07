package junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PersonaTest {
	
	@Test
	public void  testEsMayorDeEdad() {
		
		Persona persona = new Persona("Maria", 30);
		
		assertTrue(persona.esMayorEdad(), "Se esperaba que la persona fuese mayor de edad");
	}
	
	@Test
	public void  testNoEsMayorDeEdad() {
		
		Persona persona = new Persona("Maria", 12);
		
		assertFalse(persona.esMayorEdad(), "Se esperaba que la persona fuese mayor de edad");
	}

}