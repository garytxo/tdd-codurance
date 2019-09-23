package com.greyfinch.tdd.exercise_02;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@RunWith(JUnitParamsRunner.class)
public class RomanNumberConverterShould {

    private RomanNumberConverter romanNumberConverter = new RomanNumberConverter();

    @Test
    @Parameters({
            "1, I",
            "2, II",
            "5, V",
            "30, XXX",
            "34, XXXIV",
            "35, XXXV"

    })
    public void converts_arabic_to_roman_numerial(int arabic, String roman) {

        assertThat(romanNumberConverter.convert(arabic), is(equalTo(roman)));

    }

    @Test
    public void converts_one_into_I() {

        String expected = "I";

        assertThat(romanNumberConverter.convert(1), is(equalTo(expected)));

    }

    @Test
    public void converts_2_into_II() {

        String expected = "II";

        assertThat(romanNumberConverter.convert(2), is(equalTo(expected)));

    }

    @Test
    public void converts_5_into_V() {

        String expected = "V";

        assertThat(romanNumberConverter.convert(5), is(equalTo(expected)));

    }


    @Test
    public void converts_6_into_VI() {

        String expected = "VI";

        assertThat(romanNumberConverter.convert(6), is(equalTo(expected)));

    }


    @Test
    public void converts_7_into_VII() {

        String expected = "VII";

        assertThat(romanNumberConverter.convert(7), is(equalTo(expected)));

    }

    @Test
    public void converts_10_into_X() {

        String expected = "X";

        assertThat(romanNumberConverter.convert(10), is(equalTo(expected)));

    }

    @Test
    public void converts_11_into_XI() {

        String expected = "XI";

        assertThat(romanNumberConverter.convert(11), is(equalTo(expected)));

    }

    @Test
    public void converts_12_into_XII() {

        String expected = "XII";

        assertThat(romanNumberConverter.convert(12), is(equalTo(expected)));

    }

    @Test
    public void converts_16_into_XVI() {

        String expected = "XVI";
        String result = romanNumberConverter.convert(16);
        System.out.println(result);
        assertThat(result, is(equalTo(expected)));

    }


}
