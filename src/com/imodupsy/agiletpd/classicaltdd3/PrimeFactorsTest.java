package com.imodupsy.agiletpd.classicaltdd3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author iModupsy
 * @created 31/07/2022
 */
public class PrimeFactorsTest {

    @Test
    public void one_isEqualToAnEmptyArray() {
        PrimeFactors primeFactors = new PrimeFactors();
        int [] primeNumbers = primeFactors.of(1);
        assertEquals(1, primeNumbers);
    }
}
