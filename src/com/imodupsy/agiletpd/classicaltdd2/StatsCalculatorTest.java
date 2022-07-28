package com.imodupsy.agiletpd.classicaltdd2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsCalculatorTest {
    @Test
    public void outputMinValue () {
        StatsCalculator statsCalculator = new StatsCalculator();
        Integer[] arr = {6, 9, 15, -2, 92, 11};
        Integer[] arr1 = {1,2,3,4,5,6};

        Integer minVal = statsCalculator.getMinVal(arr);
        Integer minVal1 = statsCalculator.getMinVal(arr1);
        assertEquals(-2, minVal);
        assertEquals(1, minVal1);
    }

    @Test
    public void outputMaxValue() {
        StatsCalculator statsCalculator = new StatsCalculator();
        Integer[] arr = {6, 9, 15, -2, 92, 11};
        Integer[] arr2 = {6, 9, 15, -2, 92, 110};
        assertEquals(92, statsCalculator.getMaxVal(arr));
        assertEquals(110, statsCalculator.getMaxVal(arr2));
    }

    @Test
    public void outputAverage() {
        StatsCalculator statsCalculator = new StatsCalculator();
        Integer[] arr = {6, 9, 15, -2, 92, 11};
        assertEquals(21.833333, statsCalculator.getAverage(arr));
    }

    @Test
    public void outputLengthOfArray() {
        StatsCalculator statsCalculator = new StatsCalculator();
        Integer[] arr = {6, 9, 15, -2, 92, 11};
        assertEquals(6, statsCalculator.getLenthOfArray(arr));
    }

}