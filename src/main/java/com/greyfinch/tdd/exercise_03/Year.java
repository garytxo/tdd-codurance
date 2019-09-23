package com.greyfinch.tdd.exercise_03;

public class Year {

    private int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isDivisbleBy400() {

        return year%400==0;
    }
}
