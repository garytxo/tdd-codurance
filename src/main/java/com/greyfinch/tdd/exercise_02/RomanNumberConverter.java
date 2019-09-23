package com.greyfinch.tdd.exercise_02;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumberConverter {

    LinkedHashMap<Integer, String> arabicToNumbers = new LinkedHashMap<Integer, String>();
    {
        arabicToNumbers.put(10, "X");
        arabicToNumbers.put(9, "IX");
        arabicToNumbers.put(5, "V");
        arabicToNumbers.put(4, "IV");
        arabicToNumbers.put(1, "I");


    }


    public String convert(Integer digits) {

        StringBuilder response = new StringBuilder();

        for (Map.Entry<Integer, String> entry : arabicToNumbers.entrySet()) {
            while (digits >= entry.getKey()) {
                response.append(entry.getValue());
                digits -= entry.getKey();
            }

        }

        return response.toString();
    }

}
