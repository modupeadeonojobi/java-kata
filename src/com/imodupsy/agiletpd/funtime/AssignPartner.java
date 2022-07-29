package com.imodupsy.agiletpd.funtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author iModupsy
 * @created 29/07/2022
 */
public class AssignPartner {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("iModupsy");
        nameList.add("Chijioke");
        nameList.add("David");
        nameList.add("Taofiq");
        nameList.add("Marynoir");
        nameList.add("Eze");
        nameList.add("Chinedu");
        pick(nameList);
    }

    public static void pick(List<String> nameList) {
        Collections.shuffle(nameList);

        for (int i = 0; i < nameList.size() - 1 ; i++) {
            if (i == 0 && nameList.size() % 2 != 0) {
                String[] namePair = {nameList.get(0), nameList.get(1), nameList.get(2)};
                System.out.println(Arrays.toString(namePair));
                i = 3;
            }
            String[] namePair = {nameList.get(i), nameList.get(i += 1)};
            System.out.println(Arrays.toString(namePair));
        }

        /**
         * SECOND SOLUTION
         */

//        int loopIndex = 0;
//        if (nameList.size() % 2 != 0) {
//            String[] namePair = {nameList.get(0), nameList.get(1), nameList.get(2)};
//            paired.add(namePair);
//            System.out.println(Arrays.toString(namePair));
//            loopIndex = 3;
//        }
//
//        for (int i = loopIndex; i < nameList.size() - 1 ; i+=2) {
//            String[] namePair = {nameList.get(i), nameList.get(i + 1)};
//            paired.add(namePair);
//            System.out.println(Arrays.toString(namePair));
//        }
    }


}
