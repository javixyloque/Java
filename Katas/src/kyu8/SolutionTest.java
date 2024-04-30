package kyu8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void sampleTest() {
	       assertEquals("SSttrriinngg",Solution.doubleChar("String"));
	       assertEquals("HHeelllloo  WWoorrlldd",Solution.doubleChar("Hello World"));
	       assertEquals("11223344!!__  ",Solution.doubleChar("1234!_ "));
	    }

}
