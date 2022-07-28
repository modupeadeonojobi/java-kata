package com.imodupsy.agiletpd.funtime;

import java.util.*;

/**
 * @author iModupsy
 * @created 27/07/2022
 */
public class AssignPartner {


    public static void main(String[] args) {
        pick();
    }

    public static void pick() {
        List<String> nameList = new ArrayList<>();
        nameList.add("Modupe");
        nameList.add("Chijioke");
        nameList.add("David");
        nameList.add("Tao");
        nameList.add("Mary");
        nameList.add("Eze");
        nameList.add("Ihe");

        List<String[]> paired = new ArrayList<>();

        Collections.shuffle(nameList);
        for (int i = 0; i < nameList.size() - 1 ; i++) {
            if (i == 0 && nameList.size() % 2 != 0) {
                String[] namePair = {nameList.get(i),  nameList.get(i+=1),  nameList.get(i+=2)};
                paired.add(namePair);
                System.out.println(Arrays.toString(namePair));
            }
            String[] namePair = {nameList.get(i),  nameList.get(i+=1)};
            paired.add(namePair);
            System.out.println(Arrays.toString(namePair));

        }

    }


}
