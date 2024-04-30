package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prueba1Test2 {

	@Test
	void testSumarEnteros() {
		//fail("Not yet implemented");
		assertEquals (-1, Prueba1.sumarEnteros(0)); //Comprueba que son iguales
	}
	@Test
	void testSumarEnteros2() {
		assertEquals (2305843008139952128l, Prueba1.sumarEnteros(Integer.MAX_VALUE));
	}
	@Test
	void testSumarEnteros3() {
		assertEquals (-1, Prueba1.sumarEnteros(-10));
	}
}
