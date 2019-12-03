package com.company;

import org.junit.Test;

import java.security.DrbgParameters;

import static org.junit.Assert.*;

public class NestedLoopsTest {

    @Test
    public void xsquare() {
        assertEquals("XXXXX\nXXXXX\nXXXXX\nXXXXX\nXXXXX\n", NestedLoops.xSquare());
    }

    @Test
    public void xsquare2() {
        assertEquals("XXXXXXXX\nXXXXXXXX\nXXXXXXXX\nXXXXXXXX\nXXXXXXXX\nXXXXXXXX\nXXXXXXXX\nXXXXXXXX\n", NestedLoops.xSquare2(8));
        assertEquals("X\n", NestedLoops.xSquare2(1));
        assertEquals("XX\nXX\n", NestedLoops.xSquare2(2));
    }

    @Test
    public void flippedTriangle() {
        assertEquals("******\n*****\n****\n***\n**\n*\n", NestedLoops.flippedTriangle(6));
        assertEquals("*\n", NestedLoops.flippedTriangle(1));
        assertEquals("**\n*\n", NestedLoops.flippedTriangle(2));
    }

    @Test
    public void multiplicationTable() {
        assertEquals("  1  2  3  4  5  6  7  8  9\n  2  4  6  8 10 12 14 16 18\n  3  6  9 12 15 18 21 24 27\n  4  8 12 16 20 24 28 32 36\n  5 10 15 20 25 30 35 40 45\n  6 12 18 24 30 36 42 48 54\n  7 14 21 28 35 42 49 56 63\n  8 16 24 32 40 48 56 64 72\n  9 18 27 36 45 54 63 72 81\n", NestedLoops.multiplicationTable());
    }


}