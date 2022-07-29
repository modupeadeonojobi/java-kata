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

    public String convertToRomanNumerals(int i) {
        if (i <= 3) {
            return "i".repeat(i);
        }
        if (i == 4 || i == 5) {
            return "i".repeat(5 - i) + "v";
        }
        if (i > 5 && i < 9) {
            String val = convertToRomanNumerals(5) + convertToRomanNumerals(i - 5);
            return val;
        }
        if (i == 9 || i == 10) {
            return "i".repeat(10 - i) + "x";
        }

        return "";
    }
}
