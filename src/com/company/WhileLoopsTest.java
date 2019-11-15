package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class WhileLoopsTest {


    @org.junit.Test
    public void fromHereToThere() {
        assertEquals("Invalid input", WhileLoops.fromHereToThere(30, 20));
        assertEquals("10 ", WhileLoops.fromHereToThere(10, 10));
        assertEquals("10 11 12 13 14 15 16 ", WhileLoops.fromHereToThere(10, 16));
    }

    @Test
    public void factorsTest() {
        assertEquals("The factors of 12 are: 1 2 3 4 6 12 ", WhileLoops.factors(12));
        assertEquals("The factors of 7 are: 1 7 ", WhileLoops.factors(7));
        assertEquals("The factors of 16 are: 1 2 4 8 16 ", WhileLoops.factors(16));
    }

    @Test
    public void countPosAndNeg() {
        assertEquals("There were 2 positive and 2 negative numbers.", WhileLoops.countPosAndNeg());
    }

    @Test
    public void testMinMax() {
        assertEquals("Max value is: 45\nMin value is: -87", WhileLoops.findMinAndMax());
    }

    @Test
    public void testGrades() {
        assertEquals(2.57, WhileLoops.gradePoint(), 0.01);
    }
}