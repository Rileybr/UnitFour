package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForLoopsTest {

    @Test
    public void printingHashTagsTest() {
        assertEquals("#######", ForLoops.printingHashTags(7));
        assertEquals("#", ForLoops.printingHashTags(1));
        assertEquals("", ForLoops.printingHashTags(0));
        assertEquals("", ForLoops.printingHashTags(-1));
    }

    @Test
    public void countDownTest() {
        assertEquals("10 9 8 7 6 5 4 3 2 1 0 ", ForLoops.countDown(0, 10));
        assertEquals("5 4 3 2 ", ForLoops.countDown(2, 5));
        assertEquals("", ForLoops.countDown(10, 0));
        assertEquals("10 ", ForLoops.countDown(10, 10));
    }

    @Test
    public void countDown2Test() {
        assertEquals("10 9 8 7 6 5 4 3 2 1 0 ", ForLoops.countDown2(0, 10));
        assertEquals("5 4 3 2 ", ForLoops.countDown2(2, 5));
        assertEquals("5 4 3 2 ", ForLoops.countDown2(5, 2));
        assertEquals("10 9 8 7 6 5 4 3 2 1 0 ", ForLoops.countDown2(10, 0));
        assertEquals("10 ", ForLoops.countDown2(10, 10));
    }

    @Test
    public void sumNumbersTest() {
        assertEquals(45, ForLoops.sumNumbers(5, 10));
        assertEquals(45, ForLoops.sumNumbers(10, 5));
        assertEquals(-189, ForLoops.sumNumbers(-7, -20));
    }
}