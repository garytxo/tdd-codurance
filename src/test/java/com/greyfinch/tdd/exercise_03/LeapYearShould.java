package com.greyfinch.tdd.exercise_03;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@RunWith(JUnitParamsRunner.class)
public class LeapYearShould {

    //https://github.com/tekavec/LeapYearKata/blob/master/LeapYear/Year.cs
    @Test
    @Parameters({
            "2000, true",
            "2001, false"

    })
    public void divisible_by_400(int year, boolean result){


        Year theYear = new Year(year);

        assertThat(theYear.isDivisbleBy400(),is(result));
    }



}
