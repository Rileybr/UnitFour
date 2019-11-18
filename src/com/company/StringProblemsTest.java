package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringProblemsTest {



    @Test
    public void printTheLetters() {
        assertEquals("P\ni\nz\nz\na\n", StringProblems.printTheLetters("Pizza"));
        assertEquals("T\nw\no\n \nW\no\nr\nd\ns\n", StringProblems.printTheLetters("Two Words"));
    }

    @Test
    public void everyOtherLetter() {
        assertEquals("Cmue cec", StringProblems.everyOtherLetter("Computer Science"));
        assertEquals("pZa", StringProblems.everyOtherLetter("piZZa"));
        assertEquals("hm", StringProblems.everyOtherLetter("home"));
    }

    @Test
    public void countTheVowels() {
        assertEquals(6, StringProblems.countTheVowels("COMPUTER science"));
        assertEquals(0, StringProblems.countTheVowels("qwrtnmgb"));
        assertEquals(5, StringProblems.countTheVowels("aeiou"));
    }

    @Test
    public void differentStrings() {
        assertEquals("aardvark and aardvark are the same", StringProblems.differentStrings("aardvark", "aardvark"));
        assertEquals("bowl and bowling are not the same. They differ at letter number 5", StringProblems.differentStrings("bowl", "bowling"));
        assertEquals("tiger and turtle are not the same. They differ at letter number 2", StringProblems.differentStrings("tiger", "turtle"));
        assertEquals("apple and banana are not the same. They differ at letter number 1", StringProblems.differentStrings("apple", "banana"));
    }

    @Test
    public void isPalindrome() {
        assertEquals(true, StringProblems.isPalindrome("civic"));
        assertEquals(true, StringProblems.isPalindrome("radar"));
        assertEquals(false, StringProblems.isPalindrome("computer"));
        assertEquals(true, StringProblems.isPalindrome("rAcECaR"));
    }
}