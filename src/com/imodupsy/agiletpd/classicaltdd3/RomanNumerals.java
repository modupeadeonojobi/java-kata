package com.imodupsy.agiletpd.classicaltdd3;

/**
 * @author iModupsy
 * @created 29/07/2022
 */
public class RomanNumerals {

    /**
     * Write a function to convert Arabic numbers to Roman numerals as best as you can,
     * following the TDD practices we have been using.
     * Cyber-dojo foundation (See license): http://www.cyber-dojo.org/.
     * Given a positive integer number (for example, 42), determine its Roman numeral
     * representation as a string (for example, XLII). You cannot write numerals like IM for
     * 999.
     */

    public String convertToRomanNumerals(int number) {
        String romanNumeral = "";
        String one = "i";

        if (number <= 3) {
            romanNumeral = one.repeat(number);
        }
        if (number == 4 || number == 5) {
            romanNumeral = one.repeat(5 - number) + "v";
        }
        if (number > 5 && number < 9) {
            romanNumeral = convertToRomanNumerals(5) + convertToRomanNumerals(number - 5);

        }
        if (number == 9 || number == 10) {
            romanNumeral = one.repeat(10 - number) + "x";
        }

        return romanNumeral;
    }
}
