package kyu7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockOffTest {

	@Test
    public void BasicTests() {
        assertEquals("0, 0: that looks like a \"draw\"! Rock on!", RockOff.solveRockOff(new int[]{47, 7, 2}, new int[]{47, 7, 2}));
        assertEquals("3, 0: Alice made \"Kurt\" proud!", RockOff.solveRockOff(new int[]{47, 67, 22}, new int[]{26, 47, 12}));
        assertEquals("1, 2: Bob made \"Jeff\" proud!", RockOff.solveRockOff(new int[]{25, 50, 22}, new int[]{34, 49, 50}));
    }

}
