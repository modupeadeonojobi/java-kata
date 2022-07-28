package com.imodupsy.agiletpd.classicaltdd2;

import java.text.DecimalFormat;

/**
 * @author iModupsy
 * @created 28/07/2022
 */
public class StatsCalculator {
    /**
     * Your task is to process a sequence of integer numbers to determine the following
     * statistics:
     * • Minimum value
     * • Maximum value
     * • Number of elements in the sequence
     * • Average value
     * Cyber-dojo foundation (See license): http://www.cyber-dojo.org/.
     * For example: [6, 9, 15, -2, 92, 11]
     * • Minimum value = -2
     * • Maximum value = 92
     * • Number of elements in the sequence = 6
     * • Average value = 21.833333
     */
    public Integer getMinVal(Integer[] arr) {
        Integer minVal = arr[0];

        for (Integer val: arr) {
            if (val < minVal) {
                minVal = val;
            }
        }

        return minVal;
    }


    public Integer getMaxVal(Integer[] arr) {
         Integer maxVal = arr[0];

         for (Integer val: arr) {
             if (val > maxVal) {
                 maxVal = val;
             }
         }

         return maxVal;
    }

    public static Double decimalFormater (double num, String pattern) {
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        return Double.valueOf(decimalFormat.format(num));
    }

    public Double getAverage(Integer[] arr) {
        Double counter = 0.00;

        for (Integer val: arr) {
            counter+=val;
        }

        Double avrg = (counter/arr.length);
        return  decimalFormater(avrg, "#.######");
    }

    public int getLenthOfArray(Integer[] arr) {
        return arr.length;
    }
}
