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

        Hello hey = new Hello();
        hey.call();

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


}