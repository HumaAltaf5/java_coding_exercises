package com.techreturners.exercise005;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Exercise005Test {

    private Exercise005 ex005;

    @Before
    public void setup() {
        ex005 = new Exercise005();
    }

    @Test
    public void checkEmptySentenceIsNotAPangram() {
        assertFalse(ex005.isPangram(""));
    }

    @Test
    public void checkPerfectLowerCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void checkPerfectUpperCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    public void checkSentenceWithLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("the quick brown fox jumps over the lazy dog"));
    }

    // Test to check true for Pangram with all capital letters
    @Test
    public void checkSentenceWithUpperCaseIsAPangram() {
        assertTrue(ex005.isPangram("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
    }

    @Test
    public void checkSentenceWithMixedUpperAndLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("The Five boXing wiZards Jump QuicklY"));
    }

    @Test
    public void checkSentenceWithMissingLetterXIsNotAPangram() {
        assertFalse(ex005.isPangram("the quick brown fo jumps over the lazy dog"));
    }

    @Test
    public void checkSentenceWithMissingLetterHIsNotAPangram() {
        assertFalse(ex005.isPangram("five boxing wizards jump quickly at it"));
    }

    @Test
    public void checkSentenceWithUnderscoresIsAPangram() {
        assertTrue(ex005.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }

    @Test
    public void checkSentenceWithNumbersIsAPangram() {
        assertTrue(ex005.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs"));
    }

    // Test to check false for non Pangram sentence
    @Test
    public void checkSentenceIsNotPangram() {
        assertFalse(ex005.isPangram("The tortoise and the hare decided to race"));
    }

    // Test to check true for multiple Pangrams
    @Test
    public void checkMultipleSentencesArePangram() {
        assertTrue(ex005.isPangram("the quick brown fox jumps over the lazy dog and the quick onyx goblin jumps over the lazy dwarf"));
    }

    // Test to check false for all non alphabetic characters
    @Test
    public void checkSentenceWithNoAlphabetsIsNotPangram() {
        assertFalse(ex005.isPangram("123_{]]}!@#$%^&*()?><+-789"));
    }

    // Test to check true for Pangram mixed with numbers and special characters
    @Test
    public void checkSentenceWithMixedCharIsPangram() {
        assertTrue(ex005.isPangram("1.All (20) questions asked, by five watched experts amaze the judge!!!"));
    }

    // Test to check true for fully upper and lowercase Pangrams
    @Test
    public void checkSentenceWithUpperandLowerCasePangramsIsPangram() {
        assertTrue(ex005.isPangram("Jim quickly realized that the beautiful gowns are expensive and WE PROMPTLY JUDGED ANTIQUE IVORY BUCKLES FOR THE NEXT PRIZE."));
    }

    // Test to check true for NullPointer Exception
    @Test
    public void checkNullPointerException() {
        try {
            ex005.isPangram(null);
            fail("Failed to throw Exception");
        } catch (NullPointerException expected) {
            assertEquals(NullPointerException.class, expected.getClass());
            System.out.println(expected);
        }
    }
}
