package com.imodupsy.agiletpd.classicaltdd3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author iModupsy
 * @created 31/07/2022
 */
public class PrimeFactorsTest {

    @Test
    public void one_isEqualToAnEmptyList() {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> primeNumbers = primeFactors.of(1);
        assertEquals(asList(), primeNumbers);
    }

    @Test
    public void two_isEqualToAListOfPrimeNumbersOfTwo() {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> primeNumbers = primeFactors.of(2);
        assertEquals(asList(2), primeNumbers);
    }

    @Test
    public void three_isEqualToAListOfPrimeNumbersOfThree() {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> primeNumbers = primeFactors.of(3);
        assertEquals(asList(3), primeNumbers);

    }
}
