package kyu8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilaresTest {

	 @Test
	 void basicTest1() {
		 assertEquals(0, Pilares.pillars(1,10,10), "Testing for number of pillars: 1, distance: 10 m and width: 10 cm");
	 }
	  
	 @Test
	 void basicTest2() {
	     assertEquals(2000, Pilares.pillars(2,20,25), "Testing for number of pillars: 2, distance: 20 m and width: 25 cm");
	 }
	  
	 @Test
	 void basicTest3() {
		 assertEquals(15270, Pilares.pillars(11,15,30), "Testing for number of pillars: 11, distance: 15 m and width: 30 cm");
	 }

}
