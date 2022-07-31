package com.imodupsy.agiletpd.classicaltdd3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author iModupsy
 * @created 30/07/2022
 */
public class PrimeFactors {




    /**
     * Factorize a positive integer number into its prime factors using TDD and the TPP table.
     * 2, 3, 4, 6, 9, 12, 15
     */

    public List<Integer> of(int number) {
        List<Integer> primeNumber = new ArrayList<>();

        if (number <= 1) {
            return primeNumber;
        }
        if (number % 2 == 0) {
           primeNumber.add(2);
        }
        return primeNumber;


    }
}
