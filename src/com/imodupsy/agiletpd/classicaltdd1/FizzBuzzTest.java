package com.imodupsy.agiletpd.classicaltdd1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author iModupsy
 * @created 25/07/2022
 */
class FizzBuzzTest {

    /**
     * Write a function that takes numbers from 1 to 100 and outputs them as a string, but for
     * multiples of 3, it returns Fizz instead of the number, and for multiples of 5, it returns
     * Buzz. For numbers that are multiples of both 3 and 5, it returns FizzBuzz.
     */


    @Test
    public void testFizzBuzz() {
        assertEquals("1", fizzBuzz(1));
        assertEquals("2", fizzBuzz(2));
        assertEquals("Fizz", fizzBuzz(3));
        assertEquals("Buzz", fizzBuzz(5));
        assertEquals("Buzz", fizzBuzz(10));
        assertEquals("FizzBuzz", fizzBuzz(15));

    }

    private String fizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        else if (i % 3 == 0) {
            return "Fizz";
        }
        else if (i % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(i);
    }


    /**
     * Refactor the FizzBuzz kata
     */

    @Test
    public void testRefactoredFizzBuzz() {

        assertEquals("1", fizBuz(1));
        assertEquals("2", fizBuz(2));
        assertEquals("Fizz", fizBuz(3));
        assertEquals("Buzz", fizBuz(5));
        assertEquals("Fizz", fizBuz(6));
        assertEquals("FizzBuzz", fizBuz(15));
    }

    private String fizBuz(int i) {

        String output = "";
        if (i % 3 == 0) {
            output += "Fizz";
        }

        if (i % 5 == 0) {
            output += "Buzz";
        }

        if (i % 5 != 0 && i % 3 != 0) {
            output = String.valueOf(i);
        }

        return output;


    }
}