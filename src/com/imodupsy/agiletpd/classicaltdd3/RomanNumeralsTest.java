package com.imodupsy.agiletpd.classicaltdd3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {
    @Test
    public void oneShouldOutputi() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String rmVal = romanNumerals.convertToRomanNumerals(1);

        assertEquals("i", rmVal);
    }

    @Test
    public void two_isEqualToRomanNumeralii() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String value = romanNumerals.convertToRomanNumerals(2);
        assertEquals("ii", value);
    }

    @Test
    public void four_isEqualToRomanNumeraliv() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String fourValue = romanNumerals.convertToRomanNumerals(4);
        assertEquals("iv", fourValue);
    }

    @Test
    public void five_isEqualToRomanNumeralv() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String value = romanNumerals.convertToRomanNumerals(5);
        assertEquals("v", value);

    }

    @Test
    public void six_isEqualToRomanNumeralvi() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String value = romanNumerals.convertToRomanNumerals(6);
        assertEquals("vi", value);

    }

    @Test
    public void eight_isEqualToRomanNumeralviii() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String value = romanNumerals.convertToRomanNumerals(8);
        assertEquals("viii", value);
    }

    @Test
    public void nine_isEqualToRomanNumeralix() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String nineValue = romanNumerals.convertToRomanNumerals(9);
        assertEquals("ix", nineValue);
    }

    @Test
    public void ten_isEqualToRomanNumeralx() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String tenValue = romanNumerals.convertToRomanNumerals(10);
        assertEquals("x", tenValue);
    }

    @Test
    public void fourteen_isEqualToRomanNumeralxiv() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String value = romanNumerals.convertToRomanNumerals(14);
        assertEquals("xiv", value);
    }

    @Test
    public void thirtyNine_isEqualToRomanNumeralxiv() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String value = romanNumerals.convertToRomanNumerals(39);
        assertEquals("xxxix", value);
    }

    @Test
    public void forty_isEqualToRomanNumeralxL () {
        RomanNumerals romanNumerals = new RomanNumerals();
        String value = romanNumerals.convertToRomanNumerals(40);
        assertEquals("xL", value);
    }

}