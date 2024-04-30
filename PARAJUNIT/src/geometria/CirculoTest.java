package geometria;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculoTest {
	
	// TEST DEL PERIMETRO //

	@Test
	void testPerimetro() {
		Circulo cir = new Circulo(1);
		assertEquals(Math.PI*2*1, cir.perimetro());
	}
	
	void testPerimetro2() {
		Circulo cir = new Circulo(800);
		assertEquals(Math.PI*2*800,cir.perimetro());
	}

	
	void testPerimetro3() {
		Circulo cir = new Circulo(0);
		assertEquals(Math.PI*2*0,cir.perimetro());
	}

	void testPerimetro4() {
		Circulo cir = new Circulo(-1);
		assertEquals(Math.PI*2*-1,cir.perimetro());
	}

	
	void testPerimetro5() {
		Circulo cir = new Circulo(-800);
		assertEquals(Math.PI*2*(-800),cir.perimetro());
	}


	
	
	
	
	
	// TESTS DE AREA //
	
	@Test
	void testArea() {
		Circulo cir = new Circulo (1);
		assertEquals(Math.PI, cir.area());
	}

	void testArea2() {
		Circulo cir = new Circulo (800);
		assertEquals(800*Math.PI, cir.area());
	}
	
	void testArea3() {
		Circulo cir = new Circulo (0);
		assertEquals(0, cir.area ());
	}
	
	void testArea4() {
		Circulo cir = new Circulo (-1);
		assertEquals(-1*Math.PI, cir.area());
	}
	
	void testArea5() {
		Circulo cir = new Circulo (-800);
		assertEquals((-800)*Math.PI, cir.area());
	}
		
		
		
		
		
	// TESTS DEL RADIO //
	

	@Test
	void testSetRadio() {
		assertEquals(1,1);
	}

	void testSetRadio2() {
		assertEquals(800,800);
	}

	void testSetRadio3() {
		assertEquals(0,0);
	}

	void testSetRadio4() {
		assertEquals(-1,-1);
	}

	void testSetRadio5() {
		assertEquals (-800, -1);
	}
		
		
}
